Primenum.html

<html>
<head>
</head>
<body>
<form action="prime.jsp" method="get">
Enter Number :
<input type="text" name="num">
<input type="submit" value="Submit">
</form>
</body>
</html>


JSP FILE :prime.jsp

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
int n = Integer.parseInt(request.getParameter("num"));
int num,i,count;
for(num=1;num<=n;num++)
{
count=0;
for(i=2;i<=num/2;i++)
{
if(num%i==0)
{

count++;
break;
}
}
if(count==0 && num!=1)
{
%>
<html>
<body>
<font size ="14" color="red"><%out.println("\t"+num);%>
</body>
</html>
<%
}
}
%>
