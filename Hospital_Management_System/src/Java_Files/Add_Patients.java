/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Files;

import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pasindu
 */
public class Add_Patients extends javax.swing.JFrame {

    /**
     * Creates new form Add_Patients
     */
    public Add_Patients() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MaleButton = new javax.swing.JRadioButton();
        FemaleButton = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gcontact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboward = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        bedId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jaddress = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        docId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cornerstone", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 290, 30));

        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setText("NIC");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel1.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 340, 30));
        jPanel1.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 340, 30));
        jPanel1.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 340, 30));

        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        MaleButton.setText("Male");
        jPanel1.add(MaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 50, -1));

        FemaleButton.setText("Female");
        jPanel1.add(FemaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 160, -1));

        jLabel9.setText("Date of Birth");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel6.setText("Guardian Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));
        jPanel1.add(gname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 300, 30));

        jLabel7.setText("Guardian Contact");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        jPanel1.add(gcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 300, 30));

        jLabel8.setText("Ward Number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        comboward.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maternity", "Pediatrics", "Oncology", "Gynecologist", "General surgery" }));
        comboward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combowardActionPerformed(evt);
            }
        });
        jPanel1.add(comboward, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 150, -1));

        jLabel10.setText("Allocated Bed Number");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));
        jPanel1.add(bedId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 90, 30));

        jLabel11.setText("Admitted Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jDateChooser2.setDateFormatString("yyyy-MM-d");
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 140, 30));

        jLabel12.setText("Address");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jaddress.setColumns(20);
        jaddress.setRows(5);
        jScrollPane1.setViewportView(jaddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 330, 60));

        jLabel14.setText("Consulted Doctor ID");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));
        jPanel1.add(docId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 90, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID", "Doctor Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 170, 100));

        jButton1.setFont(new java.awt.Font("Verdana Pro Cond", 0, 14)); // NOI18N
        jButton1.setText("view");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 60, -1));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jButton3.setText("cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, -1));

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(461, 644));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ResultSet RS = dbcon.search("SELECT doctor.docId, employee.FName FROM doctor, employee WHERE doctor.empId = employee.empId;");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            while (RS.next()) {                
                Vector v = new Vector();
                v.add(RS.getInt("docId"));                
                v.add(RS.getString("FName"));
                dtm.addRow(v);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String FirstName = Fname.getText();
        String LastName = Lname.getText();
        String NIC = nic.getText();
        String Gender;
        if (MaleButton.isSelected()) {
            Gender = "M";
        }else{
            Gender = "F";
        }
        String dateOB = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        String address = jaddress.getText();
        String guardianName = gname.getText();
        String guardianContact = gcontact.getText();
        int wardId = comboward.getSelectedIndex();
        String admitDate = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
        int AllocatedBedId = Integer.parseInt(bedId.getText());
        int consultDocId = Integer.parseInt(docId.getText());
        try {
            dbcon.IUD("INSERT INTO patient(FName, LName, gender, NIC, DOB, address, guardianName, guardianContact, wardId, admitDate, consultDocId) VALUES('"+FirstName+"', '"+LastName+"', '"+Gender+"', '"+NIC+"', '"+dateOB+"', '"+address+"', '"+guardianName+"', '"+guardianContact+"', "+wardId+",  '"+admitDate+"', "+consultDocId+")");
            ResultSet RS = dbcon.search("SELECT patientId from patient WHERE NIC='"+NIC+"'");
            int patientId = 0;
            while (RS.next()) {                
                patientId = RS.getInt(1);
            }
            dbcon.IUD("INSERT INTO bedId(bedId, patientId, wardId) VALUES("+AllocatedBedId+","+patientId+", "+wardId+")");
        } catch (Exception ex) {
            ex.printStackTrace();
            // create a jframe
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");

            // show a joptionpane dialog using showMessageDialog
            JOptionPane.showMessageDialog(frame,
                "Oops something went wrong","Query Failed",JOptionPane.ERROR_MESSAGE);
        }
        
        // create a jframe
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        
        // show a joptionpane dialog using showMessageDialog
        JOptionPane.showMessageDialog(frame,
            "Successfully added","Query Executed",JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearFields();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void combowardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combowardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combowardActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Patients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FemaleButton;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JRadioButton MaleButton;
    private javax.swing.JTextField bedId;
    private javax.swing.JComboBox comboward;
    private javax.swing.JTextField docId;
    private javax.swing.JTextField gcontact;
    private javax.swing.JTextField gname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jaddress;
    private javax.swing.JTextField nic;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        Fname.setText(null);
        Lname.setText(null);
        nic.setText(null);
        MaleButton.setSelected(true);
        jDateChooser1.setDate(null);
        jaddress.setText(null);
        gname.setText(null);
        gcontact.setText(null);
        jDateChooser2.setDate(null);
        comboward.setSelectedIndex(0);
        bedId.setText(null);
        docId.setText(null);
    }
}
