<!--< jsp:useBean id="cal" class="com.servlet.mypackage.Calculator" scope="application" >
    < jsp:setProperty name="cal" property="vara" value=4 >
    < jsp:setProperty name="cal" property="varb" value=4 >
< /jsp:useBean >
-->
<!-- TODO: class not detected -->
<jsp:useBean id="cal" class="com.servlet.mypackage.Calculator"/>

<%
cal.setVara(4);
cal.setVarb(4);
out.print("4+4 is "+cal.addNum());
%>