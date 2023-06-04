package com.ms;

import lombok.Data;

@Data
public class CountryInfo {
	
		private int cCode;
		private String cName;
		
		public CountryInfo(int cCode,String cName) {
			this.cCode=cCode;
			this.cName=cName;
		}
//		public static  CountryInfo getCountry() {
//			
//			CountryInfo info=new CountryInfo(101,"dubai");
//			return info;
//			
//		}
}
