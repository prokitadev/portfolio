package pl.prokita.portfolio.hibernate.dao;

import pl.prokita.portfolio.hibernate.entity.*;

import java.util.List;

public interface RatingsDao {

    List<Ratings> findAll();

}
