package com.ms;

import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class Bill implements InitializingBean {
	
		private int bill;
		private int price;
		private int quantity;
		
		public void compute() {
			quantity=price*bill;
		}

		@Override
		public void afterPropertiesSet() throws Exception {
			compute();
			
		}
}
