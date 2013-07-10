package logic.dbDriver;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
/*
 * оче сложная штука для создания sessionFactory из конфига. руками не трогать!
 */
public class HiberUtil {	
	public static SessionFactory sessionFactory = null;
	static {
        try {
                //creates the session factory from hibernate.cfg.xml
                
                /*AnnotationConfiguration aconf = new AnnotationConfiguration()
                .addAnnotatedClass(User.class);*/
                Configuration conf = new Configuration().configure();
      	      	sessionFactory = conf.buildSessionFactory();
        } catch (Exception e) {
              e.printStackTrace();
        }
    }
	
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
