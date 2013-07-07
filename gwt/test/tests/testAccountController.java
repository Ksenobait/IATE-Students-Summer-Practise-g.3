package tests;


import static org.junit.Assert.*;
import logic.account.AccountController;
import org.junit.Test;

public class testAccountController {
	/*
	 * ��������� ����� checkLogin
	 */
	@Test  
	public void checkLoginTest1() {
		AccountController instance = new AccountController();
		String login = "abcde123";//����� ����� ������� ��������
		boolean result = instance.checkLogin(login);
		assertTrue(result);
	}
	@Test  
	public void checkLoginTest2() {
		AccountController instance = new AccountController();
		String login = "123abcde";//����� ����� �� ������� ��������
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	@Test 
	public void checkLoginTest3() {
		AccountController instance = new AccountController();
		String login = "";//����� ����� �� ������� ��������
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	@Test 
	public void checkLoginTest4() {
		AccountController instance = new AccountController();
		String login = "a";//����� ����� �� ������� ��������
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	@Test 
	public void checkLoginTest5() {
		AccountController instance = new AccountController();
		String login = "abcdefchoiekdsfkwejowqeojkdfsdskjf";//����� ����� �� ������� ��������
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	@Test 
	public void checkLoginTest6() {
		AccountController instance = new AccountController();
		String login = "asd:;;;;qw&^%^";//����� ����� �� ������� ��������
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	@Test 
	public void checkLoginTest7() {
		AccountController instance = new AccountController();
		String login = null;//����� ����� �� ������� ��������
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	/*
	 * ��������� ����� checkPass
	 */
	@Test 
	public void checPassTest1() {
		AccountController instance = new AccountController();
		String pass = "12345"; //����� ������ ������� ��������
		boolean result = instance.checkPass(pass);
		assertTrue(result);
	}
	@Test 
	public void checPassTest2() {
		AccountController instance = new AccountController();
		String pass = "12345abcd";//����� ������ ������� ��������
		boolean result = instance.checkPass(pass);
		assertTrue(result);
	}
	@Test 
	public void checPassTest3() {
		AccountController instance = new AccountController();
		String pass = ""; //����� ������ �� ������� ��������
		boolean result = instance.checkPass(pass);
		assertFalse(result);
	}
	@Test 
	public void checPassTest4() {
		AccountController instance = new AccountController();
		String pass = "jsdf:::;;;;;w"; //����� ������ �� ������� ��������
		boolean result = instance.checkPass(pass);
		assertFalse(result);
	}
	@Test 
	public void checPassTest5() {
		AccountController instance = new AccountController();
		String pass = "123456789012345678901234567890"; //����� ������ �� ������� ��������
		boolean result = instance.checkPass(pass);
		assertFalse(result);
	}
	@Test 
	public void checPassTest6() {
		AccountController instance = new AccountController();
		String pass = "jsd"; //����� ������ �� ������� ��������
		boolean result = instance.checkPass(pass);
		assertFalse(result);
	}
	@Test 
	public void checPassTest7() {
		AccountController instance = new AccountController();
		String pass = null; //����� ������ �� ������� ��������
		boolean result = instance.checkPass(pass);
		assertFalse(result);
	}
	/*
	 * ��������� ����� isLoginExists
	 */
	@Test
	public void isLoginExistsTest1(){
		String login = "mtwad"; //���� � ����
		AccountController instance = new AccountController();
		boolean result = instance.isLoginExists(login);
		assertFalse(result);	
    }
	@Test
	public void isLoginExistsTest2(){
		String login = "Almaz"; //��� � ����
		AccountController instance = new AccountController();
		boolean result = instance.isLoginExists(login);
		assertTrue(result);	
    }
	@Test
	public void isLoginExistsTest3(){
		String login = null; //��� � ����
		AccountController instance = new AccountController();
		boolean result = instance.isLoginExists(login);
		assertTrue(result);	
    }
	/*
	 * ��������� ����� doAuthorize
	 */
	@Test 
	public void doAuthorizeTest1(){
		String login = "mtwad"; //���� � ����
		String pass = "assholes"; //������ ������
		AccountController instance = new AccountController();
		boolean result = instance.doAuthorize(login,pass);
		assertTrue(result);
	}
	@Test 
	public void doAuthorizeTest2(){
		String login = "mtwad"; //���� � ����
		String pass = "assholes1"; //�������� ������
		AccountController instance = new AccountController();
		boolean result = instance.doAuthorize(login,pass);
		assertFalse(result);
		
	}
	@Test 
	public void doAuthorizeTest3(){
		String login = "mtwad1"; //��� � ����
		String pass = "assholes"; 
		AccountController instance = new AccountController();
		boolean result = instance.doAuthorize(login,pass);
		assertFalse(result);
	}
	@Test 
	public void doAuthorizeTest4(){
		String login = null;
		String pass = null; 
		AccountController instance = new AccountController();
		boolean result = instance.doAuthorize(login,pass);
		assertFalse(result);
	}
	/*
	 * ��������� ����� doRegister
	 */
	@Test
	public void doRegisterTest1(){
		String login="mtwad2"; //���������� (��� � ����, ��������)
		String pass="assholes"; //����������
        AccountController instance = new AccountController();
		boolean result = instance.doRegister(login,pass);
		assertTrue(result);
	}
	@Test
	public void doRegisterTest2(){
		String login="mtwad&^&:;2"; //������������ (��� � ����, ����������)
		String pass="assholes"; //����������
        AccountController instance = new AccountController();
		boolean result = instance.doRegister(login,pass);
		assertFalse(result);
	}
	@Test
	public void doRegisterTest3(){
		String login="mtwad"; //������������ (���� � ����, ��������)
		String pass="assholes"; //����������
        AccountController instance = new AccountController();
		boolean result = instance.doRegister(login,pass);
		assertFalse(result);
	}
	@Test
	public void doRegisterTest4(){
		String login = null; 
		String pass = null;
        AccountController instance = new AccountController();
		boolean result = instance.doRegister(login,pass);
		assertFalse(result);
	}
	@Test
	public void doRegisterTest5(){
		String login="mtwad2"; //���������� (��� � ����, ��������)
		String pass="assholes;^&*"; //������������
        AccountController instance = new AccountController();
		boolean result = instance.doRegister(login,pass);
		assertFalse(result);
	}

}
