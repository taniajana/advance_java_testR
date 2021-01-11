package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.zensar.utility.DButil;

public class LoginRepository {

	    


public boolean CheckLogin(String username, String password) {
        
        Connection con=DButil.getMySqlDbConnection();
        String sql="select * from login where user_name=?";
        
        try {
            
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, username);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                String pass=rs.getString("password");
                if (password.equals(pass)) {
                    return true;
                }
                else {
                    System.out.println("Wrong login");
                }
            }
            
        }catch(Exception e) {
            System.out.println("Exception :"+e);
        }
        return false;
    }

 

}


