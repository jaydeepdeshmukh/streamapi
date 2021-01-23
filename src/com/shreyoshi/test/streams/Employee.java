package com.shreyoshi.test.streams;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	List<Address> addrList = new ArrayList<Address>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Address> getAddrList() {
		return addrList;
	}
	public void setAddrList(List<Address> addrList) {
		this.addrList = addrList;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addrList=" + addrList + "]";
	}	
}
