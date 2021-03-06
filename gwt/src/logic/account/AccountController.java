package logic.account;

import java.util.regex.*;

import logic.dbDriver.dbAccDriver;


public class AccountController {
	private dbAccDriver db = new dbAccDriver();
	
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
		Account user = db.getUserByLogin(login);
		return user==null?true:false;
	}
	
	public boolean doAuthorize(String login, String pass){
		if(login == null || pass == null) return false;
        Account user=db.getUserByLoginAndPass(login, pass);
        if (user==null){
			return false;
		}
        return true;
	}
	
	public boolean doRegister(String login, String pass){
		if(login == null || pass == null) return false;
		if(!(checkLogin(login)&&checkPass(pass)&&isLoginExists(login))){return false;}
		Account acc = new Account(login,pass);
		return db.setUser(acc);
	}
		
		
	
	/*public static boolean isLoginExist(String userLogin){
		 
		  ArrayList<String> allLoginLi'hgcst = new ArrayList<String>();
		  allLoginList.add("Oleg");
		  allLoginList.add("Evgeni");
		  allLoginList.add("Ivan");
		  allLoginList.add("Almaz");
		  
		  if(allLoginList.contains(userLogin)){
			  
		   System.out.println("session id");
		  return true;}
		  else{
			  return false;
		  }
			  
	}
	public Boolean isPasswordExist(String userPassword){
		ArrayList<String> allPasswordList = new ArrayList<String>();
		  allPasswordList.add("       ");
		  allPasswordList.add("14153265764856856");
		  allPasswordList.add("gjsrtjtyksytkstyktdy");
		  allPasswordList.add("   547647457  jdjgkj 427457   ");
		  allPasswordList.add("rtytrjrt463567%$^%&^");
		  allPasswordList.add("");
		  
		  if(allPasswordList.contains(userPassword)){
			  return true;
		  }
		  else{
			  
		 return null;
		  	}
		  }*/

	

	
}
	
		   
	
		   
		
		
