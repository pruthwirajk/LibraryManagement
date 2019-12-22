<%-- 
   Document   : LoginPage
   Created on : 30 Sep, 2019, 9:30:31 AM
   Author     : Pruthwiraj Ghadge
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/css/fontawesome.css" type="text/css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/css/all.css" type="text/css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/base.css" type="text/css" />
        <title>Login Page</title>
    </head>
    <body>
        <div id="mySidenav" class="sidenav">
            <a href="${pageContext.request.contextPath}/HTML/Home.jsp" id="home">Home<i class="fas fa-home"></i></a>
            <a href="${pageContext.request.contextPath}/HTML/Books.jsp" id="books">Books<i class="fas fa-book-open"></i></a>
            <a class="active" href="${pageContext.request.contextPath}/HTML/LoginPage.jsp" id="login">Login<i class="fas fa-key"></i></a>
            <a href="${pageContext.request.contextPath}/HTML/Borrowers.jsp" id="borrowers">Borrowers<i class="fas fa-users"></i></a>
        </div>
        <div id="main">
            <h1 id="mainHeader">
                Welcome to Bookworms Library!
            </h1>
            <div id="bodyContentLeft">

                <c:set var="curSID" value="${pageContext.session.id}" />

                <c:set var="msg" value="Welcome, ${sessionScope.msg}" />

                <c:if test="${msg=='Welcome, ' || msg==''}">
                    <c:set var="msg" value="Welcome, Guest" />
                </c:if>

                <div id="msg">
                    <c:out value="${msg}" />
                </div>
                <div id="sid">
                    <c:out value="${curSID}" />
                </div>
            </div>
            <div id="bodyContentMain">
                <form name="frmLogin" action="LoginServlet" method="POST">

                    <div id="upperForm">
                        <div id="labels">
                            <span class="frmElement">
                                <label for="txtBorrowerId">Enter Borrower Id:</label>
                            </span>

                            <span class="frmElement">
                                <label for="txtUserName">Enter User Name :</label>
                            </span>

                            <span class="frmElement">
                                <label for="txtPassword">Enter Password :</label>
                            </span>
                        </div>

                        <div id="texts">
                            <span class="frmElement">
                                <input type="text" id="txtBorrowerId" name="txtBorrowerId" value="" />
                            </span>

                            <span class="frmElement">
                                <input type="text" id="txtUserName" name="txtUserName" value="" />
                            </span>

                            <span class="frmElement">
                                <input type="password" id="txtPassword" name="txtPassword" value="" />
                            </span>                            
                        </div>
                    </div>

                    <div id="lowerForm">

                        <span class="frmElement">
                            <span class="radio">
                                <label for="radLibrarian">Librarian </label>
                                <input type="radio" id="radLibrarian" name="radUserType" value="Librarian" />
                            </span>

                            <span class="radio">
                                <label for="radStaff">Staff</label>
                                <input type="radio" id="radStaff" name="radUserType" value="Staff" />
                            </span>

                            <span class="radio">
                                <label for="radStudent">Student</label>
                                <input type="radio" id="radStudent" name="radUserType" value="Student" />
                            </span>
                        </span>

                        <span class="frmElement">
                            <input class="command" type="submit" value="Submit" name="btnSubmit" style="font:'Garamond'; font-size: 15px;" />
                            <input class="command" type="reset" value="Reset" name="btnReset" style="font:'Garamond'; font-size: 15px;" />
                        </span>
                    </div>

                </form>
            </div>
            <div id="bodyContentRight">
                <div id="rightTop">
                    <form action="http://www.google.com/search" target="_blank">
                        <input type="text" placeholder="Search.." name="q" >
                        <button type="submit"><i class="fas fa-search"></i></button>
                    </form>
                </div>
                <div id="rightMiddle">
                    Right Middle
                </div>
                <div id="rightBottom">
                    Right Bottom
                </div>
            </div>
        </div>
    </body>
</html>
