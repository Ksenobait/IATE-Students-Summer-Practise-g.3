package tests;


import static org.junit.Assert.*;
import org.junit.Test;
import logic.account.Account;
import logic.dbDriver.dbAccDriver;


public class TestdbAccDriver {
	
	/*
	 * ��������� ����� getUser (�������� ������ �� ��);
	 */
	@Test
	public void getUserByLoginAndPasstest1() { 
		String login = "mtwad";											//����� ������ ������� ���������� � ����
		String pass = "assholes";				
		dbAccDriver instance = new dbAccDriver();	
		Account user = instance.getUserByLoginAndPass(login, pass); 	//������� �� ��� ����� �� ����
		assertEquals(login,user.getlogin());							//���������� �� ������, �.�. ����� ���������� ���������� ������ � ����
	}                    
	@Test
	public void getUserByLoginAndPasstest2() { 
		String login = "mtwad1";										//����� ������ ������� �� ���������� � ����
		String pass = "assholes";				
		dbAccDriver instance = new dbAccDriver();	
		Account user = instance.getUserByLoginAndPass(login, pass); 	//������� �� ��� ����� �� ����
		assertEquals(null,user);										
	}
	@Test
	public void getUserByLoginAndPasstest3() { 
		String login = "mtwad";											//����� ������ ������� �� ���������� � ����
		String pass = "assholes1";				
		dbAccDriver instance = new dbAccDriver();	
		Account user = instance.getUserByLoginAndPass(login, pass); 	
		assertEquals(null,user);										
	}
	/*
	 * ��������� ����� getUserByLogin
	 */
	@Test
	public void getUserByLogintest1() { 
		String login = "mtwad";											//����� ������ ������� ���������� � ����				
		dbAccDriver instance = new dbAccDriver();	
		Account user = instance.getUserByLogin(login); 					//������� �� ��� ����� �� ����
		assertEquals(login,user.getlogin());							//���������� �� ������, �.�. ����� ���������� ���������� ������ � ����
	}                    
	@Test
	public void getUserByLogintest2() { 
		String login = "mtwad1";														
		dbAccDriver instance = new dbAccDriver();	
		Account user = instance.getUserByLogin(login); 					
		assertEquals(null,user);										
	}
	/*
	 * ��������� ����� setUser (��������� ������ � ��)
	 */
	@Test
	public void setUsertest1() { 
		String login = "Test12";										//����� ����� ������ (���������� ������ ��� ������� AccountController) 
		String pass = "asshol2";
		Account user = new Account(login, pass); 
		dbAccDriver instance = new dbAccDriver();
		boolean result = instance.setUser(user);						//�������� �������� ������ � ����
			if(result == true){											//���� ��������
				Account user2 = instance.getUserByLogin(login);			//�������� �������� ���� ������
				assertEquals(login,user2.getlogin());					//���� ������ ��������� - �����
			}
			else{fail();}
	}
	@Test
	public void setUsertest2() { 
		Account user = null;
		dbAccDriver instance = new dbAccDriver();
		boolean result = instance.setUser(user);						//�������� �������� null
		assertFalse(result);                                			//���� �� ������ �������� - �����
	}													
}
	
		 
		
		
	   
	
