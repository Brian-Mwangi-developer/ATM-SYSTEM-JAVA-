/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.atmsystem;

import atmmanagement.Mainmenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author BLESSEDSON
 */
public class FASTCASH extends javax.swing.JFrame {

    /**
     * Creates new form FASTCASH
     */
    public FASTCASH() {
        initComponents();
    }
     int MyAccNum;
            public FASTCASH(int AccNum) {
                initComponents(); 
                MyAccNum=   AccNum;
              //  accnamelbl.setText(""+AccNum);
                GetBalance();
            }
        Connection Con = null;
        PreparedStatement pst =null,pst1=null;
        ResultSet Rs = null, Rs1=null;
        Statement St = null,St1=null;
        int Oldbalance;
       
     private void GetBalance()
     {
           String Query = "select  *  from Accounttbl  where AccNum =' "+MyAccNum+ " ' " ;
        try {
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
               St1 = Con.createStatement();
               Rs1 = St1.executeQuery(Query);
               /** if correct information Main menu becomes visible else message with wrong information**/
               if(Rs1.next()){
                   /** Takes the value present in index 9 of the database table**/
                   Oldbalance = Rs1.getInt(9) ;
                   ballbl.setText(""+Oldbalance);
                 
               }else{
                   //JOptionPane.showMessageDialog(this, "Wrong  Account Number or Pin");
               }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, e);
        }
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fiveHun = new javax.swing.JButton();
        fiveTh = new javax.swing.JButton();
        thousand = new javax.swing.JButton();
        twoth = new javax.swing.JButton();
        fifteenth = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        twentyth = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ballbl = new javax.swing.JLabel();
        balancelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        jLabel1.setText("CODESPACE ATM");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(262, 262, 262)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        fiveHun.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        fiveHun.setText("500 ksh");
        fiveHun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveHunActionPerformed(evt);
            }
        });

        fiveTh.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        fiveTh.setText("5,000 Ksh");
        fiveTh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveThActionPerformed(evt);
            }
        });

        thousand.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        thousand.setText("1000 Ksh");
        thousand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thousandActionPerformed(evt);
            }
        });

        twoth.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        twoth.setText("2,000Ksh");
        twoth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twothMouseClicked(evt);
            }
        });
        twoth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twothActionPerformed(evt);
            }
        });

        fifteenth.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        fifteenth.setText("15,000 Ksh");
        fifteenth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifteenthActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        jLabel3.setText("FAST CASH");

        twentyth.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        twentyth.setText("20,000 Ksh");
        twentyth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentythActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("CODESPACE ATM");

        ballbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 28)); // NOI18N
        ballbl.setText("Amount");

        balancelbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        balancelbl.setText("Balance:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(332, 332, 332))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fiveHun, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fifteenth, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveTh, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(balancelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ballbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thousand, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoth, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentyth, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiveHun, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thousand, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(twoth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ballbl)
                                    .addComponent(balancelbl)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(fiveTh, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(705, 705, 705)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fifteenth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentyth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fiveHunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveHunActionPerformed
        if(Oldbalance<500)
        {JOptionPane.showMessageDialog(this,"Balance not enough");
        }
              else  {
            try {
            String Query = "update AccountTbl  set  Balance= ? where  AccNum= ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,Oldbalance - 500);
            ps.setInt(2, MyAccNum);
            if( ps.executeUpdate() ==1){
                JOptionPane.showMessageDialog(this, "Transaction Succesfull");
                ;
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");  
              ;
            }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

    }//GEN-LAST:event_fiveHunActionPerformed
    }
    private void fiveThActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveThActionPerformed
         if(Oldbalance<5000)
        {JOptionPane.showMessageDialog(this,"Balance not enough");
        }
              else  {
            try {
            String Query = "update AccountTbl  set  Balance= ? where  AccNum= ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,Oldbalance - 5000);
            ps.setInt(2, MyAccNum);
            if( ps.executeUpdate() ==1){
                JOptionPane.showMessageDialog(this, "Transaction Succesfull");
                ;
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");  
              ;
            }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

    }                  
    }//GEN-LAST:event_fiveThActionPerformed

    private void thousandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thousandActionPerformed
         if(Oldbalance<1000)
        {JOptionPane.showMessageDialog(this,"Balance not enough");
        }
              else  {
            try {
            String Query = "update AccountTbl  set  Balance= ? where  AccNum= ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,Oldbalance - 1000);
            ps.setInt(2, MyAccNum);
            if( ps.executeUpdate() ==1){
                JOptionPane.showMessageDialog(this, "Transaction Succesfull");
                ;
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");  
              ;
            }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

    }                  
    }//GEN-LAST:event_thousandActionPerformed

    private void twothActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twothActionPerformed
         if(Oldbalance<2000)
        {JOptionPane.showMessageDialog(this,"Balance not enough");
        }
              else  {
            try {
            String Query = "update AccountTbl  set  Balance= ? where  AccNum= ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,Oldbalance - 2000);
            ps.setInt(2, MyAccNum);
            if( ps.executeUpdate() ==1){
                JOptionPane.showMessageDialog(this, "Transaction Succesfull");
                ;
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");  
              ;
            }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

    }                  
    }//GEN-LAST:event_twothActionPerformed

    private void fifteenthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifteenthActionPerformed
         if(Oldbalance<15000)
        {JOptionPane.showMessageDialog(this,"Balance not enough");
        }
              else  {
            try {
            String Query = "update AccountTbl  set  Balance= ? where  AccNum= ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,Oldbalance - 15000);
            ps.setInt(2, MyAccNum);
            if( ps.executeUpdate() ==1){
                JOptionPane.showMessageDialog(this, "Transaction Succesfull");
                ;
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");  
              ;
            }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

    }                  
    }//GEN-LAST:event_fifteenthActionPerformed

    private void twentythActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentythActionPerformed
         if(Oldbalance<20000)
        {JOptionPane.showMessageDialog(this,"Balance not enough");
        }
              else  {
            try {
            String Query = "update AccountTbl  set  Balance= ? where  AccNum= ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,Oldbalance - 20000);
            ps.setInt(2, MyAccNum);
            if( ps.executeUpdate() ==1){
                JOptionPane.showMessageDialog(this, "Transaction Succesfull");
                ;
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");  
              ;
            }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

    }                  
    }//GEN-LAST:event_twentythActionPerformed

    private void twothMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twothMouseClicked
                  
    }//GEN-LAST:event_twothMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       new Mainmenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FASTCASH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balancelbl;
    private javax.swing.JLabel ballbl;
    private javax.swing.JButton fifteenth;
    private javax.swing.JButton fiveHun;
    private javax.swing.JButton fiveTh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton thousand;
    private javax.swing.JButton twentyth;
    private javax.swing.JButton twoth;
    // End of variables declaration//GEN-END:variables
}
