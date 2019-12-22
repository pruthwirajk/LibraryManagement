/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.rcs.dao;

/**
 *
 * @author Pruthwiraj Ghadge
 */
public class Borrower {
    private String borrowerId;
    private String userName;
    private String password;
    private String borrowerType;
    private long mobileNo;
    private String emailId;
    private int issuedCount;

    public Borrower() {
    }

    public Borrower(String borrowerId, String userName, String password, String borrowerType, long mobileNo, String emailId, int issuedCount) {
        this.borrowerId = borrowerId;
        this.userName = userName;
        this.password = password;
        this.borrowerType = borrowerType;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.issuedCount = issuedCount;
    }

    /**
     * @return the borrowerId
     */
    public String getBorrowerId() {
        return borrowerId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the borrowerType
     */
    public String getBorrowerType() {
        return borrowerType;
    }

    /**
     * @return the mobileNo
     */
    public long getMobileNo() {
        return mobileNo;
    }

    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * @return the issuedCount
     */
    public int getIssuedCount() {
        return issuedCount;
    }

    /**
     * @param borrowerId the borrowerId to set
     */
    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param borrowerType the borrowerType to set
     */
    public void setBorrowerType(String borrowerType) {
        this.borrowerType = borrowerType;
    }

    /**
     * @param mobileNo the mobileNo to set
     */
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * @param issuedCount the issuedCount to set
     */
    public void setIssuedCount(int issuedCount) {
        this.issuedCount = issuedCount;
    }
}
