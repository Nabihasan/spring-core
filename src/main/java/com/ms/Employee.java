package com.ms;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = {"name","address","email","kid","education","project"})
public class Employee {
	
		private int eno;
		private String name;
		private Address address;
		private Set<String> email;
		private Map<String,Integer> kid;
		private Properties education;
		private List<Project> project;
		private Map<String,Address> addresses;
}
