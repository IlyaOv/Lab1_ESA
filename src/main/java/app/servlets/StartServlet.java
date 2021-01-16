package app.servlets;

import app.adress.AdressBean;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/")
public class StartServlet extends HttpServlet {
    @EJB
    private AdressBean adressBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        session.setAttribute("adressList", adressBean.findAll());

        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/index.jsp");
        if (dispatcher != null) {
            dispatcher.forward(req, resp);
        }
    }
}
