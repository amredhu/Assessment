package com.mydemos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mydemos.dbutil.DbConn;
import com.mydemos.pojos.Customer;

public class CustomerDao {
	
	public int generateCustID() {
		//int seq;
		try {
		Connection con = DbConn.getConnection();
		
		String sql = "select cust_seq.nextval from dual";
		PreparedStatement stat = con.prepareStatement(sql);
		ResultSet seq = stat.executeQuery();
		
		if (seq.next()) {
			return (seq.getInt(1));
		}
		//System.out.println(seq);
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	
	
	public String saveCustomer(Customer customer) {
		try {
			
			String seq_id = "";
			
			Connection con = DbConn.getConnection();
			String sql = "insert into Customer values(?,?,?,?)";
			PreparedStatement stat = con.prepareStatement(sql);
			int seqNum= generateCustID();
			
			if (seqNum<=9) {
			seq_id+=customer.getCustFName().substring(0, 2)+customer.getCustLName().substring(0, 2)+"00"+seqNum;
			customer.setCustID(seq_id);
			}
			else if(seqNum<=99 && seqNum>=10) {
				seq_id+=customer.getCustFName().substring(0, 2)+customer.getCustLName().substring(0, 2)+"0"+seqNum;
				customer.setCustID(seq_id);
			}
			else {
				seq_id+=customer.getCustFName().substring(0, 2)+customer.getCustLName().substring(0, 2)+seqNum;
				customer.setCustID(seq_id);
			}
			stat.setString(1, customer.getCustFName());
			stat.setString(2, customer.getCustLName());
			stat.setString(3, customer.getCustID());
			stat.setString(4, customer.getCustAddress());
			
			int res = stat.executeUpdate();
			if (res>0) {
				return "Customer Saved";
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Customer Not Saved";
	}
	

}
