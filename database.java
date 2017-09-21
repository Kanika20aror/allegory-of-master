package search;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class database {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    database()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","shail");
          pst=con.prepareStatement("select * from loginreg where sname=? and password=?");
      
        }
       
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }
    public Boolean checkLogin(String uname,String pwd)
    {
        try
        {
            pst.setString(1, uname);
            pst.setString(2,pwd);
            rs=pst.executeQuery();
            if(rs.next())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
            catch(Exception e)
                    {
                    System.out.println("error while validation");
                    return false;
                    }
            
 }
        
}