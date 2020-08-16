<html>
<body>
<!-- scriplet tag -->
<%
String name=request.getParameter("uname");
out.print("welcome "+name);
%>
<!--Expression tag  -->
<%= "Welcome "+request.getParameter("uname") %>
<!--Expression tag  -->
Current Time: <%= java.util.Calendar.getInstance().getTime() %>

<!--Decleration tag  -->
<%! String name = "Welcome"; %>
<%= name %>

</form>
</body>
</html>