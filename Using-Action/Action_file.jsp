<!-- we are uploading a file using IO object -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>virus File</title>
</head>
<body>
<a>virus File Upload:</a>
Select file: <br />
<form action="action_file_upload.jsp" method="post"
                        enctype="multipart/form-data">
<input type="file" name="file" size="50" />
<br />
<input type="submit" value="Upload File" />
</form>
</body>
</html>

<!--
Explanation of the code:

Action_file.jsp

Code Line 12-18: Here we are creating form with file field, which will upload file to the server and action will be passed to action_file_upload.jsp
-->
