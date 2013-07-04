package main;

import dbDriver.*;
import user.*;
public class Main {

	public static void main(String[] args) {
		User vasya = new User(0, "hello", "world");
		User petya = new User(1, "petya", "abcd");
		dbDriver driver = new dbDriver();
		driver.setUser(petya);
		driver.setUser(vasya);
		petya = driver.getUserByLogin("hello", "world");
		vasya = driver.getUserByLogin("petya", "abcd");
	}

}
