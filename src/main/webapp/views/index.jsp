<%--
  Created by IntelliJ IDEA.
  User: oussa
  Date: 1/16/21
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Payment card checkout</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
          rel="stylesheet">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

<body>
<div class="container">
    <div class="col2">

        <f:form modelAttribute="client" action="../client/add">
            <label>Le prénom</label>
            <f:input path="firstname" cssClass="number" maxlength="20" placeholder="firstname" />
            <label>Le nom</label>
            <f:input path="lastname" cssClass="number" maxlength="20" placeholder="lastname" />
            <label>L'email</label>
            <f:input path="email" cssClass="number" maxlength="20" placeholder="email" />
            <button class="Add">Add</button>
        </f:form>
    </div>
</div>
</body>
</html>
