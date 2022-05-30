package com.gpengtao.tx.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pengtao.geng on 2019-05-09 23:22
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	private int id;

	private String name;

	private Integer age;
}
