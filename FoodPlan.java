package FoodPlan;

/**
 * FoodPlan represents a schedule for each day and each meal that a student needs to eat
 * @author Erfan Majedi
 * @since 2020.5.12
 */
public class FoodPlan extends javax.swing.JFrame {
    /**
     * Constructor for FoodPlan that we again make the program open in the center of screen
     */
    public FoodPlan() {
        initComponents();
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * in this method we make some necessary objects
     */
    private void initComponents() {
        // make object for jPanel1
        jPanel1 = new javax.swing.JPanel();
        // make object for jLabel1
        jLabel1 = new javax.swing.JLabel();
        // make object for jLabel2
        jLabel2 = new javax.swing.JLabel();
        // make object for jLabel3
        jLabel3 = new javax.swing.JLabel();
        // make object for jPanel2
        jPanel2 = new javax.swing.JPanel();
        // make object for jLabel32
        jLabel32 = new javax.swing.JLabel();
        // make object for jLabel33
        jLabel33 = new javax.swing.JLabel();
        // make object for jLabel34
        jLabel34 = new javax.swing.JLabel();
        // make object for jLabel35
        jLabel35 = new javax.swing.JLabel();
        // make object for jLabel36
        jLabel36 = new javax.swing.JLabel();
        // make object for jLabel37
        jLabel37 = new javax.swing.JLabel();
        // make object for jLabel38
        jLabel38 = new javax.swing.JLabel();
        // make object for jButtonOK
        jButtonOK = new javax.swing.JButton();
        // make object for jButtonCancel
        jButtonCancel = new javax.swing.JButton();
        // make object for jPanel3
        jPanel3 = new javax.swing.JPanel();
        // make object for jTextField1
        jTextField1 = new javax.swing.JTextField();
        // make object for jTextField6
        jTextField6 = new javax.swing.JTextField();
        // make object for jTextField9
        jTextField9 = new javax.swing.JTextField();
        // make object for jTextField12
        jTextField12 = new javax.swing.JTextField();
        // make object for jTextField15
        jTextField15 = new javax.swing.JTextField();
        // make object for jTextField18
        jTextField18 = new javax.swing.JTextField();
        // make object for jTextField21
        jTextField21 = new javax.swing.JTextField();
        // make object for jPanel4
        jPanel4 = new javax.swing.JPanel();
        // make object for jTextField20
        jTextField20 = new javax.swing.JTextField();
        // make object for jTextField17
        jTextField17 = new javax.swing.JTextField();
        // make object for jTextField14
        jTextField14 = new javax.swing.JTextField();
        // make object for jTextField10
        jTextField10 = new javax.swing.JTextField();
        // make object for jTextField7
        jTextField7 = new javax.swing.JTextField();
        // make object for jTextField4
        jTextField4 = new javax.swing.JTextField();
        // make object for jTextField2
        jTextField2 = new javax.swing.JTextField();
        // make object for jPanel5
        jPanel5 = new javax.swing.JPanel();
        //// make object for jTextField3
        jTextField3 = new javax.swing.JTextField();
        // make object for jTextField5
        jTextField5 = new javax.swing.JTextField();
        // make object for jTextField8
        jTextField8 = new javax.swing.JTextField();
        // make object for jTextField11
        jTextField11 = new javax.swing.JTextField();
        // make object for jTextField13
        jTextField13 = new javax.swing.JTextField();
        // make object for jTextField16
        jTextField16 = new javax.swing.JTextField();
        // make object for jTextField19
        jTextField19 = new javax.swing.JTextField();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //set layout for getContentPane()
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        //set layout for jPanel1
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        //set the color for jLabel1 using setForeground
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        // set text for jLabel1
        jLabel1.setText("صبحانه");
        //add jLabel1 to jPanel1
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 11, -1, -1));
        //set the color for jLabel2 using setForeground
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        // set text for jLabel2
        jLabel2.setText("ناهار");
        //add jLabel2 to jPanel1
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 11, -1, -1));
        //set the color for jLabel3 using setForeground
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        // set text for jLabel3
        jLabel3.setText("شام");
        //add jLabel3 to jPanel1
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 11, -1, -1));
        //add jPanel1 to getContentPane()
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 610, -1));
        //set layout for jPanel2
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set text for jLabel32
        jLabel32.setText("شنبه");
        //add jLabel32 to jPanel2
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, -1, -1));
        // set text for jLabel33
        jLabel33.setText("یکشنبه");
        //add jLabel33 to jPanel2
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        // set text for jLabel34
        jLabel34.setText("دوشنبه");
        //add jLabel34 to jPanel2
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, -1, -1));
        // set text for jLabel35
        jLabel35.setText("سه شنبه");
        //add jLabel35 to jPanel2
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, -1, -1));
        // set text for jLabel36
        jLabel36.setText("چهارشنبه");
        //add jLabel36 to jPanel2
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, -1, -1));
        // set text for jLabel37
        jLabel37.setText("جمعه");
        //add jLabel37 to jPanel2
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 258, -1, -1));
        // set text for jLabel38
        jLabel38.setText("پنجشنبه");
        //add jLabel38 to jPanel2
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 219, -1, -1));
        //add jPanel2 to getContentPane()
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));
        // set text for jButtonOk
        jButtonOK.setText("تایید");
        // add jButtonOk to getContentPane()
        getContentPane().add(jButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 213, -1));
        // set text for jButtonCancel
        jButtonCancel.setText("خروج");
        //add the jButtonCloseClass to program
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke jButtonCloseClass button for "خروج"
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        // add jButtonCancel to getContentPane()
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 207, -1));
        //set layout for jPanel3
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        //add jTextField1 to jPanel3
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 11, 135, -1));
        //add jTextField6 to jPanel3
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 49, 135, -1));
        //add jTextField9 to jPanel3
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 87, 135, -1));
        //add jTextField12 to jPanel3
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 125, 135, -1));
        //add jTextField15 to jPanel3
        jPanel3.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 163, 135, -1));
        //add jTextField18 to jPanel3
        jPanel3.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 201, 135, -1));
        //add the jTextField21 to program
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke jTextField21
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        //add jTextField21 to jPanel3
        jPanel3.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 239, 135, -1));
        // add jPanel3 to getContentPane()
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));
        //set layout for jPanel4
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // add jTextField20 to jPanel4
        jPanel4.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 239, 135, -1));
        // add jTextField17 to jPanel4
        jPanel4.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 201, 135, -1));
        // add jTextField14 to jPanel4
        jPanel4.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 163, 135, -1));
        // add jTextField10 to jPanel4
        jPanel4.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 125, 135, -1));
        // add jTextField7 to jPanel4
        jPanel4.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 87, 135, -1));
        // add jTextField4 to jPanel4
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 49, 135, -1));
        // add jTextField22 to jPanel4
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 11, 135, -1));
        // add jPanel4 to getContentPane()
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 283));
        // set layout for jPanel5
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // add jTextField3 to jPanel5
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 135, -1));
        //add jTextField5 to jPanel5
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 49, 135, -1));
        //add jTextField8 to jPanel5
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 87, 135, -1));
        //add jTextField11 to jPanel5
        jPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, 135, -1));
        //add jTextField13 to jPanel5
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 163, 135, -1));
        //add jTextField16 to jPanel5
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 201, 135, -1));
        //add jTextField19 to jPanel5
        jPanel5.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 239, 135, -1));
        // add jPanel5 to getContentPane()
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * this method has a to do jTextField21
     * @param evt
     */
    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    /**
     * in this method we use dispose() to exit the specific icon
     * @param evt
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanselActionPerformed
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCancelActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultState="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(FoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodPlan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

