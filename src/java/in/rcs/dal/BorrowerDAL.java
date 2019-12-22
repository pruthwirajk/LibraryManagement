/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.rcs.dal;

import in.rcs.dao.Borrower;
import in.rcs.dao.Student;
import in.rcs.dbutil.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pruthwiraj Ghadge
 */
public class BorrowerDAL {

    Student stud;
    Connection conn = DbUtil.getConnection();
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;

    public void addBorrower() {

    }

    public int login(Borrower b) {

        String userName = b.getUserName();
        String password = b.getPassword();
        String borrowerType = b.getBorrowerType();
        String borrowerId = b.getBorrowerId();
        int flag = 0;

        try {
            pstmt = conn.prepareStatement("select UserName, Password, BorrowerType from BorrowerDetails where BorrowerId = ?");

            pstmt.setString(1, borrowerId);

            rs = pstmt.executeQuery();

            if (!rs.next()) {
                flag = 0;
            } else {
                if (b.getPassword().equals(password)) {
                    flag = 1;
                }
                else
                {
                    flag = 2;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BorrowerDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
}
