package logic.dbDriver;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Query;

import logic.account.Account;

/*
 * крутой класс для работы с бд(для аккаунтов)
 */
public class dbAccDriver {
	public dbAccDriver(){};
	
	/*
	 * выдача Account из БД по связке логин-пароль
	 */
	public Account getUserByLoginAndPass(String login, String pass){
		Session session = HiberUtil.getSessionFactory().openSession();//открываем сессию с помощью hiberutil(переработать?)
		session.beginTransaction();//стартуем соединение
		Query query = session.createQuery("from Account where login = :login and pass = :pass");//HQL - эта крута!
		query.setParameter("login", login);
		query.setParameter("pass", pass);
		List list = query.list();//косячное решение, переработать!!1
		session.close();//использовать пул для коннектов?
		if(list.size()==0)return null;
		return (Account)list.get(0);//можно ли избежать принудительного каста в этом случае?
	}
	/*
	 * выдача Account по логину
	 */
	public Account getUserByLogin(String login){
		Session session = HiberUtil.getSessionFactory().openSession();//открываем сессию с помощью hiberutil(переработать?)
		session.beginTransaction();
		Query query = session.createQuery("from Account where login = :login");//HQL - эта крута!
		query.setParameter("login", login);
		List list = query.list();//косячное решение, переработать!!1
		session.close();//использовать пул для коннектов?
		if(list.size()==0)return null;
		return (Account)list.get(0);//можно ли избежать принудительного каста в этом случае?
	}
	/*
	 * выдача Account по id
	 */
	public Account getUserById(Integer id){
		Session session = HiberUtil.getSessionFactory().openSession();//открываем сессию с помощью hiberutil(переработать?)
		session.beginTransaction();
		Query query = session.createQuery("from Account where id = :id");//HQL - эта крута!
		query.setParameter("id", id);
		List list = query.list();//косячное решение, переработать!!1
		session.close();//использовать пул для коннектов?
		if(list.size()==0)return null;
		return (Account)list.get(0);//можно ли избежать принудительного каста в этом случае?
	}
	/*
	 * запись User в БД
	 */
	public Boolean setUser(Account user){
		if(user == null){
			//throw new dbDriverIOException();
			return false;
		}
		Session session = HiberUtil.getSessionFactory().openSession();//открываем сессию с помощью hiberutil(переработать?)
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return true;
	}
}
