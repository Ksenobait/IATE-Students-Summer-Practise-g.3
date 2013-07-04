package dbDriver;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Query;

import user.User;

/*
 * ������ ����� ��� ������ � ��
 */
public class dbDriver {
	public dbDriver(){};
	/*
	 * ������������� ������
	 */
	public Session initConnection(){
		return HiberUtil.getSessionFactory().openSession();//��������� ������ � ������� hiberutil(������������?)
	}
	/*
	 * ������ User �� �� �� ������ �����-������
	 */
	public User getUserByLogin(String login, String pass){
		Session session = this.initConnection();//�������������
		session.beginTransaction();//�������� ����������
		Query query = session.createQuery("from User where login = :login and pass = :pass");//HQL - ��� �����!
		query.setParameter("login", login);
		query.setParameter("pass", pass);
		List list = query.list();//�������� �������, ������������!!1
		session.close();//������������ ��� ��� ���������?
		return (User)list.get(0);//����� �� �������� ��������������� ����� � ���� ������?
	}
	/*
	 * ������ User � ��
	 */
	public Boolean setUser(User user){
		if(user.equals(null)){
			//throw new dbDriverIOException();
			return false;
		}
		Session session = this.initConnection();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return true;
	}
}
