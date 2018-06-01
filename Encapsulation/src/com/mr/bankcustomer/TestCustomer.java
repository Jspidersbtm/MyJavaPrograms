package com.mr.bankcustomer;

public class TestCustomer {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustId(28);
		c.setName("Mahesh");
		c.setPhoneNo(9900339877L);

		System.out.println(c.getCustId());
		System.out.println(c.getName());
		System.out.println(c.getPhoneNo());

	}
}
