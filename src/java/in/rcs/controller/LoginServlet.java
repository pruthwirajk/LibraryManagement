/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.rcs.controller;

import in.rcs.dal.BorrowerDAL;
import in.rcs.dao.Borrower;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pruthwiraj Ghadge
 */
public class LoginServlet extends HttpServlet {

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

        Borrower borrower;
        String userName, password, borrowerId, userType, msg = "Welcome, Guest", path;
        HttpSession session = request.getSession(false);

        response.setContentType("text/html;charset=UTF-8");

        userName = request.getParameter("txtUserName");
        password = request.getParameter("txtPassword");
        userType = request.getParameter("radUserType");
        borrowerId = request.getParameter("txtBorrowerId");

        borrower = new Borrower(borrowerId, userName, password, userType, 0, "", 0);

        int flag = new BorrowerDAL().login(borrower);

        System.out.println("Flag : " + flag);
        switch (flag) {
            case 0:
                msg = "No such user present";
                path = "/HTML/Login.jsp";
                break;
            case 1:
                msg = userName;
                path = "/HTML/Home.jsp";
                break;
            case 2:
                msg = "Wrong credentials";
                path = "/HTML/Login.jsp";
                break;
            default:
                msg = "Please contact your administrator for help";
                path = "/HTML/ErrorPage.jsp";
                break;
        }

        RequestDispatcher rd = request.getRequestDispatcher(path);

        if (flag == 1) {
            session.invalidate();
            
            session = request.getSession(true);
            
            session.setAttribute("msg", msg);
            session.setAttribute("borrower", borrower);
            rd.forward(request, response);

        } else {
            request.setAttribute("msg", msg);
            rd.include(request, response);
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
