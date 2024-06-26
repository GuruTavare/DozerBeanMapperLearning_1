package com.prowings.source;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
	private String name;
	private int age;
	private String address;
	private int role;
	//in Epoch
	private long birthDate;
}
