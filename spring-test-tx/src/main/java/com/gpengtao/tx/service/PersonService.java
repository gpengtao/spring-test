package com.gpengtao.tx.service;

import com.gpengtao.tx.dao.PersonDao;
import com.gpengtao.tx.model.Person;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pengtao.geng on 2019-05-09 23:09
 */
@Service
public class PersonService {

	@Resource
	private PersonDao personDao;

	public void deleteAll() {
		personDao.deleteAll();
	}

	public void saveByProxy(List<Person> persons) {
		PersonService service = (PersonService) AopContext.currentProxy();

		service.saveNormal(persons);
	}

	@Transactional
	public void saveNormal(List<Person> persons) {
		for (Person person : persons) {
			personDao.insertOne(person);
		}
	}

	@Transactional
	public void saveParallel(List<Person> persons) {
		persons.parallelStream().forEach(person -> personDao.insertOne(person));
	}
}
