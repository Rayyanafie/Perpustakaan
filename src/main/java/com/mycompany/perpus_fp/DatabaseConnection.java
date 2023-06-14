/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpus_fp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RAY
 */
public class DatabaseConnection {
    private static final String dbServer = "localhost";
    private static final String dbUser = "root";
    private static final String dbPass = "";
    private static final String dbName = "perpusfp";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://" + dbServer + "/" + dbName, dbUser, dbPass);
    }

    // Metode lain yang diperlukan untuk operasi database lainnya
    // ...

    public static void main(String[] args) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            // Gunakan koneksi ke database untuk operasi lainnya
            // ...
            System.out.println("Koneksi berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
}
