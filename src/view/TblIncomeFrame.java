/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.IncomeController;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.pojo.Income;

/**
 *
 * @author BlueDia
 */
public class TblIncomeFrame extends javax.swing.JFrame {

    IncomeController conn = new IncomeController();
    private DefaultTableModel model;

    public TblIncomeFrame() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        populateDataToTable();
        saldoAkhirPemasukan();
    }

    public void populateDataToTable() throws SQLException {
        model = (DefaultTableModel) tblIncome.getModel();
        List<Income> inco = conn.loadIncome();
        int i = 1;
        for (Income income : inco) {
            Object[] row = new Object[5];
            row[0] = i++;
            row[2] = income.getTgl_income();
            row[1] = income.getCode_income();
            row[3] = income.getJml_income();
            row[4] = income.getKet_income();
            model.addRow(row);
        }
    }

    public void refreshTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tblIncome.getModel();
        model.setRowCount(0);
        populateDataToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIncome = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblTotalIncome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        incomeBtn = new javax.swing.JButton();
        outcomeBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSubmitIncome = new javax.swing.JButton();
        tfJumlahIncome = new javax.swing.JTextField();
        tfKeteranganIncome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnUbahIncome = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        tfTanggalIncome = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblIncome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Transaksi", "Tanggal", "Jumlah", "Keterangan"
            }
        ));
        tblIncome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIncomeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIncome);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lblTotalIncome.setText("Rp.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(lblTotalIncome)
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalIncome)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setText("Total Income");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(102, 102, 102)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetsNetbean/home.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        incomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetsNetbean/input-50x50.png"))); // NOI18N

        outcomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetsNetbean/output-50x50.png"))); // NOI18N
        outcomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outcomeBtnActionPerformed(evt);
            }
        });

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetsNetbean/logout-50x50.png"))); // NOI18N
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeBtn)
                .addGap(48, 48, 48)
                .addComponent(incomeBtn)
                .addGap(39, 39, 39)
                .addComponent(outcomeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn)
            .addComponent(incomeBtn)
            .addComponent(outcomeBtn)
            .addComponent(logoutBtn)
        );

        jLabel3.setText("Tambah Income");

        btnSubmitIncome.setText("+ Tambah");
        btnSubmitIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitIncomeActionPerformed(evt);
            }
        });

        tfKeteranganIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKeteranganIncomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Jumlah :");

        jLabel5.setText("Tanggal :");

        jLabel6.setText("Keterangan :");

        btnUbahIncome.setText("Ubah");
        btnUbahIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahIncomeActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfJumlahIncome, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(tfKeteranganIncome)
                            .addComponent(tfTanggalIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 98, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUbahIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSubmitIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfJumlahIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(tfTanggalIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfKeteranganIncome)
                        .addComponent(btnSubmitIncome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbahIncome)
                .addGap(10, 10, 10)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        try {
            new HomeFrame().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TblIncomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void outcomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outcomeBtnActionPerformed
        try {
            new TblOutcomeFrame().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TblIncomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_outcomeBtnActionPerformed

    private void tfKeteranganIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKeteranganIncomeActionPerformed

    }//GEN-LAST:event_tfKeteranganIncomeActionPerformed

    private void btnSubmitIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitIncomeActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        int jml_income = Integer.parseInt(tfJumlahIncome.getText());
        String ket_income = tfKeteranganIncome.getText();
        String tgl_income = sdf.format(tfTanggalIncome.getDate());

        IncomeController incC = new IncomeController();
        try {
            incC.insert(new Income(jml_income, ket_income, tgl_income));
            refreshTable();
        } catch (SQLException ex) {
            Logger.getLogger(TblIncomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSubmitIncomeActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void btnUbahIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahIncomeActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        int jml_income = Integer.parseInt(tfJumlahIncome.getText());
        String ket_income = tfKeteranganIncome.getText();
        String tgl_income = sdf.format(tfTanggalIncome.getDate());

        IncomeController incC = new IncomeController();
        try {
            incC.update(new Income(jml_income, ket_income, tgl_income));
        } catch (SQLException ex) {
            Logger.getLogger(TblIncomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUbahIncomeActionPerformed

    private void tblIncomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIncomeMouseClicked

        try {
        DefaultTableModel model = (DefaultTableModel) tblIncome.getModel();
        int selectedIndex = tblIncome.getSelectedRow();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(selectedIndex, 1));
        tfTanggalIncome.setDate(date);
        
        tfJumlahIncome.setText(model.getValueAt(selectedIndex, 2).toString());
        tfKeteranganIncome.setText(model.getValueAt(selectedIndex, 3).toString());
        } catch (ParseException ex) {
            Logger.getLogger(TblIncomeFrame.class.getName()).log(Level.SEVERE, null, ex);
    }                                      

    }//GEN-LAST:event_tblIncomeMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int status = 0;
        
           try{
            DefaultTableModel model = (DefaultTableModel) tblIncome.getModel();
            status = conn.delete(new Income(Integer.parseInt(tfJumlahIncome.getText()) ,
                    String.valueOf(tfTanggalIncome.getDate()), 
                    tfKeteranganIncome.getText()));
            refreshTable();
        }catch (SQLException ex){
          Logger.getLogger(TblIncomeFrame.class.getName()).log(Level.SEVERE, null , ex);
//            System.err.println("Gsgsl Hapus");
        }
        if(status == 1){
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Hapus");
        } else {
            JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
        }
        
        
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(TblOutcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TblOutcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TblOutcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TblOutcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TblOutcomeFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TblOutcomeFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    

    public void saldoAkhirPemasukan() throws SQLException {
        List<Income> inc = conn.loadIncome();
        int ina = 0;
        for (Income incC : inc) {
            ina += incC.getJml_income();
        }
        lblTotalIncome.setText("Rp." + String.valueOf(ina));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSubmitIncome;
    private javax.swing.JButton btnUbahIncome;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton incomeBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalIncome;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton outcomeBtn;
    private javax.swing.JTable tblIncome;
    private javax.swing.JTextField tfJumlahIncome;
    private javax.swing.JTextField tfKeteranganIncome;
    private com.toedter.calendar.JDateChooser tfTanggalIncome;
    // End of variables declaration//GEN-END:variables
}
