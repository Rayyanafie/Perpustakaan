/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.perpus_fp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author USER
 */
public class TambahAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Awal
     */
    public TambahAdmin() {
        initComponents();
        ScaleImage();
        background();
       
        
    }
    
//    file:/C:/01_Privacy/_SCHOOL_/Semester%204%20(2023)/PBO/Code/Perpus_FP/src/main/java/image/image%201.png
    public void ScaleImage(){
//        java.awt.Image icon = new javax.swing.ImageIcon(getClass().getResource("/image/profile-user.png")).getImage();
//        java.awt.Image resizedIcon = icon.getScaledInstance(32, 32, java.awt.Image.SCALE_SMOOTH);
//        jLabel1.setIcon(new javax.swing.ImageIcon(resizedIcon));
//        jLabel1.setPreferredSize(new java.awt.Dimension(32, 32));

//        ImageIcon icon = new ImageIcon("C:/01_Privacy/_SCHOOL_/Semester 4 (2023)/PBO/Code/Perpus_FP/src/main/java/image/image 1.png");
//        Image img = icon.getImage();
//        Image imgScale = img.getScaledInstance(600, 400,Image.SCALE_SMOOTH);
//        ImageIcon scaledIcon = new ImageIcon(imgScale);
//        jLabel1.setIcon(scaledIcon);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 229, 208));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UPN \"Veteran Jawa Timur\"");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 70, 290, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Giri Pustaka");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 30, 200, 60);

        jPanel3.setBackground(new java.awt.Color(226, 201, 164));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Penambahan Admin");

        jTextField2.setBackground(new java.awt.Color(242, 229, 208));
        jTextField2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setText("Username");

        jTextField3.setBackground(new java.awt.Color(242, 229, 208));
        jTextField3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setText("Pengarang");

        jButton1.setBackground(new java.awt.Color(242, 229, 208));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setPreferredSize(new java.awt.Dimension(80, 40));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(130, 130, 530, 370);

        jPanel2.setBackground(new java.awt.Color(242, 229, 208));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 110, 800, 390);

        jButton2.setBackground(new java.awt.Color(226, 201, 164));
        jButton2.setFont(new java.awt.Font("Humnst777 Lt BT", 1, 18)); // NOI18N
        jButton2.setText("HOME");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 20, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Menu MenuFrame =new Menu();
        MenuFrame.setVisible(true);
        MenuFrame.pack();
        MenuFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
Connection con = null; // Inisialisasi variabel con di luar blok try-catch

try {
    String username = jTextField2.getText();
    String password= jTextField3.getText();
  

    String sql = "INSERT INTO admin (password, username) VALUES (?, ?)";
    con = DatabaseConnection.getConnection();
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, password);
    pst.setString(2, username );    


    con.setAutoCommit(false); // Mematikan otomatis commit

    pst.executeUpdate();

    JOptionPane.showMessageDialog(null, "Berhasil menyimpan");
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Gagal menyimpan: " + e.getMessage());
    if (con != null) {
        try {
            con.rollback(); // Mengembalikan transaksi jika terjadi kesalahan
        } catch (SQLException ex) {
            System.out.println("Rollback error: " + ex.getMessage());
        }
    }
} finally {
    if (con != null) {
        try {
            con.setAutoCommit(true); // Mengaktifkan kembali otomatis commit
            con.close(); // Menutup koneksi setelah selesai
        } catch (SQLException ex) {
            System.out.println("Connection close error: " + ex.getMessage());
        }
    }
}
Admin AdminFrame = new Admin();
        AdminFrame.setVisible(true);
        AdminFrame.pack();
        AdminFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line argumentsAdmin AdminFrame = new Admin();
        AdminFrame.setVisible(true);
        AdminFrame.pack();
        AdminFrame.setLocationRelativeTo(null);
        this.dispose();
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void background() {
        // Memuat gambar dari file
        // Memuat gambar dari file
        ImageIcon imageIcon = new ImageIcon("C:/01_Privacy/_SCHOOL_/Semester 4 (2023)/PBO/Code/Perpus_FP/src/main/java/image/image 1.png");


        // Membuat label dengan gambar sebagai ikon
        JLabel backgroundLabel = new JLabel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Menggambar gambar sebagai latar belakang
                g.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Mengatur tata letak label menggunakan LayoutManager yang sesuai
        // Misalnya, jika Anda menggunakan JPanel, Anda dapat menggunakan layout manager seperti BorderLayout, FlowLayout, atau sebagainya
        jPanel2.setLayout(new BorderLayout());

        // Menambahkan label ke panel atau komponen lainnya
        jPanel2.add(backgroundLabel, BorderLayout.CENTER);



    }
}
