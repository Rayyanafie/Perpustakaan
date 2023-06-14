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
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author andhi
 */
public class RiwayatUser extends javax.swing.JFrame {
public DefaultTableModel tabModel;
    /**
     * Creates new form RiwayatUser
     */
    public RiwayatUser() {
        initComponents();
        history();
        connect();
        ScaleImage();
        background();
    }

public void history() {
    Object[] history = { "ID History", "ID Anggota", "ID Buku", "Tanggal Pinjam", "Tanggal Kembali" };
    tabModel = new DefaultTableModel(null, history);
    jTable1.setModel(tabModel);
}

public void connect() {
    try {
        Connection conn = DatabaseConnection.getConnection();
        // Ambil list buku dari database
        tabModel.getDataVector().removeAllElements();
        tabModel.fireTableDataChanged();
        
        String sql = "SELECT ROW_NUMBER() OVER(ORDER BY tgl1) AS ID_History, id_user, id_buku, " +
                     "GROUP_CONCAT(tgl1 SEPARATOR ' || ') AS tanggal_pinjam, " +
                     "GROUP_CONCAT(tgl2 SEPARATOR ' || ') AS tanggal_kembali " +
                     "FROM (" +
                     "SELECT id_user, id_buku, tgl_pinjam AS tgl1, NULL AS tgl2 FROM peminjaman " +
                     "UNION " +
                     "SELECT id_user, id_buku, NULL AS tgl1, tgl_kembali AS tgl2 FROM pengembalian" +
                     ") AS subquery " +
                     "GROUP BY id_user, id_buku";
        
        java.sql.Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next()) {
            String idHistory = rs.getString("ID_History");
            String idUser = rs.getString("id_user");
            String idBuku = rs.getString("id_buku");
            String tanggalPinjam = rs.getString("tanggal_pinjam");
            String tanggalKembali = rs.getString("tanggal_kembali");
            String[] data = { idHistory, idUser, idBuku, tanggalPinjam, tanggalKembali };
            tabModel.addRow(data);
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    // file:/C:/01_Privacy/_SCHOOL_/Semester%204%20(2023)/PBO/Code/Perpus_FP/src/main/java/image/image%201.png
    public void ScaleImage() {
        // java.awt.Image icon = new
        // javax.swing.ImageIcon(getClass().getResource("/image/profile-user.png")).getImage();
        // java.awt.Image resizedIcon = icon.getScaledInstance(32, 32,
        // java.awt.Image.SCALE_SMOOTH);
        // jLabel1.setIcon(new javax.swing.ImageIcon(resizedIcon));
        // jLabel1.setPreferredSize(new java.awt.Dimension(32, 32));

        // ImageIcon icon = new ImageIcon("C:/01_Privacy/_SCHOOL_/Semester 4
        // (2023)/PBO/Code/Perpus_FP/src/main/java/image/image 1.png");
        // Image img = icon.getImage();
        // Image imgScale = img.getScaledInstance(600, 400,Image.SCALE_SMOOTH);
        // ImageIcon scaledIcon = new ImageIcon(imgScale);
        // jLabel1.setIcon(scaledIcon);
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        jLabel1.setText("Riwayat");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(242, 229, 208));
        jTable1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Anggota", "ID Buku", "Tanggal Pinjam", "Tanggal Kembali"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(90, 130, 600, 370);

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
    }// </editor-fold>                        

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {                                      
        MenuUser MenuUserFrame =new MenuUser();
        MenuUserFrame.setVisible(true);
        MenuUserFrame.pack();
        MenuUserFrame.setLocationRelativeTo(null);
        this.dispose();
    }                                     

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RiwayatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiwayatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiwayatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiwayatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiwayatUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration     
    
    private void background() {
        // Memuat gambar dari file
        // Memuat gambar dari file
        ImageIcon imageIcon = new ImageIcon(
                "C:/01_Privacy/_SCHOOL_/Semester 4 (2023)/PBO/Code/Perpus_FP/src/main/java/image/image 1.png");

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
        // Misalnya, jika Anda menggunakan JPanel, Anda dapat menggunakan layout manager
        // seperti BorderLayout, FlowLayout, atau sebagainya
        jPanel2.setLayout(new BorderLayout());

        // Menambahkan label ke panel atau komponen lainnya
        jPanel2.add(backgroundLabel, BorderLayout.CENTER);

    }
}