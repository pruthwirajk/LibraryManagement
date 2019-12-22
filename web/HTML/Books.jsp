<%-- 
    Document   : Home
    Created on : 29 Sep, 2019, 5:15:36 PM
    Author     : Pruthwiraj Ghadge
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/css/all.css" type="text/css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/base.css" type="text/css" />
        <title>Books Page</title>
    </head>
    <body>
        <div id="mySidenav" class="sidenav">
            <a href="${pageContext.request.contextPath}/HTML/Home.jsp" id="home">Home<i class="fas fa-home"></i></a>
            <a class="active" href="${pageContext.request.contextPath}/HTML/Books.jsp" id="books">Books<i class="fas fa-book-open"></i></a>
            <a href="${pageContext.request.contextPath}/HTML/LoginPage.jsp" id="login">Login<i class="fas fa-key"></i></a>
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
                <div id="upperForm">
                    Upper Form
                </div>
                <div id="lowerForm">
                    Lower Form
                </div>
            </div>
            <div id="bodyContentRight">
                <div id="rightTop">
                    Right Top
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
