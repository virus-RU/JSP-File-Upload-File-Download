package demotest;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class vius_upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public vius_upload() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        if(ServletFileUpload.isMultipartContent(request)){
		            try {
		                List <FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
		                for(FileItem item : multiparts){
		                    if(!item.isFormField()){
		                        String name = new File(item.getName()).getName();
		                        item.write( new File("c:/vius/upload" + File.separator + name));
		                    }
		                }
		               //File uploaded successfully
		               request.setAttribute("viusmessage", "File Uploaded Successfully");
		            } catch (Exception ex) {
		               request.setAttribute("viusmessage", "File Upload Failed due to " + ex);
		            }         		
		        }else{
		
		            request.setAttribute("viusmessage","No File found");
 }
		        request.getRequestDispatcher("/result.jsp").forward(request, response);
		
		    }


}

/*
Explanation of the code:

Code Line 12-14: Here we will have to import org.apache.commons library into the configuration of the code. We will have to import fileupload class from org.apache.commons library.

Code Line 23: Here we have doPost() method, which will be called as we are passing POST method in JSP and it will request and response objects as its parameters

Code Line 26: Here we are creating an object of ServletFileUpload class from fileUpload package from org.apache.commons library which will check whether there are any file objects in JSP. If any found then those file object will be taken from request.

Code Line 27-32: We will iterate the number of files by checking how many file item are present in multiparts object which is a list object (if we upload more than one file) and save it into c:/vius/upload folder with the filename which has been provided. We are writing the file using write method of the fileobject into the folder which has been mentioned.

Code Line 34: If there is no exception then we are setting attribute in request as viusmessage with value “File uploaded successfully”.

Code Line 35-36: If exception occurs then setting message that “File upload failed”

Code Line 40: If file not found then setting message as “No file found”

Code Line 42: Forwarding request using requestdispatcher object to result.jsp with request and response objects.

  */
  
