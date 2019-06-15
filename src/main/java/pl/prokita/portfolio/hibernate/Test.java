package pl.prokita.portfolio.hibernate;


import org.hibernate.SessionFactory;
import pl.prokita.portfolio.hibernate.dao.RatingsDao;
import pl.prokita.portfolio.hibernate.dao.SkillsDao;
import pl.prokita.portfolio.hibernate.dao.impl.RatingsDaoImpl;
import pl.prokita.portfolio.hibernate.dao.impl.SkillsDaoImpl;
import pl.prokita.portfolio.hibernate.entity.Ratings;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        HibernateConfig hibernateConfig = new HibernateConfigJava();
        SessionFactory sessionFactory = hibernateConfig.getSessionFactory();

        RatingsDao ratingsDao = new RatingsDaoImpl(sessionFactory);
        List<Ratings> list = ratingsDao.findAll();
        System.out.println(list);
    }

}