package logic.account;

import javax.persistence.*;
/*
 * класс User для хранения персональных данных пользователя (переименовать в account?). НЕ ПОЛОН. Аннотации не трогать!
 */
@Entity
@Table(name="users")
public class Account {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	public void setid(Integer id){this.id = id;}
	public Integer getid(){return this.id;}
	
	@Column(length=20)
	String login;
	public void setlogin(String login){this.login = login;}
	public String getlogin(){return this.login;}
	
	@Column(length=20)
	String pass;
	public void setpass(String pass){this.pass = pass;}
	public String getpass(){return this.pass;}
	/*
	 * целая семья разных конструкторов. сами разберетесь!
	 */
	public Account(){};
	public Account(Integer id, String login, String pass){
		this.id = id;
		this.login = login;
		this.pass = pass;
	}
	public Account(String login, String pass){
		this.login = login;
		this.pass = pass;
	}
}
