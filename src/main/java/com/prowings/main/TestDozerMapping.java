package com.prowings.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;

import com.prowings.source.Address;
import com.prowings.source.Person;
import com.prowings.source.Student;
import com.prowings.target.CandidateDTO;
import com.prowings.target.EmployeeDTO;

public class TestDozerMapping {

	public static void main(String[] args) {

		Person person = new Person("Ram", 29, "Pune",2,954547200);

		DozerBeanMapper beanMapper = new DozerBeanMapper();
		beanMapper.setMappingFiles(Arrays.asList("Dozer-Mapper.xml"));

		EmployeeDTO dto = beanMapper.map(person, EmployeeDTO.class);
		System.out.println(dto);
		
		Address address1 = new Address(123, "pune", "India");
		Address address2 = new Address(23, "mumbai", "India");
		Address address3 = new Address(123, "pune", "India");
		
		List<Address> addresses= new ArrayList<>();
		addresses.add(address1);
		addresses.add(address2);
		addresses.add(address3);
		
		Student student = new Student(1, "Bharat", addresses);
		
		CandidateDTO candidateDTO = beanMapper.map(student, CandidateDTO.class);
		
		System.out.println(candidateDTO);

	}

}
