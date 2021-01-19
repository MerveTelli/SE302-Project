

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class baglanti {
    static String url = "jdbc:sqlite:C://SQLite/syllabus.db";
    static Connection getConnection(){
        Connection conn=null;
        try {
            conn=DriverManager.getConnection(url);
            System.out.println("Basarılı");
        } catch (SQLException e) {
            System.err.println("Başarısız");
            
        }
        return conn;
    }
    public static void main(String[] args) {
       
        
        getConnection();
            
            
             String sql = "select * from general_information";
            try (
               Statement st = getConnection().createStatement();
               ResultSet rs = st.executeQuery(sql)){
               
               while(rs.next()){
                   System.out.println(rs.getString("c_code"));
               }
            } catch (Exception e) { 
            } 
        } 
        
    }
 

