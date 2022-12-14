/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.presence;

import com.presence.common.koneksi;
import com.presence.common.userSession;
import com.presence.common.utilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author adw-ahad
 */
public class CutiKaryawan extends javax.swing.JPanel {

    /**
     * Creates new form PanelTemplate
     */
    private boolean sudahAjukan = false;

    public CutiKaryawan() {
        initComponents();
        setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dtTglMulai = new com.toedter.calendar.JDateChooser();
        dtTglSelesai = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        arAlasan = new javax.swing.JTextArea();
        btnAjukan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 244));

        lbTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lbTitle.setText("Pengajuan Cuti");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Tanggal Mulai Cuti");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Tanggal Berakhir Cuti");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Alasan Cuti");

        arAlasan.setColumns(20);
        arAlasan.setRows(5);
        jScrollPane1.setViewportView(arAlasan);

        btnAjukan.setBackground(new java.awt.Color(16, 108, 209));
        btnAjukan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjukan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjukanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAjukanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAjukanMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajukan Cuti");

        javax.swing.GroupLayout btnAjukanLayout = new javax.swing.GroupLayout(btnAjukan);
        btnAjukan.setLayout(btnAjukanLayout);
        btnAjukanLayout.setHorizontalGroup(
            btnAjukanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );
        btnAjukanLayout.setVerticalGroup(
            btnAjukanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dtTglMulai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                        .addComponent(dtTglSelesai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAjukan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dtTglMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtTglSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnAjukan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjukanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjukanMouseEntered
        // TODO add your handling code here:
        //15, 98, 189
         if (!sudahAjukan) {
            btnAjukan.setBackground(new Color(15, 98, 189));
        }       
    }//GEN-LAST:event_btnAjukanMouseEntered

    private void btnAjukanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjukanMouseExited
        // TODO add your handling code here:
         if (!sudahAjukan) {
            btnAjukan.setBackground(new Color(16, 108, 209));
        }         
    }//GEN-LAST:event_btnAjukanMouseExited

    private void btnAjukanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjukanMouseClicked
        // TODO add your handling code here:
        if (!sudahAjukan) {
            if (fieldStillEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Silakan lengkapi semua field",
                        "Gagal",
                        JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                int dialogBtn = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(utilities.getVisibleWindow(), "Anda yakin untuk mengajukan cuti?", "Peringatan", dialogBtn);

                if (dialogResult == 0) {
                    insertDataCuti();
                    JOptionPane.showMessageDialog(null,
                            "Berhasil mengajukan cuti!",
                            "Sukses",
                            JOptionPane.INFORMATION_MESSAGE);
                    sudahAjukan = true;
                    btnAjukan.setBackground(new Color(244, 244, 244));
                    jLabel1.setForeground(new Color(194, 194, 194));
                    btnAjukan.setEnabled(false);
                    clearAllFields();
                }

            }
        }
    }//GEN-LAST:event_btnAjukanMouseClicked

    private void insertDataCuti() {
        Date tglMulai = dtTglMulai.getDate();
        Date tglSelesai = dtTglSelesai.getDate();
        String alasan = arAlasan.getText();
        
        long timeNow = Calendar.getInstance().getTimeInMillis();
        java.sql.Timestamp ts = new java.sql.Timestamp(timeNow); 

        try {
            Connection conn = new koneksi().connect();

            Statement st = conn.createStatement();
            String sql = "INSERT INTO cuti(tanggal_mulai,tanggal_berakhir,alasan,tanggal_pengajuan,status,user_id) "
                    + "VALUES (?,?,?,?,2,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setDate(1, new java.sql.Date(tglMulai.getTime()));
            preparedStatement.setDate(2, new java.sql.Date(tglSelesai.getTime()));
            preparedStatement.setString(3, alasan);
            preparedStatement.setTimestamp(4, ts);
            preparedStatement.setInt(5, userSession.getU_id());
            preparedStatement.executeUpdate();

            st.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Gagal",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private boolean fieldStillEmpty() {
        return arAlasan.getText() == null || arAlasan.getText().length() == 0
                || dtTglMulai == null || dtTglSelesai == null;
    }
    
    private void clearAllFields() {
        arAlasan.setText("");        
        dtTglMulai.setDate(null);
        dtTglSelesai.setDate(null);
    }        

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea arAlasan;
    private javax.swing.JPanel btnAjukan;
    private com.toedter.calendar.JDateChooser dtTglMulai;
    private com.toedter.calendar.JDateChooser dtTglSelesai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
