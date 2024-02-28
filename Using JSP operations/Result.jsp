<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>virus Result</title>
</head>
<body>
<% String msg = (String)request.getAttribute("message");
   out.println(msg);
%>
</body>
</html>

<!-- 
Explanation of the code:

Code Line 10: Here we are getting the attribute from the request object with value gurumessage into a string object.

Code Line11: Here we are printing that message.

When we execute the above code we get the following output

Output:

We get a form wherein there is fields to choose a file from directory. Once the file is selected then we have to click on the upload button.

-->
