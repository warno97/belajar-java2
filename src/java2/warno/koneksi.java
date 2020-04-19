package java2.warno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    public Connection bukakoneksi (){
        Connection con;
        con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost/java2db","root","");
            System.out.println("berhasil");
            return con;
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("gagal");
            return null;

        }
    }
    public static void main (String args[]){
        new koneksi().bukakoneksi();
    }
    
}
