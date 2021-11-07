package com.actitime.ContactTestScripts;

import org.testng.annotations.Test;

public class ContactModule {
	
	@Test(groups = {"smoketest"})
	public void createContact() {
		System.out.println("create Organisation");
		String URL = System.getProperty("url");
		System.out.println(URL);
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		
	}
	
	@Test(groups = {"regression"})
	public void modifyContact() {
		System.out.println("modify Organisation");
		
		
	}
	
	@Test(groups = {"regression"})
	public void deleteContact() {
		System.out.println("delete Organisation");
		
		
	}
	

}
