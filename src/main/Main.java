package main;

import message.*;
import account.*;
import dbDriver.*;
public class Main {

	public static void main(String[] args) {
		Account vasya = new Account(0, "hello", "world");
		Account petya = new Account(1, "petya", "abcd");
		Message mes1 = new Message(0,0,"da first message",0);
		/*dbAccDriver driver = new dbAccDriver();
		driver.setUser(petya);
		driver.setUser(vasya);
		petya = driver.getUserByLoginAndPass("hello", "world");
		vasya = driver.getUserByLoginAndPass("petya", "abcd");*/
		dbMessDriver mdriver = new dbMessDriver();
		mdriver.setMessage(mes1);
		vasya = petya;
	}
}
