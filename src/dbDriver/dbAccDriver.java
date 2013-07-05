package dbDriver;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Query;

import account.Account;

/*
 * ������ ����� ��� ������ � ��(��� ���������)
 */
public class dbAccDriver {
	public dbAccDriver(){};
	
	/*
	 * ������ User �� �� �� ������ �����-������
	 */
	public Account getUserByLoginAndPass(String login, String pass){
		Session session = HiberUtil.getSessionFactory().openSession();//��������� ������ � ������� hiberutil(������������?)
		session.beginTransaction();//�������� ����������
		Query query = session.createQuery("from Account where login = :login and pass = :pass");//HQL - ��� �����!
		query.setParameter("login", login);
		query.setParameter("pass", pass);
		List list = query.list();//�������� �������, ������������!!1
		session.close();//������������ ��� ��� ���������?
		return (Account)list.get(0);//����� �� �������� ��������������� ����� � ���� ������?
	}
	/*
	 * ������ User �� ������
	 */
	public Account getUserByLogin(String login){
		Session session = HiberUtil.getSessionFactory().openSession();//��������� ������ � ������� hiberutil(������������?)
		session.beginTransaction();
		Query query = session.createQuery("from Account where login = :login");//HQL - ��� �����!
		query.setParameter("login", login);
		List list = query.list();//�������� �������, ������������!!1
		session.close();//������������ ��� ��� ���������?
		return (Account)list.get(0);//����� �� �������� ��������������� ����� � ���� ������?
	}
	/*
	 * ������ User � ��
	 */
	public Boolean setUser(Account user){
		if(user.equals(null)){
			//throw new dbDriverIOException();
			return false;
		}
		Session session = HiberUtil.getSessionFactory().openSession();//��������� ������ � ������� hiberutil(������������?)
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return true;
	}
}
