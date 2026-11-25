<%-- 
    Document   : cvError
    Created on : 25 Nov 2026, 10:28:59 am
    Author     : miraj
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Validation Error - CV Builder</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="container">
            <div class="header-bar">
                <h1>Unable to Generate CV</h1>
            </div>

            <div class="error-box">
                <p><strong>Validation Error:</strong></p>
                <p>${errorMessage}</p>
            </div>

            <a class="btn-back" href="cvForm.jsp">&larr; Return to CV Form</a>
        </div>
    </body>
</html>
