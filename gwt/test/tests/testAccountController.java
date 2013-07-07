package tests;


import static org.junit.Assert.*;
import logic.account.AccountController;
import org.junit.Test;

public class testAccountController {
	/*
	 * тестируем метод checkLogin
	 */
	@Test  
	public void checkLoginTest1() {
		AccountController instance = new AccountController();
		String login = "abcde123";//такой логин пройдет проверку
		boolean result = instance.checkLogin(login);
		assertTrue(result);
	}
	@Test  
	public void checkLoginTest2() {
		AccountController instance = new AccountController();
		String login = "123abcde";//такой логин не пройдет проверку
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	@Test 
	public void checkLoginTest3() {
		AccountController instance = new AccountController();
		String login = "";//такой логин не пройдет проверку
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	@Test 
	public void checkLoginTest4() {
		AccountController instance = new AccountController();
		String login = "a";//такой логин не пройдет проверку
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	@Test 
	public void checkLoginTest5() {
		AccountController instance = new AccountController();
		String login = "abcdefchoiekdsfkwejowqeojkdfsdskjf";//такой логин не пройдет проверку
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	@Test 
	public void checkLoginTest6() {
		AccountController instance = new AccountController();
		String login = "asd:;;;;qw&^%^";//такой логин не пройдет проверку
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	@Test 
	public void checkLoginTest7() {
		AccountController instance = new AccountController();
		String login = null;//такой логин не пройдет проверку
		boolean result = instance.checkLogin(login);
		assertFalse(result);
	}
	/*
	 * тестируем метод checkPass
	 */
	@Test 
	public void checPassTest1() {
		AccountController instance = new AccountController();
		String pass = "12345"; //такой пароль пройдет проверку
		boolean result = instance.checkPass(pass);
		assertTrue(result);
	}
	@Test 
	public void checPassTest2() {
		AccountController instance = new AccountController();
		String pass = "12345abcd";//такой пароль пройдет проверку
		boolean result = instance.checkPass(pass);
		assertTrue(result);
	}
	@Test 
	public void checPassTest3() {
		AccountController instance = new AccountController();
		String pass = ""; //такой пароль не пройдет проверку
		boolean result = instance.checkPass(pass);
		assertFalse(result);
	}
	@Test 
	public void checPassTest4() {
		AccountController instance = new AccountController();
		String pass = "jsdf:::;;;;;w"; //такой пароль не пройдет проверку
		boolean result = instance.checkPass(pass);
		assertFalse(result);
	}
	@Test 
	public void checPassTest5() {
		AccountController instance = new AccountController();
		String pass = "123456789012345678901234567890"; //такой пароль не пройдет проверку
		boolean result = instance.checkPass(pass);
		assertFalse(result);
	}
	@Test 
	public void checPassTest6() {
		AccountController instance = new AccountController();
		String pass = "jsd"; //такой пароль не пройдет проверку
		boolean result = instance.checkPass(pass);
		assertFalse(result);
	}
	@Test 
	public void checPassTest7() {
		AccountController instance = new AccountController();
		String pass = null; //такой пароль не пройдет проверку
		boolean result = instance.checkPass(pass);
		assertFalse(result);
	}
	/*
	 * тестируем метод isLoginExists
	 */
	@Test
	public void isLoginExistsTest1(){
		String login = "mtwad"; //есть в базе
		AccountController instance = new AccountController();
		boolean result = instance.isLoginExists(login);
		assertFalse(result);	
    }
	@Test
	public void isLoginExistsTest2(){
		String login = "Almaz"; //нет в базе
		AccountController instance = new AccountController();
		boolean result = instance.isLoginExists(login);
		assertTrue(result);	
    }
	@Test
	public void isLoginExistsTest3(){
		String login = null; //нет в базе
		AccountController instance = new AccountController();
		boolean result = instance.isLoginExists(login);
		assertTrue(result);	
    }
	/*
	 * тестируем метод doAuthorize
	 */
	@Test 
	public void doAuthorizeTest1(){
		String login = "mtwad"; //есть в базе
		String pass = "assholes"; //верный пароль
		AccountController instance = new AccountController();
		boolean result = instance.doAuthorize(login,pass);
		assertTrue(result);
	}
	@Test 
	public void doAuthorizeTest2(){
		String login = "mtwad"; //есть в базе
		String pass = "assholes1"; //неверный пароль
		AccountController instance = new AccountController();
		boolean result = instance.doAuthorize(login,pass);
		assertFalse(result);
		
	}
	@Test 
	public void doAuthorizeTest3(){
		String login = "mtwad1"; //нет в базе
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
	 * тестируем метод doRegister
	 */
	@Test
	public void doRegisterTest1(){
		String login="mtwad2"; //допустимый (нет в базе, валидный)
		String pass="assholes"; //допустимый
        AccountController instance = new AccountController();
		boolean result = instance.doRegister(login,pass);
		assertTrue(result);
	}
	@Test
	public void doRegisterTest2(){
		String login="mtwad&^&:;2"; //недопустимый (нет в базе, невалидный)
		String pass="assholes"; //допустимый
        AccountController instance = new AccountController();
		boolean result = instance.doRegister(login,pass);
		assertFalse(result);
	}
	@Test
	public void doRegisterTest3(){
		String login="mtwad"; //недопустимый (есть в базе, валидный)
		String pass="assholes"; //допустимый
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
		String login="mtwad2"; //допустимый (нет в базе, валидный)
		String pass="assholes;^&*"; //недопустимый
        AccountController instance = new AccountController();
		boolean result = instance.doRegister(login,pass);
		assertFalse(result);
	}

}
