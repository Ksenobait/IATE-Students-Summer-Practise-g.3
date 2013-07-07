package tests;


import java.util.ArrayList;

import accountController.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class testaccountController {
	

	@Test  
	public void checkLoginTest1() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userLogin = "abcde "; //допустимый
		x=AccTest.checkLogin(userLogin);
		assertEquals(true, x);
	
	}
	@Test 
	public void checkLoginTest2() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userLogin = ""; //недопустимый
		x=AccTest.checkLogin(userLogin);
		assertEquals(false, x);
	}
	@Test 
	public void checkLoginTest3() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userLogin = "1"; //недопустимый
		x=AccTest.checkLogin(userLogin);
		assertEquals(false, x);
	}
	
	@Test 
	public void checPassTest1() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userPass = ""; //недопустимый
		x=AccTest.checkPass(userPass);
		assertEquals(false, x);
	}
		
	@Test 
	public void checPassTest2() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userPass = "0978665767546"; //допустимый
		x=AccTest.checkPass(userPass);
		assertEquals(true, x);
	}
	
	@Test 
	public void checPassTest3() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userPass = "132515euehr"; //допустимый
		x=AccTest.checkPass(userPass);
		assertEquals(true, x);
	}
	
	@Test 
	public void checPassTest4() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userPass = "09786657675464-387kfl;j;fjd;trip"; //недопустимый
		x=AccTest.checkPass(userPass);
		assertEquals(false, x);
	}
	
	
	
	@Test
	public void isLoginExistsTest1(){
		String userLogin = "Almaz"; //есть в базе
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.isLoginExists(userLogin);
		assertEquals(true, x);	
    }
	@Test
	public void isLoginExistsTest2(){
		String userLogin = "Almaz1"; //нет в базе
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.isLoginExists(userLogin);
		assertEquals(false, x);	
    }
	
	@Test 
	public void doAuthorizeTest1(){
		String userLogin="Almaz"; //есть в базе
		String userPass="2968934sp"; //верный пароль
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.doAuthorize(userLogin,userPass);
		assertEquals(true, x);
		
	}
	
	@Test 
	public void doAuthorizeTest2(){
		String userLogin="Almaz"; //есть в базе
		String userPass="2968934sp0"; //неверный пароль
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.doAuthorize(userLogin,userPass);
		assertEquals(false, x);
		
	}
	@Test 
	public void doAuthorizeTest3(){
		String userLogin="Almaz1"; //нет в базе
		String userPass="2968934sp";
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.doAuthorize(userLogin,userPass);
		assertEquals(false, x);
		
	}
	
	@Test
	public void doRegisterTest1(){
		String userLogin="Almaz"; //допустимый (нет в базе, валиденый)
		String userPass="2968934sp"; //допустимый
		boolean x;
        AccountController AccTest = new AccountController();
		x=AccTest.doRegister(userLogin,userPass);
		assertEquals(true, x);

	}
	@Test
	public void doRegisterTest2(){
		String userLogin="Almaz  1"; //недопустимый (нет в базе, невалидный) 
		String userPass="2968934sp"; //допустимый
		boolean x;
        AccountController AccTest = new AccountController();
		x=AccTest.doRegister(userLogin,userPass);
		assertEquals(false, x);

	}
	@Test
	public void doRegisterTest2(){
		String userLogin="Almaz"; //недопустимый (есть в базе, валидный) 
		String userPass="2968934sp"; //допустимый
		boolean x;
        AccountController AccTest = new AccountController();
		x=AccTest.doRegister(userLogin,userPass);
		assertEquals(false, x);

	}
		
		
		
		
		
	

}
