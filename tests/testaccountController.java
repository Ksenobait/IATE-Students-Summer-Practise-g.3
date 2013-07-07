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
		String userLogin = "abcde "; //����������
		x=AccTest.checkLogin(userLogin);
		assertEquals(true, x);
	
	}
	@Test 
	public void checkLoginTest2() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userLogin = ""; //������������
		x=AccTest.checkLogin(userLogin);
		assertEquals(false, x);
	}
	@Test 
	public void checkLoginTest3() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userLogin = "1"; //������������
		x=AccTest.checkLogin(userLogin);
		assertEquals(false, x);
	}
	
	@Test 
	public void checPassTest1() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userPass = ""; //������������
		x=AccTest.checkPass(userPass);
		assertEquals(false, x);
	}
		
	@Test 
	public void checPassTest2() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userPass = "0978665767546"; //����������
		x=AccTest.checkPass(userPass);
		assertEquals(true, x);
	}
	
	@Test 
	public void checPassTest3() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userPass = "132515euehr"; //����������
		x=AccTest.checkPass(userPass);
		assertEquals(true, x);
	}
	
	@Test 
	public void checPassTest4() {
		
		AccountController AccTest = new AccountController();
		boolean x;
		String userPass = "09786657675464-387kfl;j;fjd;trip"; //������������
		x=AccTest.checkPass(userPass);
		assertEquals(false, x);
	}
	
	
	
	@Test
	public void isLoginExistsTest1(){
		String userLogin = "Almaz"; //���� � ����
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.isLoginExists(userLogin);
		assertEquals(true, x);	
    }
	@Test
	public void isLoginExistsTest2(){
		String userLogin = "Almaz1"; //��� � ����
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.isLoginExists(userLogin);
		assertEquals(false, x);	
    }
	
	@Test 
	public void doAuthorizeTest1(){
		String userLogin="Almaz"; //���� � ����
		String userPass="2968934sp"; //������ ������
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.doAuthorize(userLogin,userPass);
		assertEquals(true, x);
		
	}
	
	@Test 
	public void doAuthorizeTest2(){
		String userLogin="Almaz"; //���� � ����
		String userPass="2968934sp0"; //�������� ������
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.doAuthorize(userLogin,userPass);
		assertEquals(false, x);
		
	}
	@Test 
	public void doAuthorizeTest3(){
		String userLogin="Almaz1"; //��� � ����
		String userPass="2968934sp";
		boolean x;
		AccountController AccTest = new AccountController();
		x=AccTest.doAuthorize(userLogin,userPass);
		assertEquals(false, x);
		
	}
	
	@Test
	public void doRegisterTest1(){
		String userLogin="Almaz"; //���������� (��� � ����, ���������)
		String userPass="2968934sp"; //����������
		boolean x;
        AccountController AccTest = new AccountController();
		x=AccTest.doRegister(userLogin,userPass);
		assertEquals(true, x);

	}
	@Test
	public void doRegisterTest2(){
		String userLogin="Almaz  1"; //������������ (��� � ����, ����������) 
		String userPass="2968934sp"; //����������
		boolean x;
        AccountController AccTest = new AccountController();
		x=AccTest.doRegister(userLogin,userPass);
		assertEquals(false, x);

	}
	@Test
	public void doRegisterTest2(){
		String userLogin="Almaz"; //������������ (���� � ����, ��������) 
		String userPass="2968934sp"; //����������
		boolean x;
        AccountController AccTest = new AccountController();
		x=AccTest.doRegister(userLogin,userPass);
		assertEquals(false, x);

	}
		
		
		
		
		
	

}
