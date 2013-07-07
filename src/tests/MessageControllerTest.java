package test;

import static org.junit.Assert.*;
import logic.account.Account;
import logic.message.MessageController;

import org.junit.Test;

public class MessageControllerTest {

	@Test
	public void testIsValidMessage() {
		String s1 = "";
		String s2 = "4534tfg43tg 4";
		String s3 = "jgsdjkl dhgvjknui bhgn uiregh ueguehr89ugh 439ug u34hg9uiejrguh "
				+ "9ui34439 jgui349 gui439 guh943g n9ouigi43egun934 hg9i3j4 9gi4jh3ig94ujh3g43g gh9uh"
				+ "9ui34439 jgui349 gui439 guh943g n9ouigi43egun934 hg9i3j4 9gi4jh3ig94ujh3g43g gh9uh"
				+ "9ui34439 jgui349 gui439 guh943g n9ouigi43egun934 hg9i3j4 9gi4jh3ig94ujh3g43g gh9uh"
				+ "9ui34439 jgui349 gui439 guh943g n9ouigi43egun934 hg9i3j4 9gi4jh3ig94ujh3g43g gh9uh";
		assertTrue("Test 1 ne uspeshen", !MessageController.isValidMessage(s1));// пустая строка
		assertTrue("Test 2 ne uspeshen", MessageController.isValidMessage(s2));// строка от 1 до 256 символов
		assertTrue("Test 3 ne uspeshen", !MessageController.isValidMessage(s3));// строка больше 256 символов
	}

	@Test
	public void testSendMessage() {
		assertTrue("Soobshenie ne otpravleno", new MessageController().SendMessage("123", new Account(1, null, null)));
	}

	@Test
	public void testReadMessages() {
		assertTrue("Soobsheniya ne pro4itani", new MessageController().ReadMessages(new Account(1, null, null)).size() > 0);
	}

}
