import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOLWAZI
 */
public class AddNewQuestions extends javax.swing.JFrame {

    /**
     * Creates new form AddNewQuestions
     */
    public AddNewQuestions() {
        initComponents();
        
       try {
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select count(id)from question");
        if(rs.first()){
        int id =rs.getInt(1);
        id = id + 1;
        String str = String.valueOf(id);
        jLabel4.setText(str);
        }else
            jLabel4.setText("1");
        
        }
        catch(Exception e){
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jf, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 183));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(760, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(68, 76, 92));
        jPanel7.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Question ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Question");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Option 1");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Option 2");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Option 3");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Option 4");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Answer");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setText(" ");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addGap(42, 42, 42)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addGap(44, 44, 44)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7)
                        .addGap(44, 44, 44)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8)
                        .addGap(44, 44, 44)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9)
                        .addGap(44, 44, 44)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10)
                        .addGap(44, 44, 44)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton2)
                        .addGap(251, 251, 251)
                        .addComponent(jButton3)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10))
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 670, 490));

        jPanel9.setBackground(new java.awt.Color(170, 170, 170));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 760, 30));

        jPanel10.setBackground(new java.awt.Color(170, 170, 170));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ADD QUESTION");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_hero image covidEdited.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(86, 86, 86))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(260, 260, 260)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(260, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 760, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         String id = jLabel4.getText();
        String name = jTextField1.getText();
        String opt1 = jTextField2.getText();
        String opt2 = jTextField3.getText();
        String opt3 = jTextField4.getText();
        String opt4 = jTextField5.getText();
        String answer = jTextField6.getText();
        try{
        Connection con = ConnectionProvider.getCon();
        PreparedStatement ps = con.prepareStatement("insert into question values(?,?,?,?,?,?,?)");
        ps.setString (1,id);
         ps.setString (2,name);
          ps.setString (3,opt1);
           ps.setString (4,opt2);
            ps.setString (5,opt3);
             ps.setString (6,opt4);
              ps.setString (7,answer);
              ps.executeUpdate();
              JFrame jf = new JFrame();
              jf.setAlwaysOnTop(true);
              JOptionPane.showMessageDialog(jf,"Successfully updated");
              setVisible(false);
              new AddNewQuestions().setVisible(true);
        }
        catch(Exception e)
        {
        JFrame jf = new JFrame();
              jf.setAlwaysOnTop(true);
              JOptionPane.showMessageDialog(jf, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminHome.open = 0;
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
