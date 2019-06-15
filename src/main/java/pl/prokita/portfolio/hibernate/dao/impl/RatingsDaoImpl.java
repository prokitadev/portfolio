package pl.prokita.portfolio.hibernate.dao.impl;

import pl.prokita.portfolio.hibernate.dao.RatingsDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import pl.prokita.portfolio.hibernate.dao.RatingsDao;
import pl.prokita.portfolio.hibernate.entity.*;

import java.util.List;

public class RatingsDaoImpl implements RatingsDao {

    private final SessionFactory sessionFactory;

    public RatingsDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<Ratings> findAll() {
        String tableName = Ratings.class.getSimpleName();

        String hql = "from " + tableName;

        try (Session session = sessionFactory.openSession()) {
            Query query = session.createQuery(hql, Ratings.class);
            List<Ratings> ratingsList = query.list();

            return ratingsList;
        }
    }
}
