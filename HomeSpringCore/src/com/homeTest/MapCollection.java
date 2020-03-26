package com.homeTest;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapCollection {
	int sid;
	String sname;
	Map<String,String>test_details;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Map<String, String> getTest_details() {
		return test_details;
	}
	public void setTest_details(Map<String, String> test_details) {
		this.test_details = test_details;
	}
	@Override
	public String toString() {
		return "MapCollection [sid=" + sid + ", sname=" + sname + ", test_details=" + test_details + "]";
	}
	
	public void display() {
		
		System.out.println("Sid :"+sid);
		System.out.println("Sname :"+sname);
		System.out.println("\n");
		Set<Entry<String,String>> set=test_details.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		while(itr.hasNext())
		{ 
			Entry<String,String>entry=itr.next();
			System.out.println("Test_List :"+entry.getKey()+"Attende : "+entry.getValue());
			
		}
		
	}

}
