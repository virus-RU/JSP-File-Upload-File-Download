<!-- We will take a form which will have “upload” button and when you click on upload button then the file will be uploaded. -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>virus Uploading File</title>
</head>
<body>
File: <br />
<form action="virus_upload" method="post"
                        enctype="multipart/form-data">
<input type="file" name="virus_file" size="50" />
<br />
<input type="submit" value="Upload" />
</form>
</body>
</html>

<!-- 

Explanation of the code:

Code Line 11-12: Here we are taking a form which has action on servlet virus_upload which will pass through a method POST. Also, here we enctype i.e. attribute which specifies how form data should be encoded and sent to server and it is only used with POST method. Here we are setting as multipart/form-data which is for the file(as data will be large).

Code Line 13: Here we are specifying virus_file element with type file and giving size as 50.

Code Line 15: This is a submit type button with name “Upload” on it through which action servlet will be called and request will processed into that and file will be read and write into the servlet.

-->
