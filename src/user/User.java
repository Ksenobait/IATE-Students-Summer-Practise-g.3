package user;

import javax.persistence.*;
/*
 * ����� User ��� �������� ������������ ������ ������������ (������������� � account?). �� �����. ��������� �� �������!
 */
@Entity
@Table(name="users")
public class User {
	@Id
	@Column
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
	 * ����� ����� ������ �������������. ���� �����������!
	 */
	public User(){};
	public User(Integer id, String login, String pass){
		this.id = id;
		this.login = login;
		this.pass = pass;
	}
}
