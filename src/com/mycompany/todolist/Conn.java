
package com.mycompany.todolist;

import java.sql.*;

public class Conn {
    
        Connection c;
        Statement s;
        
    public Conn(){
        
        try{
            
            
            c = DriverManager.getConnection("jdbc:mysql:///todolist","root","shafay316631");
            s = c.createStatement();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
