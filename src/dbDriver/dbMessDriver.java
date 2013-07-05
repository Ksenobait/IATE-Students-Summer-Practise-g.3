package dbDriver;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Query;

import account.Account;
import message.Message;

public class dbMessDriver {
	public dbMessDriver(){};
	
	/*
	 * выдача Message по accountid
	 */
	/*public Message getMessageByAccount(Integer accountid){
		Session session = HiberUtil.getSessionFactory().openSession();//открываем сессию с помощью hiberutil(переработать?)
		session.beginTransaction();//стартуем соединение
		Query query = session.createQuery("from User where login = :login and pass = :pass");//HQL - эта крута!
		query.setParameter("login", login);
		query.setParameter("pass", pass);
		List list = query.list();//косячное решение, переработать!!1
		session.close();//использовать пул для коннектов?
		return (User)list.get(0);//можно ли избежать принудительного каста в этом случае?
	}*/
	/*
	 * запись Message в БД
	 */
	public Boolean setMessage(Message message){
		if(message.equals(null)){
			//throw new dbDriverIOException();
			return false;
		}
		Session session = HiberUtil.getSessionFactory().openSession();//открываем сессию с помощью hiberutil(переработать?)
		session.beginTransaction();
		session.save(message);
		session.getTransaction().commit();
		session.close();
		return true;
	}
}
