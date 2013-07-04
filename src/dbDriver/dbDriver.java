package dbDriver;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Query;

import user.User;

/*
 * крутой класс для работы с бд
 */
public class dbDriver {
	public dbDriver(){};
	/*
	 * инициализация сессии
	 */
	public Session initConnection(){
		return HiberUtil.getSessionFactory().openSession();//открываем сессию с помощью hiberutil(переработать?)
	}
	/*
	 * выдача User из БД по связке логин-пароль
	 */
	public User getUserByLogin(String login, String pass){
		Session session = this.initConnection();//инициализация
		session.beginTransaction();//стартуем соединение
		Query query = session.createQuery("from User where login = :login and pass = :pass");//HQL - эта крута!
		query.setParameter("login", login);
		query.setParameter("pass", pass);
		List list = query.list();//косячное решение, переработать!!1
		session.close();//использовать пул для коннектов?
		return (User)list.get(0);//можно ли избежать принудительного каста в этом случае?
	}
	/*
	 * запись User в БД
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
