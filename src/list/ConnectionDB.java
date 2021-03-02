
//import com.sun.jdi.connect.spi.Connection;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package list;
//
//import com.sun.jdi.connect.spi.Connection;
//
///**
// *
// * @author Amir
// */
//public class ConnectDB { 
//    public static void main(String args[]) {
//        public Connection getConnection() throws SQLException, ClassNotFoundException {
//        String connectionUrl = "jdbc:postgresql://localhost:5432/simpledb";
//        try {
//            // Here we load the driver’s class file into memory at the runtime
//            Class.forName("org.postgresql.Driver");
//
//            // Establish the connection
//            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "");
//
//            return con;
//        } catch (Exception e) {
//            System.out.println(e);
//            return null;
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        String connectionUrl = "jdbc:postgresql://localhost:5432/simpledb";
//        Connection con = null;
//        ResultSet rs = null;
//        Statement stmt = null;
//        try {
//            // Here we load the driver’s class file into memory at the runtime
//            Class.forName("org.postgresql.Driver");
//
//            // Establish the connection
//            con = DriverManager.getConnection(connectionUrl, "postgres", "0000");
//
//            // The object of statement is responsible to execute queries with the database
//            stmt = con.createStatement();
//
//            // The executeQuery() method of Statement interface is used to execute queries
//            // to the database. This method returns the object of ResultSet that can be
//            // used to get all the records of a table that matches the sql statement
//            rs = stmt.executeQuery("select * from users");
//
//            while (rs.next()) // Processing the result
//                System.out.println(rs.getInt("id") + "  "
//                        + rs.getString("name") + "  " + rs.getString("surname"));
//        }
//        catch (Exception e) {
//            System.out.println("Exception occurred!");
//        } finally {
//
//            try { // Close connection - clean up the system resources
//                con.close();
//            } catch (Exception e) {
//                System.out.println("Exception occurred!");
//            }
//        }
//
//        System.out.println("Finished!");
//  }
//}

//
//package list;
//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class ConnectionDB {
//public static void main(String[] args) {
//Connection connection = null;
//try {
//    Class.forName("org.postgresql.Driver");
//    connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/simpledb"
//            , "postgres", "root");
//
//if (connection!= null) {
//System.out.println("Connection OK");
//}else {
//System.out.println("Connection Failed");
//}
//
//} catch (Exception e) {
//    System.out.println(e); 
//}
//}}

