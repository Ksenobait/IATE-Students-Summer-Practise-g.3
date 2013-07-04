package account_controller;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
	
	private String Login;
	private String Password;
	
	public void setLogin (String in)
	{
		this.Login = in;
	}
	
	public void setPassword (String in)
	{
		this.Password = in;
	}
	
	public String getLogin ()
	{
		return this.Login;
	}
	
	public String getPassword ()
	{
		return this.Password;
	}

	public void inputData() throws IOException{
		
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		this.setLogin(a.readLine());
		System.out.println("inputLogin="+this.getLogin());
		
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		this.setPassword(b.readLine());
		System.out.println("inputPassword"+this.getPassword());
		}
	
	public static void checkLogin(String userLogin) {
		
		String sLogin = "[a-zA-Z][a-zA-Z0-9]{1,20}";
		
		Pattern p = Pattern.compile(sLogin);
		Matcher m = p.matcher(userLogin.toLowerCase());

		String Result = m.matches()?sLogin + ": passed.":sLogin + ": not passed.";

		System.out.println(Result);
		}
	
	public static Boolean isLoginExist(String userLogin){
		  ArrayList<String> allLoginList = new ArrayList<String>();
		  allLoginList.add("");
		  allLoginList.add("abc");
		  allLoginList.add("                                                            ");
		  allLoginList.add("abcde");
		  allLoginList.add("abcde-advde");
		  allLoginList.add("abcde_abcde");
		  allLoginList.add("abcde/abcde");
		  allLoginList.add("12345");
		  allLoginList.add("/*-=+-&^%$#@!()");
		  allLoginList.add("ABCDE");
		  allLoginList.add("AB!1233-ab");
		  allLoginList.add("admin-admin@mail.ru");
		  
		  if(allLoginList.contains(userLogin)){
			  return true;
		  }
		  else{
			  
		 return null;
		
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
		  }
	public void testArray()
	{
		Account testAcc = new Account();
		String loginString  = "Login";
		String passString  = "Pass";
		testAcc.setLogin(loginString);
		testAcc.setPassword(passString);
	
	}
	
	public String doAuthorize(String Login, String Password){
		
		
		
		ArrayList<String> allLoginList = new ArrayList<String>();
		  allLoginList.add("");
		  allLoginList.add("abc");
		  allLoginList.add("                                                            ");
		  allLoginList.add("abcde");
		  allLoginList.add("abcde-advde");
		  allLoginList.add("abcde_abcde");
		  allLoginList.add("abcde/abcde");
		  allLoginList.add("12345");
		  allLoginList.add("/*-=+-&^%$#@!()");
		  allLoginList.add("ABCDE");
		  allLoginList.add("AB!1233-ab");
		  allLoginList.add("admin-admin@mail.ru");
		  allLoginList.add("    ");
		  allLoginList.add("25436365474575757457457");
		  
		  if( isLoginExist(Login)==true){
			  return "session id";
		   }
		  else{
			  return " ";
	       }	  
		}
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkLogin("abcde123");
		checkLogin("cuchka.1");
		checkLogin("#4lkj");
		checkLogin("a");
		checkLogin("");
		checkLogin("sdfghdfhjsdfghfghsfghsfghsfghsf");
		checkLogin("1sdffe");
		
		  }
		} 
	

