package com.gpengtao.tx.dao;

import com.gpengtao.tx.model.Person;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

/**
 * @author pengtao.geng on 2019-05-09 23:26
 */
public interface PersonDao {

	@Insert("insert into person(`name` , `age`) value (#{name} , #{age})")
	void insertOne(Person person);

	@Delete("delete from person where 1=1")
	void deleteAll();
}
