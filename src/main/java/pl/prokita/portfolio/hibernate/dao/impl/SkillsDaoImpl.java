package pl.prokita.portfolio.hibernate.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import pl.prokita.portfolio.hibernate.dao.SkillsDao;
import pl.prokita.portfolio.hibernate.entity.*;

import java.util.List;

public class SkillsDaoImpl implements SkillsDao {

    private final SessionFactory sessionFactory;

    public SkillsDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Skills> findAll() {
        String tableName = Skills.class.getSimpleName();
        String hql = "FROM " + tableName;

       try (Session session = sessionFactory.openSession()) {
           Query query = session.createQuery(hql);
           System.out.println(query);
           List<Skills> skillsList = query.list();
            skillsList.forEach(System.out::println);
            return skillsList;
        }
    }
}