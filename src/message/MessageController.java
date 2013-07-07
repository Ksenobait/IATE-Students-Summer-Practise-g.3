package logic.message;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import logic.account.Account;
import logic.dbDriver.HiberUtil;

public class MessageController {
	
	public static boolean isValidMessage(String message) {
		if (!(message.isEmpty())&&(message.length() < 256)){
			return true;
		}
		else
			return false;
	}
	
	public boolean SendMessage(String message, Account acc) {
		if (!isValidMessage(message))
			return false;
		
		Session session = HiberUtil.getSessionFactory().openSession();//открываем сессию с помощью hiberutil(переработать?)
		session.beginTransaction();//стартуем соединение

		Message newMessage = new Message((int)new Date().getTime(), message, acc.getid());
		session.save(newMessage);
		session.getTransaction().commit();
		session.close();
		
		return true;
	}
	
	public List<Message> ReadMessages(Account acc) {
		Session session = HiberUtil.getSessionFactory().openSession();//открываем сессию с помощью hiberutil(переработать?)
		session.beginTransaction();
		Query query = session.createQuery("from Message where accountid = :accountid");
		query.setParameter("accountid", acc.getid());
		List<Message> list = query.list();
		session.close();
		if(list.size()==0)
			return null;
		
		return list;
	}
}
