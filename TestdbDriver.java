package test;

import java.util.Random;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestdbDriver {
	//��������� ����� getUser (�������� ������ �� ��);
	@Test
	public void getUsertest(String login, String pass) { 
		//dbDriver.getUser(login,pass);
		Boolean result = new Random().nextBoolean();
		assertEquals(true,result);                         
	}
	//��������� ����� setUser  (��������� ������ � ��)
	@Test
	public void setUsertest(User user) {
		//dbDriver.setUser(user)
		Boolean result = new Random().nextBoolean();
		assertEquals(true,result);
	}
}
