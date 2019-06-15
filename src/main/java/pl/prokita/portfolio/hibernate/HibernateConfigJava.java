package pl.prokita.portfolio.hibernate;

import pl.prokita.portfolio.hibernate.entity.*;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateConfigJava implements HibernateConfig {
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;


    @Override
    public SessionFactory getSessionFactory() {
        if(sessionFactory == null){
            try {
                Configuration configuration = new Configuration();
                Properties settings = new Properties();

                settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/skills?allowPublicKeyRetrieval=true&useSSL=false");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "password");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
                settings.put(Environment.SHOW_SQL, "false");
                settings.put(Environment.FORMAT_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                configuration.setProperties(settings);

                configuration.addAnnotatedClass(Rates.class);
                configuration.addAnnotatedClass(Ratings.class);
                configuration.addAnnotatedClass(Skills.class);
                configuration.addAnnotatedClass(Types.class);


                serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties())
                        .build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }

    @Override
    public void shutdown() {
        StandardServiceRegistryBuilder.destroy(serviceRegistry);
    }
}
