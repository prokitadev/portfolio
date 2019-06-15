package pl.prokita.portfolio.hibernate;

import org.hibernate.SessionFactory;

public interface HibernateConfig {

    SessionFactory getSessionFactory();

    void shutdown();
}
