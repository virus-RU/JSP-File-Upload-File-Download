package demotest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class virus_download
 */
public class virus_download extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String virusfile = "test.txt";
		String viruspath = "c:/virus/upload/";
		response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-Disposition", "attachment; filename=\""
				+ virusfile + "\"");
 
		FileInputStream fileInputStream = new FileInputStream(viruspath
				+ virusfile);
 
		int i;
		while ((i = fileInputStream.read()) != -1) {
			out.write(i);
		}
		fileInputStream.close();
		out.close();
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

/* 

Explanation of the code:

Code Line 3-5: Here we are importing FileInputStream , IO Exception and PrintWriter from the java.io package.

Code Line 15: We are defining virus_download servlet which extends HttpServlet.

Code Line 18: As we have defined a href, which will be enclosed in URL so GET method will get processed (doGet will be called in servlet) which also encloses request and response objects.

Code Line 19-20: We are setting content Type in response object and also get writer object from response.

Code Line 21-22: Defining a variable as virusfile as value test.txt and viruspath as c:/virus/upload/

Code Line 23-25: We are setting the content type using response object and we use setHeader method which sets header into the response object as the filename which has been uploaded.

Code Line 27-28: We are creating FileInputStream in which we will add viruspath+virusfile.

Code Line 31-33: Here we have taken a while loop which will run till the file is read, hence we have given condition as != -1. In this condition we are writing using printwriter object out.

When you execute the above code you will get the following output

Output:

Output:

We have to click on downloading_1.jsp we will get a hyperlink as “Download Here”. When you click on this hyperlink file, it will downloaded into the system.

*/
