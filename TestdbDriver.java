package test;

import java.util.Random;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestdbDriver {
	//тестируем метод getUser (получает объект из бд);
	@Test
	public void getUsertest(String login, String pass) { 
		//dbDriver.getUser(login,pass);
		Boolean result = new Random().nextBoolean();
		assertEquals(true,result);                         
	}
	//тестируем метод setUser  (добавляет объект в бд)
	@Test
	public void setUsertest(User user) {
		//dbDriver.setUser(user)
		Boolean result = new Random().nextBoolean();
		assertEquals(true,result);
	}
}
