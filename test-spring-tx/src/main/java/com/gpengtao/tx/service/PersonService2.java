package com.gpengtao.tx.service;

import com.gpengtao.tx.dao.PersonDao;
import com.gpengtao.tx.model.Person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author pengtao.geng on 2019-08-30 19:21
 */
@Service
public class PersonService2 {

	@Resource
	private PersonDao personDao;

	public void saveNoTx() {
		Person person1 = Person.builder()
				.name("john2")
				.age(22)
				.build();
		personDao.insertOne(person1);
	}
}
