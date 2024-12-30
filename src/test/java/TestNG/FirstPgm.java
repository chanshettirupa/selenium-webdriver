package TestNG;

import org.testng.annotations.Test;

/*
 * 1) Open APP
 * 2) Login
 * 3) Logout
 */


public class FirstPgm {
	
	@Test(priority=-1)
	void openApp() {
		System.out.println("Open APp");
	}
	
	@Test(priority=0)
	void login() {
		System.out.println("login to APp");
	}
	
	@Test(priority=1)
	void logout() {
		System.out.println("logout the APp");
	}
	
	

}
