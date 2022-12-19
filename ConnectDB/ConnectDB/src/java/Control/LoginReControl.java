/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Dao.LoginDao;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author trinh
 */
@WebServlet(name = "LoginReControl", urlPatterns = {"/login"})
public class LoginReControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
        //get username password cookie
        //set username password form

        Cookie[] arr = request.getCookies();
        if (arr != null) {
            for (Cookie o : arr) {
                if (o.getName().equals("userC")) {
                    request.setAttribute("username", o.getValue());
                }
                if (o.getName().equals("passC")) {
                    request.setAttribute("password", o.getValue());
                }
            }
        }

        request.getRequestDispatcher("Login.jsp").forward(request, response);;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        String remember = request.getParameter("remember");

        LoginDao loginDao = new LoginDao();
        Account a = loginDao.checkLogin(username, password);
        if (a == null) {
            request.setAttribute("mess", "wrong user or password check again");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("acc", a);

            //luu username password tren cookie
            Cookie u = new Cookie("userC", username);
            Cookie p = new Cookie("passC", password);
            u.setMaxAge(600); // time cookie ton tai

            if (remember != null) {
                p.setMaxAge(600);
            } else {
                p.setMaxAge(0);
            }

            response.addCookie(u); //add u va p len trinh duyet   
            response.addCookie(p);

            session.setMaxInactiveInterval(3000);
            request.getRequestDispatcher("Home").forward(request, response);

        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
