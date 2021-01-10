import java.sql.*;

public class DBOps {
     Connection c = null;
     Statement statement = null;

   public void create(){
       try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:DBOps.db");
         

         statement = c.createStatement();
         String sql = "CREATE TABLE SYLLABUS " +
                        " " +
                        " " + 
                        " " + 
                        " " + 
                        " ";  // must be filled up according to syllabus class
         statement.executeUpdate(sql) ;
         statement.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
   }
    
   public void update(){
       try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:DBOps.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      statement = c.createStatement();
      String sql = "UPDATE SYLLABUS set NAME = x where courseID=1;"; // just an example
      statement.executeUpdate(sql);
      c.commit();

      ResultSet result = statement.executeQuery( "SELECT * FROM SYLLABUS;" );//following part is for see the output in java
      
      while ( result.next() ) {
         int x = result.getInt("x");
         String  name = result.getString("name");
         
         System.out.println( "X = " + x );
         System.out.println( "NAME = " + name );
          // variables must change according to syllabus class

      }
      result.close();
      statement.close();
      c.close();
   } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
   }
   }
   
   public void delete(){
       try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:DBOps.db");
         c.setAutoCommit(false);
         System.out.println("Opened database successfully");

         statement = c.createStatement();
         String sql = "DELETE from SYLLABUS where name=x;"; // just an example 
         statement.executeUpdate(sql);
         c.commit();

         ResultSet result = statement.executeQuery( "SELECT * FROM SYLLABUS;" );//following part is for see the output in java
         
         while ( result.next() ) {
         int x = result.getInt("x");
         String  name = result.getString("name");
        
         System.out.println( "X = " + x );
         System.out.println( "NAME = " + name );
          // variables must change according to syllabus class
        
      }
      result.close();
      statement.close();
      c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
   }
   
   public void select(){
        try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:DBOps.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      statement = c.createStatement();
      ResultSet result = statement.executeQuery( "SELECT * FROM SYLLABUS;" );// following part is for see the output in java
    
      while ( result.next() ) {
         int x = result.getInt("x");
         String  name = result.getString("name");
          // variables must change according to syllabus class
         
         System.out.println( "X = " + x );
         System.out.println( "NAME = " + name );
       
      }
      result.close();
      statement.close();
      c.close();
   } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
   }
   }
   
   
}
   
   
