package com.prowings.target;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//here we used Equal and Hashcode to avoid duplicate elements and viceversa
//@EqualsAndHashCode
public class AddressDTO {

	private int pincode;
	private String city;
	private String country;

}
