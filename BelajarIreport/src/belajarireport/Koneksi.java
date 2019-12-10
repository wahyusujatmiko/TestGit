/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarireport;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MIKO
 */
public class Koneksi {
    public static Connection getConnection(){
	Connection connection = null;
	String driver = "org.postgresql.Driver";
	String url = "jdbc:postgresql://localhost:5432/db_belajar";
	String user = "postgres";
	String password = "wahyu1234";
	if(connection == null){
		try{
                    Class.forName(driver);
                    connection = (Connection) DriverManager.getConnection(url,user,password);
                    //JOptionPane.showMessageDialog(null,"connected");
                    Statement stmt = connection.createStatement(); //check koneksi databse
                    ResultSet rs = stmt.executeQuery("SELECT * FROM tb_sembako;");
                    while(rs.next()){
                        int idx = rs.getInt("id");
                        String namax = rs.getString("nama_barang");
                        int stokx = rs.getInt("stok");
                        int hargax = rs.getInt("harga");
                        System.out.println("ID = "+idx);
                        System.out.println("NAMA BARANG = "+namax);
                        System.out.println("STOK = "+stokx);
                        System.out.println("HARGA = "+hargax);
                        System.out.println();
                    }
                    //rs.close();
                    //stmt.close();
                    //connection.close();
                }catch(ClassNotFoundException | SQLException error){
                    JOptionPane.showMessageDialog(null,"Koneksi Gagal");
                    //System.exit(0);
		}
	}
	return connection;
    }
}
