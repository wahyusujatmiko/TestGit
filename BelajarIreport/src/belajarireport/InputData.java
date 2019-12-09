package belajarireport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InputData {
    public ResultSet SearchTextList(String nama) throws ClassNotFoundException, SQLException{
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/db_belajar";
        String user = "postgres";
        String password = "wahyu1234";
        Class.forName(driver);
        Connection connection = (Connection) DriverManager.getConnection(url,user,password);
        String sql = "SELECT * FROM tb_sembako WHERE nama_barang LIKE ?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, nama);
        ResultSet rs = pst.executeQuery();
        return rs;
    }
}
