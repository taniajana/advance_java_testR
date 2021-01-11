package com.zensar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String RequestAction=request.getParameter("requestAction");
        
        if(RequestAction.equalsIgnoreCase("login"))
        {
        String username=request.getParameter("login");
        String password= request.getParameter("password");
        
        
       LoginRepository loginrepository= new LoginRepository();
        boolean login=loginrepository.CheckLogin(username, password);
        if(login)
        {
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
            try {
                
                request.setAttribute("username", username);                    
                rd.forward(request, response);        
                
            }catch(Exception e) {
                System.out.println("Exception :"+e);
            }
                
        }
        else {        
            
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            try {
                request.setAttribute("LoginStatus", "fail");
                rd.forward(request, response);                                        
                
            }catch(Exception e)
            {
                System.out.println("Exception :"+e);
            }
        }
    }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    {

 

        doGet(request, response);
        
    }

 

}
	
