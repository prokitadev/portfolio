package pl.prokita.portfolio;

import org.hibernate.SessionFactory;
import pl.prokita.portfolio.hibernate.HibernateConfig;
import pl.prokita.portfolio.hibernate.HibernateConfigJava;
import pl.prokita.portfolio.hibernate.dao.RatingsDao;
import pl.prokita.portfolio.hibernate.dao.impl.RatingsDaoImpl;
import pl.prokita.portfolio.hibernate.entity.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AboutMeServlet", value = "/aboutme")
public class AboutMeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HibernateConfig hibernateConfig = new HibernateConfigJava();
        SessionFactory sessionFactory = hibernateConfig.getSessionFactory();

        RatingsDao ratingsDao = new RatingsDaoImpl(sessionFactory);
        List<Ratings> list = ratingsDao.findAll();
        req.setAttribute("ratings", list);


        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/aboutme.jsp");
        requestDispatcher.forward(req, resp);
    }
}
