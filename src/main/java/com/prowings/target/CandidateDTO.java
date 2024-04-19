package com.prowings.target;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CandidateDTO {

	private int id;
	private String completeName;

	// here we can use Array, Set etc

	// private AddressDTO[] correspondence;
	
	private Set<AddressDTO> correspondence;

}
