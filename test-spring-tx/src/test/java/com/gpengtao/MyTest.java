package com.gpengtao;

import com.gpengtao.tx.model.Person;
import com.gpengtao.tx.service.PersonService;
import org.assertj.core.util.Lists;
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

	/**
	 * 删除数据
	 */
	@Test
	public void delete_old_rows() {
		personService.deleteAll();
	}

	/**
	 * 事务ok，普通
	 */
	@Test
	public void test_tx_work_by_normal() {
		personService.saveNormal(mockPersonList());
	}

	/**
	 * 事务ok，硬编码，使用proxy
	 */
	@Test
	public void test_tx_work_by_proxy() {
		personService.saveByProxy(mockPersonList());
	}

	/**
	 * 事务不ok，多线程并发
	 */
	@Test
	public void test_tx_not_work_by_multi_thread() {
		personService.saveParallel(mockPersonList());
	}

	/**
	 * 事务方法 调用非事务方法，事务会传播
	 */
	@Test
	public void test_tx_work_by_tx_and_no_tx() {
		personService.saveByTxAndNoTx();
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
