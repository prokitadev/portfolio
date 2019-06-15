package pl.prokita.portfolio;

import pl.prokita.portfolio.mongo.model.*;
import pl.prokita.portfolio.mongo.MongoDBConnector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ProjectServlet", value = "/projects")
public class ProjectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MongoDBConnector mongoDBConnector = new MongoDBConnector();
        List<Projects> list = mongoDBConnector.getAllProjects();

        req.setAttribute("projects", list);

       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/projects.jsp");
       dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter printWriter = resp.getWriter();


    }
}
