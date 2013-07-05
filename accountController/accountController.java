package accountController;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import dbDriver.*;
import account.*;



public class accountController {
        //проверка логина на валидность
		public void checkLogin(String userLogin) {
		
			
			
			String sLogin = "[a-zA-Z-_][a-zA-Z0-9-_]{1,20}";
			
			Pattern p = Pattern.compile(sLogin);
			Matcher m = p.matcher(userLogin.toLowerCase());

		    String Result = m.matches()?sLogin + ": passed.":sLogin + ": not passed.";

			System.out.println(Result);
		}
		
				
        //проверка пароля на валидность
		public void checkPassword(String userPassword){
		
			
			String sPassword = "[A-Z0-9][a-z0-9][a-zA-Z0-9]{6,20}";
			
			Pattern p = Pattern.compile(sPassword);
			Matcher m = p.matcher(userPassword.toLowerCase());

		    String Result = m.matches()?sPassword + ": passed.":sPassword + ": not passed.";

			System.out.println(Result);
		}
		
		
		//существование логина в базе
		public void isLogiExist(String userLogin){
			
			dbAccDriver db = new dbAccDriver();
			Account account = new Account();
			if(db.getUserByLogin(userLogin).equals(null))
				System.out.println("подходящий логин");
				System.out.println("недопустимый логин");
				
				db.setUser(account);  //запись в базу
		}
			//авторизация
		public void doAutorise(String userLogin, String userPassword ){
			
			dbAccDriver db = new dbAccDriver();
			if(db.getUserByLoginAndPass(userLogin, userPassword).equals(null))
				System.out.println("Авторизованы");
				System.out.println("error");
				
			
					
		}

}
