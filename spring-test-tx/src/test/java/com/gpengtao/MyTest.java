package com.gpengtao;

import com.gpengtao.tx.model.Person;
import com.gpengtao.tx.service.PersonService;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pengtao.geng on 2019-05-09 23:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-app-dao.xml"})
public class MyTest {

	@Resource
	private PersonService personService;

	@Before
	public void delete_old_rows() {
		personService.deleteAll();
	}

	@Test
	public void test_tx_work() {
		personService.save(mockPersonList());
	}

	@Test
	public void test_tx_not_work() {
		personService.saveParallel(mockPersonList());
	}

	private static List<Person> mockPersonList() {
		Person person1 = Person.builder()
				.name("john1")
				.age(11)
				.build();

		Person person2 = Person.builder()
				.name("john2")
				.age(22)
				.build();

		Person person3 = Person.builder()
				.name("john3")
				.age(33)
				.build();

		Person person4 = Person.builder()
				.name("john4")
				.age(null)
				.build();
		return Lists.newArrayList(person1, person2, person3, person4);
	}
}
