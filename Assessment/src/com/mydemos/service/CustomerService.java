package com.mydemos.service;

import com.mydemos.dao.CustomerDao;
import com.mydemos.pojos.Customer;

public class CustomerService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao = new CustomerDao();
		Customer customer = new Customer("Ashish","Kumar","BLR");
		System.out.println(dao.saveCustomer(customer));

	}

}
