package pertemuan__8;

import java.sql.*;
public class Koneksi {
    String dbn = "perpustakaan";   //nama database yang akan dipakai
    String url = "jdbc:mysql://Localhost/" + dbn;
    String usr = "root"; // user localhost, sesuaikan dengan komp anda
    String pwd = "";  // password localhost, sesuaikan dengan komp anda

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usr, pwd);
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal..!!!");
            System.exit(0);
        }
        return con;
    }
}
