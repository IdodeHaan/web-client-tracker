<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <title>Save Customer</title>
</head>
<body>

    <div id="wrapper">
        <div id="header">
            <h2>CRM - Customer Relationship Manager</h2>
        </div>
    </div>
    <div>
        <h3>Save Customer</h3>

        <form:form action="saveCustomer" modelAttribute="customer" method="post">

            <!-- need to associate the data in the fields with the customer id -->
            <form:hidden path="id"/>

            <table>
                <tbody>
                    <tr>
                        <td><label>First name:</label></td>
                        <td><form:input path="firstName"/></td>
                    </tr>
                    <tr>
                        <td><label>Last name:</label></td>
                        <td><form:input path="lastName"/></td>
                    </tr>
                    <tr>
                        <td><label>Email:</label></td>
                        <td><form:input path="email"/></td>
                    </tr>
                    <tr>
                        <td><label></label></td>
                        <td><input type="submit" value="Save"/></td>
                    </tr>
                </tbody>
            </table>
        </form:form>
        <div></div>
        <p>
            <a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
        </p>
    </div>

</body>
</html>