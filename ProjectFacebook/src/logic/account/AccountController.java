package logic.account;

import java.util.regex.*;

import logic.dbDriver.dbAccDriver;


public class AccountController {
	private dbAccDriver driver = new dbAccDriver();
	
	public boolean checkLogin(String login) {
		if(login == null)return false;
		String slogin = "[a-zA-Z-_][a-zA-Z0-9-_]{4,20}";
		Pattern p = Pattern.compile(slogin);
		Matcher m = p.matcher(login);
		return m.matches()?true:false;
	}
	
	public boolean checkPass(String pass){
		if(pass == null)return false;
		String spass = "[a-zA-Z0-9-_]{4,20}";
		Pattern p = Pattern.compile(spass);
		Matcher m = p.matcher(pass);
		return m.matches()?true:false;
	}
	
	public boolean isLoginExists(String login){
		if(login == null)return true;
		Account user = driver.getUserByLogin(login);
		return user==null?true:false;
	}
	
	public Account doAuthorize(String login, String pass){
		if(login == null || pass == null) return null;
        return driver.getUserByLoginAndPass(login, pass);
	}
	
	public Account doRegister(String login, String pass){
		if(login == null || pass == null) return null;
		if(!(checkLogin(login)&&checkPass(pass)&&isLoginExists(login))){return null;}
		Account acc = new Account(login,pass);
		if(driver.setUser(acc)){
			return driver.getUserByLogin(login);
		}
		else return null;
	}
}
	
		   
	
		   
		
		
