/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Files;

import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Pasindu
 */
public class payment_Gateway extends javax.swing.JFrame {

    /**
     * Creates new form payment_Gateway
     */
    private String NICnum;
    private int AdministratorEmpId;
    public payment_Gateway(int adminEmpId) {
        //This is the payment gateway for patients
        AdministratorEmpId = adminEmpId;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NICText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FromTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BedIDTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AmountdueTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cashChk = new javax.swing.JCheckBox();
        CCchk = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        paidAmountTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BalanceTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        errorMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cornerstone", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 250, -1));

        jLabel2.setText("NIC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 40, -1));
        jPanel1.add(NICText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 210, 30));

        jLabel3.setText("From");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel1.add(FromTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 70, -1));

        jLabel4.setText("To");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel1.add(NameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 210, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 90, -1));

        jLabel6.setText("BedId");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel1.add(BedIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 70, -1));

        jLabel7.setText("Amount Due");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        jPanel1.add(AmountdueTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 140, -1));

        jLabel8.setText("Payment Method");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        buttonGroup1.add(cashChk);
        cashChk.setText("Cash");
        jPanel1.add(cashChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        buttonGroup1.add(CCchk);
        CCchk.setText("Credit Card");
        jPanel1.add(CCchk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel9.setText("Paid Amount");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        jPanel1.add(paidAmountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 140, -1));

        jLabel10.setText("Balance");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
        jPanel1.add(BalanceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 140, -1));

        jLabel11.setText("Paid Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jDateChooser1.setDateFormatString("yyyy-MM-d"); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jButton2.setText("Record Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        jDateChooser2.setDateFormatString("yyyy-MM-d"); // NOI18N
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jButton5.setText("Tabulate");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 60, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("LKR");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("LKR");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("LKR");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));
        jPanel1.add(errorMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 230, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(435, 546));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NICnum = NICText.getText();
        
        try {
            ResultSet RS = dbcon.search("SELECT * FROM patient WHERE NIC='"+NICnum+"'");
            if (RS.next()) {                  
                errorMsg.setText(null); 
                NameTxt.setText(RS.getString("FName") + " " + RS.getString("LName"));
                FromTxt.setText(RS.getString("admitDate"));
                BedIDTxt.setText(String.valueOf(RS.getInt("bedId")));
            }else{
                errorMsg.setText("No such record found. Please recheck the NIC."); //Generates an error message
            }
            /*Amount due has to be calculated from the difference of dates between from and to*/
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");

            JOptionPane.showMessageDialog(frame,
                "Something went Wrong",
                "Oops",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String firstDay = FromTxt.getText();
        String lastDate = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
        String amountDue = AmountdueTxt.getText(); //This comes in String so make sure to change it to int
        String paymentMethod;
        if (cashChk.isSelected()) {
            paymentMethod = "Cash";
        }else{
            paymentMethod = "CreditCard";
        }
        String paidAmount = paidAmountTxt.getText(); //This comes in String so make sure to change it to int
        String balance = BalanceTxt.getText(); //This comes in String so make sure to change it to int
        String paidDate = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        
        long stayedDays = dateDifference(firstDay, lastDate);
        
        int patientIdNum = 0;
        try {
            //Updating payment table
            ResultSet RS = dbcon.search("SELECT patientId from patient WHERE NIC='"+NICText.getText()+"'");
            patientIdNum = RS.getInt(1);
            
            dbcon.IUD("INSERT INTO payment(patientId, Stayed_days, amountdue, paidAmount, paymentMethod, balance, paidDate) VALUES ("+patientIdNum+", "+stayedDays+", "+Integer.parseInt(amountDue)+", "+Integer.parseInt(paidAmount)+", '"+paymentMethod+"', "+Integer.parseInt(balance)+", '"+paidDate+"' )");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Using Jaspersoft - iReport generate a report
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            
            JOptionPane.showMessageDialog(frame,
                "Jaspersoft iReport feature will be added soon",
                "updates will come",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String firstDay = FromTxt.getText();
        String lastDate = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
        
        long stayedDays = dateDifference(firstDay, lastDate);
        
        //Assume the unit charge per day is 250
        
        AmountdueTxt.setText(String.valueOf((float)250.00* stayedDays));
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(payment_Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment_Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment_Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment_Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment_Gateway(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountdueTxt;
    private javax.swing.JTextField BalanceTxt;
    private javax.swing.JTextField BedIDTxt;
    private javax.swing.JCheckBox CCchk;
    private javax.swing.JTextField FromTxt;
    private javax.swing.JTextField NICText;
    private javax.swing.JTextField NameTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cashChk;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField paidAmountTxt;
    // End of variables declaration//GEN-END:variables

    private long dateDifference(String initDay, String finalDay) {
        //Calculates the date difference for two String parameters - First date and last date
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        long days = 0;
        try {
            Date date1 = myFormat.parse(initDay);
            Date date2 = myFormat.parse(finalDay);
            long diff = date2.getTime() - date1.getTime();
            days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }
}
