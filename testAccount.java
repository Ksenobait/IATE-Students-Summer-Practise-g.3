package account_controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

@Test
	public void testKeyboard() {
		Account testAcc = new Account();
		System.out.println("¬ведите логин login, пароль pass");
		try {
			testAcc.inputData();	
			assertEquals(testAcc.getLogin(), "login");
			assertEquals(testAcc.getPassword(), "pass");
			
		}
		catch (Exception e)
		{
			
		}
		
		
	}
	
	public void testArray()
	{
		Account testAcc = new Account();
		String loginString  = "Login";
		String passString  = "Pass";
		testAcc.setLogin(loginString);
		testAcc.setPassword(passString);
		assertEquals(testAcc.getLogin(), loginString);
		assertEquals(testAcc.getPassword(), passString);
	}
	

}
