package tests;


import static org.junit.Assert.*;
import org.junit.Test;
import logic.account.Account;
import logic.dbDriver.dbAccDriver;


public class TestdbAccDriver {
	
	/*
	 * тестируем метод getUser (получает объект из бд);
	 */
	@Test
	public void getUserByLoginAndPasstest1() { 
		String login = "mtwad";											//берем данные которые существуют в базе
		String pass = "assholes";				
		dbAccDriver instance = new dbAccDriver();	
		Account user = instance.getUserByLoginAndPass(login, pass); 	//достаем по ним юзера из базы
		assertEquals(login,user.getlogin());							//сравниваем по логину, т.к. логин однозначно определяет запись в базе
	}                    
	@Test
	public void getUserByLoginAndPasstest2() { 
		String login = "mtwad1";										//берем данные которые не существуют в базе
		String pass = "assholes";				
		dbAccDriver instance = new dbAccDriver();	
		Account user = instance.getUserByLoginAndPass(login, pass); 	//достаем по ним юзера из базы
		assertEquals(null,user);										
	}
	@Test
	public void getUserByLoginAndPasstest3() { 
		String login = "mtwad";											//берем данные которые не существуют в базе
		String pass = "assholes1";				
		dbAccDriver instance = new dbAccDriver();	
		Account user = instance.getUserByLoginAndPass(login, pass); 	
		assertEquals(null,user);										
	}
	/*
	 * тестируем метод getUserByLogin
	 */
	@Test
	public void getUserByLogintest1() { 
		String login = "mtwad";											//берем данные которые существуют в базе				
		dbAccDriver instance = new dbAccDriver();	
		Account user = instance.getUserByLogin(login); 					//достаем по ним юзера из базы
		assertEquals(login,user.getlogin());							//сравниваем по логину, т.к. логин однозначно определяет запись в базе
	}                    
	@Test
	public void getUserByLogintest2() { 
		String login = "mtwad1";														
		dbAccDriver instance = new dbAccDriver();	
		Account user = instance.getUserByLogin(login); 					
		assertEquals(null,user);										
	}
	/*
	 * тестируем метод setUser (добавляет объект в бд)
	 */
	@Test
	public void setUsertest1() { 
		String login = "Test12";										//берем любые данные (невалидные должен был отсеять AccountController) 
		String pass = "asshol2";
		Account user = new Account(login, pass); 
		dbAccDriver instance = new dbAccDriver();
		boolean result = instance.setUser(user);						//пытаемся записать объект в базу
			if(result == true){											//если записали
				Account user2 = instance.getUserByLogin(login);			//пытаемся вытащить этот объект
				assertEquals(login,user2.getlogin());					//если логины совпадают - успех
			}
			else{fail();}
	}
	@Test
	public void setUsertest2() { 
		Account user = null;
		dbAccDriver instance = new dbAccDriver();
		boolean result = instance.setUser(user);						//пытаемся записать null
		assertFalse(result);                                			//если не смогли записать - успех
	}													
}
	
		 
		
		
	   
	
