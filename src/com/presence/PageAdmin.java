package com.presence;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author adw-ahad
 */
public class PageAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public PageAdmin() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);        

        menuPanel.addMenu("Halaman Utama", "ic_app_24", 0, new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
               //todo : code untuk pindah ke halaman utama
               changePanel(welcomePanel2);
            }
        });
        menuPanel.addMenu("Data Departemen", "ic_building_24", 1, new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
               //todo : code untuk pindah ke MasterDepartemen
               changePanel(masterDepartemen1);
            }
        }); 
        menuPanel.addMenu("Data Jabatan", "ic_role_24", 2, new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
               //todo : code untuk pindah ke MasterJabatan
               changePanel(masterJabatan2);
            }
        });
        menuPanel.addMenu("Data Karyawan", "ic_person_r_24", 3, new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
               //todo : code untuk pindah ke MasterKaryawan
               changePanel(masterKaryawan2);
            }
        });  
        menuPanel.addMenu("Data Shift", "ic_settings_24", 3, new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
               //todo : code untuk pindah ke MasterKaryawan
               changePanel(masterShift2);
            }
        });          
        
        
    }
    
    private void changePanel(JPanel panel){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.presence.component.PanelBorder();
        menuPanel = new com.presence.component.Menu();
        headerPanel1 = new com.presence.component.Header();
        mainPanel = new javax.swing.JPanel();
        welcomePanel2 = new com.presence.WelcomePanel();
        masterDepartemen1 = new com.presence.MasterDepartemen();
        masterJabatan2 = new com.presence.MasterJabatan();
        masterKaryawan2 = new com.presence.MasterKaryawan();
        masterShift2 = new com.presence.MasterShift();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Presence - Sistem Absensi Karyawan");

        panelBorder1.setBackground(new java.awt.Color(244, 244, 244));

        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(welcomePanel2, "card2");
        mainPanel.add(masterDepartemen1, "card6");
        mainPanel.add(masterJabatan2, "card6");
        mainPanel.add(masterKaryawan2, "card6");
        mainPanel.add(masterShift2, "card7");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(headerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.presence.component.Header headerPanel1;
    private javax.swing.JPanel mainPanel;
    private com.presence.MasterDepartemen masterDepartemen1;
    private com.presence.MasterJabatan masterJabatan2;
    private com.presence.MasterKaryawan masterKaryawan2;
    private com.presence.MasterShift masterShift2;
    private com.presence.component.Menu menuPanel;
    private com.presence.component.PanelBorder panelBorder1;
    private com.presence.WelcomePanel welcomePanel2;
    // End of variables declaration//GEN-END:variables
}