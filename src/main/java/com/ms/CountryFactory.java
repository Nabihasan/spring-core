package com.ms;

public class CountryFactory {
	//if method is static
//		public static  CountryInfo getCountry() {
//				
//				CountryInfo info=new CountryInfo(101,"china");
//			return info;
//		}
	
	// what is method is not static
	
	public CountryInfo getCountry() {
		CountryInfo info=new CountryInfo(102,"saudi");
		return info;
	}
}
