package dbDriver;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Query;

import account.Account;
import message.Message;

public class dbMessDriver {
	public dbMessDriver(){};
	
	/*
	 * ������ Message �� accountid
	 */
	/*public Message getMessageByAccount(Integer accountid){
		Session session = HiberUtil.getSessionFactory().openSession();//��������� ������ � ������� hiberutil(������������?)
		session.beginTransaction();//�������� ����������
		Query query = session.createQuery("from User where login = :login and pass = :pass");//HQL - ��� �����!
		query.setParameter("login", login);
		query.setParameter("pass", pass);
		List list = query.list();//�������� �������, ������������!!1
		session.close();//������������ ��� ��� ���������?
		return (User)list.get(0);//����� �� �������� ��������������� ����� � ���� ������?
	}*/
	/*
	 * ������ Message � ��
	 */
	public Boolean setMessage(Message message){
		if(message.equals(null)){
			//throw new dbDriverIOException();
			return false;
		}
		Session session = HiberUtil.getSessionFactory().openSession();//��������� ������ � ������� hiberutil(������������?)
		session.beginTransaction();
		session.save(message);
		session.getTransaction().commit();
		session.close();
		return true;
	}
}
