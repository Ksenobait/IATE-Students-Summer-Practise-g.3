package tests;


import java.util.ArrayList;

import accountController.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class testaccountController {
	

	@Test  //существование логина в базе
	public void checkLoginTest1() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userLogin = "abcde";
		x=AccTest.checkLogin(userLogin);
		assertEquals(true, x);
	}
	@Test 
	public void checkLoginTest2() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userLogin = "";
		x=AccTest.checkLogin(userLogin);
		assertEquals(true, x);
	}
	@Test 
	public void checkLoginTest3() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userLogin = "1";
		x=AccTest.checkLogin(userLogin);
		assertEquals(true, x);
	}
	
	@Test 
	public void checPassTest1() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String passLogin = "";
		x=AccTest.checkPass(passLogin);
		assertEquals(true, x);
	}
		
	@Test 
	public void checPassTest2() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String passLogin = "0978665767546";
		x=AccTest.checkPass(passLogin);
		assertEquals(true, x);
	}
	
	@Test 
	public void checPassTest3() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String passLogin = "132515euehr";
		x=AccTest.checkPass(passLogin);
		assertEquals(true, x);
	}
	
	
	
	@Test
	public void isLoginExists(){
		String userLogin = "Almaz";
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.isLoginExists(userLogin);
		assertEquals(true, x);
		
    }
	@Test 
	public void doAuthorizeTest(){
		String userLogin="Almaz";
		String userPass="2968934sp";
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.doAuthorize(userLogin,userPass);
		assertEquals(true, x);
		
	}
	
	@Test
	public void doRegister(){
		String userLogin="Almaz";
		String userPass="2968934sp";
		boolean x;
        AccountController AccTest = new AccountController();
		x=AccTest.doRegister(userLogin,userPass);
		assertEquals(true, x);

	}
		
		
		
		
		
		
	

}
