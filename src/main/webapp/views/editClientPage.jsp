<%--
  Created by IntelliJ IDEA.
  User: oussa
  Date: 1/23/21
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>
<header>
    <div class="logo">Cigma<span>D2J</span></div>
    <link rel="stylesheet" href="../resources/css/cssStyle.css">
</header>
<body>
<div class="nav-btn">Menu</div>
<div class="container">

    <div class="sidebar">
        <nav>
            <a href="#">Cigma<span>D2J</span></a>
            <ul>
                <li class="active"><a href="#">Modifier le client</a></li>
                <li><a href="../client/home">Listdes clients</a></li>
                <li><a href="#">Demand</a></li>
            </ul>
        </nav>
    </div>

    <div class="main-content">
        <h1>Client</h1>
        <p>Nouveau client</p>
        <section>
            <div class="section">
                <f:form modelAttribute="client" action="../client/update" method="post">
                    <f:hidden path="id"/>
                    <div class="field-input">
                        <p>Le prenom: </p>
                        <f:input path="firstname" type="text" name="prenom" placeholder="prenom"/>
                    </div>
                    <div class="field-input">
                        <p>Le nom: </p>
                        <f:input path="lastname" type="text" placeholder="nom"/>
                    </div>
                    <div class="field-input">
                        <p>L'email: </p>
                        <f:input path="email" type="email" placeholder="email" cols="30" rows="10"/>
                    </div>
                    <div class="field-input">
                        <p>Telephone: </p>
                        <f:input path="phone" type="tel" placeholder="telephone" cols="30" rows="10"/>
                    </div>
                    <div class="field-input">
                        <p>L'adresse: </p>
                        <f:input path="address" placeholder="adresse" cols="30" rows="10"/>
                    </div>

<%--                    <div class="field-input">
                        <p>Subject:</p>
                        <f:select path="lastname">
                            <f:option value="Job inquiry">Job inquiry</f:option>
                            <f:option value="Job loma">Job loma</f:option>
                            <f:option value="Job dada">Job dada</f:option>
                        </f:select> <br>
                    </div>--%>
                    <div class="field-input">
                        <button class="button-right">Modifier</button>
                    </div>
                </f:form>
            </div>
        </section>
    </div>
</div>

</body>
</html>
