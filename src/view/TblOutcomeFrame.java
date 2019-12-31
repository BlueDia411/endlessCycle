/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OutcomeController;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.pojo.Outcome;

/**
 *
 * @author BlueDia
 */
public class TblOutcomeFrame extends javax.swing.JFrame {

    OutcomeController conn = new OutcomeController();
    private DefaultTableModel model;

    /**
     * Creates new form tblIncomeFrame
     */
    public TblOutcomeFrame() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        populateDataToTable();
        saldoAkhirPengeluaran();
    }

    public void populateDataToTable() throws SQLException {
//        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
//        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
//
//        formatRp.setCurrencySymbol("Rp. ");
//        formatRp.setMonetaryDecimalSeparator(',');
//        formatRp.setGroupingSeparator('.');
//
//        kursIndo.setDecimalFormatSymbols(formatRp);
        model = (DefaultTableModel) tblOutcome.getModel();
        List<Outcome> ouc = conn.loadOutcome();
        int i = 1;
        for (Outcome oc : ouc) {
            Object[] row = new Object[5];
            row[0] = i++;
            row[1] = oc.getCode_outcome();
            row[2] = oc.getTgl_outcome();
            row[3] = oc.getJml_outcome();
            row[4] = oc.getKet_outcome();
            model.addRow(row);
        }
    }

    public void refreshTable() throws SQLException {
        tfJumlahOutcome.setText("");
        tfCodeOutcome.setText("");
        tfKeteranganOutcome.setText("");
        DefaultTableModel model = (DefaultTableModel) tblOutcome.getModel();
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

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOutcome = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        incomeBtn = new javax.swing.JButton();
        outcomeBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblTotalOutcome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfJumlahOutcome = new javax.swing.JTextField();
        tfKeteranganOutcome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSubmitOutcome = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        tfTanggalOutcome = new com.toedter.calendar.JDateChooser();
        tfCodeOutcome = new javax.swing.JTextField();
        btnUbahOutcome = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Rp.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblOutcome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode transaksi", "Tanggal", "Jumlah", "Keterangan"
            }
        ));
        tblOutcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOutcomeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOutcome);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetsNetbean/home.png"))); // NOI18N
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        incomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetsNetbean/input-50x50.png"))); // NOI18N
        incomeBtn.setText("Pemasukan");
        incomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeBtnActionPerformed(evt);
            }
        });

        outcomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetsNetbean/output-50x50.png"))); // NOI18N
        outcomeBtn.setText("Pengeluaran");
        outcomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outcomeBtnActionPerformed(evt);
            }
        });

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetsNetbean/logout-50x50.png"))); // NOI18N
        logoutBtn.setText("Keluar");
        logoutBtn.setToolTipText("");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(incomeBtn)
                .addGap(34, 34, 34)
                .addComponent(outcomeBtn)
                .addGap(33, 33, 33)
                .addComponent(logoutBtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(incomeBtn)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(homeBtn)
                .addComponent(logoutBtn)
                .addComponent(outcomeBtn))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lblTotalOutcome.setText("Rp.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(lblTotalOutcome)
                .addGap(40, 40, 40))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalOutcome)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel5.setText("Total Outcome");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(102, 102, 102)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        tfKeteranganOutcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKeteranganOutcomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Jumlah :");

        jLabel6.setText("Tanggal :");

        jLabel7.setText("Keterangan :");

        jLabel8.setText("Tambah Outcome");

        btnSubmitOutcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetsNetbean/add25x25.png"))); // NOI18N
        btnSubmitOutcome.setText("+ Tambah");
        btnSubmitOutcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOutcomeActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetsNetbean/rubbish-bin-delete-button25x25.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tfCodeOutcome.setBackground(new java.awt.Color(240, 240, 240));

        btnUbahOutcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assetsNetbean/pencil-edit-button25x25.png"))); // NOI18N
        btnUbahOutcome.setText("Ubah");
        btnUbahOutcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahOutcomeActionPerformed(evt);
            }
        });

        jLabel9.setText("ID :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(tfKeteranganOutcome, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(btnSubmitOutcome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodeOutcome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfJumlahOutcome, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTanggalOutcome, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnUbahOutcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUbahOutcome)
                            .addComponent(btnSubmitOutcome)
                            .addComponent(btnHapus))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCodeOutcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfJumlahOutcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfTanggalOutcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tfKeteranganOutcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void incomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeBtnActionPerformed
        try {
            new TblIncomeFrame().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TblOutcomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_incomeBtnActionPerformed

    private void outcomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outcomeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outcomeBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        try {
            new HomeFrame().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TblOutcomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void tfKeteranganOutcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKeteranganOutcomeActionPerformed

    }//GEN-LAST:event_tfKeteranganOutcomeActionPerformed

    private void btnSubmitOutcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOutcomeActionPerformed
        if (!(tfJumlahOutcome.getText().equals("")) || !(tfCodeOutcome.getText().equals("")) || !(tfKeteranganOutcome.getText().equals(""))) {

            int status = 0;

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            int jml_outcome = Integer.parseInt(tfJumlahOutcome.getText());
            String ket_outcome = tfKeteranganOutcome.getText();
            String tgl_outcome = sdf.format(tfTanggalOutcome.getDate());
            int code_outcome = Integer.parseInt(tfCodeOutcome.getText());

            OutcomeController outC = new OutcomeController();
            try {
                status = outC.insert(new Outcome(jml_outcome, ket_outcome, tgl_outcome, code_outcome));
                refreshTable();
            } catch (SQLException ex) {
                Logger.getLogger(TblIncomeFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data outcome berhasil ditambahkan");
            } else {
                JOptionPane.showMessageDialog(this, "Data outcome gagal ditambahkan");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Masukan data outcome terlebih dahulu");
        }


    }//GEN-LAST:event_btnSubmitOutcomeActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (!(tfJumlahOutcome.getText().equals("")) || !(tfCodeOutcome.getText().equals("")) || !(tfKeteranganOutcome.getText().equals(""))) {
            int status = 0;

            try {
                DefaultTableModel model = (DefaultTableModel) tblOutcome.getModel();
                status = conn.delete(new Outcome(Integer.parseInt(tfJumlahOutcome.getText()),
                        String.valueOf(tfTanggalOutcome.getDate()),
                        tfKeteranganOutcome.getText(), Integer.parseInt(tfCodeOutcome.getText())));
                refreshTable();
            } catch (SQLException ex) {
                Logger.getLogger(TblOutcomeFrame.class.getName()).log(Level.SEVERE, null, ex);
                //            System.err.println("Gsgsl Hapus");
            }
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data outcome berhasil di hapus");
            } else {
                JOptionPane.showMessageDialog(this, "Data outcome gagal dihapus");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pilih data outcome yang ingin dihapus!");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblOutcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOutcomeMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) tblOutcome.getModel();
            int selectedIndex = tblOutcome.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(selectedIndex, 2));
            tfTanggalOutcome.setDate(date);
            tfCodeOutcome.setText(model.getValueAt(selectedIndex, 1).toString());
            tfJumlahOutcome.setText(model.getValueAt(selectedIndex, 3).toString());
            tfKeteranganOutcome.setText(model.getValueAt(selectedIndex, 4).toString());
        } catch (ParseException ex) {
            Logger.getLogger(TblIncomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblOutcomeMouseClicked

    private void btnUbahOutcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahOutcomeActionPerformed
        if (!(tfJumlahOutcome.getText().equals("")) || !(tfCodeOutcome.getText().equals("")) || !(tfKeteranganOutcome.getText().equals(""))) {

            int status = 0;

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            int jml_outcome = Integer.parseInt(tfJumlahOutcome.getText());
            String ket_outcome = tfKeteranganOutcome.getText();
            String tgl_outcome = sdf.format(tfTanggalOutcome.getDate());
            int code_outcome = Integer.parseInt(tfCodeOutcome.getText());

            OutcomeController outC = new OutcomeController();
            try {
                status = outC.update(new Outcome(jml_outcome, ket_outcome, tgl_outcome, code_outcome));
                refreshTable();
            } catch (SQLException ex) {
                Logger.getLogger(TblIncomeFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data outcome berhasil diubah");
            } else {
                JOptionPane.showMessageDialog(this, "Data outcome gagal diubah");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pilih data outcome yang ingin diubah!");
        }
    }//GEN-LAST:event_btnUbahOutcomeActionPerformed

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

    public void saldoAkhirPengeluaran() throws SQLException {
        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndo.setDecimalFormatSymbols(formatRp);
        List<Outcome> ouc = conn.loadOutcome();
        int ina = 0;
        for (Outcome outc : ouc) {
            ina += outc.getJml_outcome();
        }
        lblTotalOutcome.setText(kursIndo.format(ina));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSubmitOutcome;
    private javax.swing.JButton btnUbahOutcome;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton incomeBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalOutcome;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton outcomeBtn;
    private javax.swing.JTable tblOutcome;
    private javax.swing.JTextField tfCodeOutcome;
    private javax.swing.JTextField tfJumlahOutcome;
    private javax.swing.JTextField tfKeteranganOutcome;
    private com.toedter.calendar.JDateChooser tfTanggalOutcome;
    // End of variables declaration//GEN-END:variables
}
