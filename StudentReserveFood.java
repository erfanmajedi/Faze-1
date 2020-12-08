package Student;
/**
 * in this class the student can reserve food and choose what does he/she want in each day
 * and reserve it
 * @author Erfan Majedi
 * @since 2020.8.12
 */
public class StudentReserveFood extends javax.swing.JFrame {
    /**
     * constructor for StudentReserveFood that we call initComponents()
     * and we make the program to start in the middle of screen
     */
    public StudentReserveFood() {
        initComponents();
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * in this method we make our panel and close , ok button we have some check box
     * we have labels too and ...
     */
    private void initComponents() {
        // make an object for jButtonClose
        jButtonClose = new javax.swing.JButton();
        // make an object for jButtonOk
        jButtonOK = new javax.swing.JButton();
        // make an object for jPanel4
        jPanel4 = new javax.swing.JPanel();
        // make an object for jCheckBox1
        jCheckBox1 = new javax.swing.JCheckBox();
        // make an object for jCheckBox2
        jCheckBox2 = new javax.swing.JCheckBox();
        // make an object for jCheckBox3
        jCheckBox3 = new javax.swing.JCheckBox();
        // make an object for jCheckBox4
        jCheckBox4 = new javax.swing.JCheckBox();
        // make an object for jCheckBox5
        jCheckBox5 = new javax.swing.JCheckBox();
        // make an object for jCheckBox6
        jCheckBox6 = new javax.swing.JCheckBox();
        // make an object for jCheckBox7
        jCheckBox7 = new javax.swing.JCheckBox();
        // make an object for jCheckBox8
        jCheckBox8 = new javax.swing.JCheckBox();
        // make an object for jCheckBox9
        jCheckBox9 = new javax.swing.JCheckBox();
        // make an object for jCheckBox10
        jCheckBox10 = new javax.swing.JCheckBox();
        // make an object for jCheckBox11
        jCheckBox11 = new javax.swing.JCheckBox();
        // make an object for jCheckBox12
        jCheckBox12 = new javax.swing.JCheckBox();
        // make an object for jCheckBox12
        jCheckBox13 = new javax.swing.JCheckBox();
        // make an object for jCheckBox14
        jCheckBox14 = new javax.swing.JCheckBox();
        // make an object for jCheckBox15
        jCheckBox15 = new javax.swing.JCheckBox();
        // make an object for jCheckBox16
        jCheckBox16 = new javax.swing.JCheckBox();
        // make an object for jCheckBox17
        jCheckBox17 = new javax.swing.JCheckBox();
        // make an object for jCheckBox18
        jCheckBox18 = new javax.swing.JCheckBox();
        // make an object for jCheckBox19
        jCheckBox19 = new javax.swing.JCheckBox();
        // make an object for jCheckBox20
        jCheckBox20 = new javax.swing.JCheckBox();
        // make an object for jCheckBox21
        jCheckBox21 = new javax.swing.JCheckBox();
        // make an object for jPanel2
        jPanel2 = new javax.swing.JPanel();
        // make an object for jLabel10
        jLabel10 = new javax.swing.JLabel();
        // make an object for jLabel11
        jLabel11 = new javax.swing.JLabel();
        // make an object for jLabel9
        jLabel9 = new javax.swing.JLabel();
        // make an object for jLabel8
        jLabel8 = new javax.swing.JLabel();
        // make an object for jLabel6
        jLabel6 = new javax.swing.JLabel();
        // make an object for jLabel5
        jLabel5 = new javax.swing.JLabel();
        // make an object for jLabel4
        jLabel4 = new javax.swing.JLabel();
        // make an object for jPanel3
        jPanel3 = new javax.swing.JPanel();
        // make an object for jLabel1
        jLabel1 = new javax.swing.JLabel();
        // make an object for jLabel2
        jLabel2 = new javax.swing.JLabel();
        // make an object for jLabel3
        jLabel3 = new javax.swing.JLabel();
        // we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set a title for the frame
        setTitle("برنامه غذایی");
        // set text for jButtonClose
        jButtonClose.setText("خروج");
        // add the button to the program
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "خروج" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        // set text for jButtonOk
        jButtonOK.setText("تایید");
        // set text for jCheckBox1
        jCheckBox1.setText("ناهار");
        // set text for jCheckBox2
        jCheckBox2.setText("شام");
        // set text for jCheckBox3
        jCheckBox3.setText("صبحانه");
        // set text for jCheckBox4
        jCheckBox4.setText("صبحانه");
        // set text for jCheckBox5
        jCheckBox5.setText("ناهار");
        // set text for jCheckBox6
        jCheckBox6.setText("شام");
        // set text for jCheckBox7
        jCheckBox7.setText("صبحانه");
        // set text for jCheckBox8
        jCheckBox8.setText("ناهار");
        // set text for jCheckBox9
        jCheckBox9.setText("شام");
        // set text for jCheckBox10
        jCheckBox10.setText("صبحانه");
        // set text for jCheckBox11
        jCheckBox11.setText("ناهار");
        // set text for jCheckBox12
        jCheckBox12.setText("شام");
        // set text for jCheckBox13
        jCheckBox13.setText("صبحانه");
        // set text for jCheckBox14
        jCheckBox14.setText("ناهار");
        // set text for jCheckBox15
        jCheckBox15.setText("شام");
        // set text for jCheckBox16
        jCheckBox16.setText("صبحانه");
        // set text for jCheckBox17
        jCheckBox17.setText("ناهار");
        // add the checkBox to the program
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ناهار" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });
        // set text for jCheckBox18
        jCheckBox18.setText("شام");
        // set text for jCheckBox19
        jCheckBox19.setText("صبحانه");
        // set text for jCheckBox20
        jCheckBox20.setText("ناهار");
        // add the checkBox to the program
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "ناهار" check box
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });
        // set text for jCheckBox21
        jCheckBox21.setText("شام");
        /**
         * here we use javax.swing.GroupLayout for hierarchically group the components and arranges them in a Container
         * A sequential group positions its child elements sequentially, one after another
         * A parallel group aligns its child elements in different ways.
         */
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        // set layout for jPanel4
        jPanel4.setLayout(jPanel4Layout);
        // we setHorizontalGroup for jPanel4Layout
        jPanel4Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addContainerGap(12, Short.MAX_VALUE)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jCheckBox19)
                                                        .addComponent(jCheckBox20))
                                                .addGap(18, 18, 18))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jCheckBox21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox16)
                                        .addComponent(jCheckBox17)
                                        .addComponent(jCheckBox6))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox13)
                                        .addComponent(jCheckBox14)
                                        .addComponent(jCheckBox18))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jCheckBox15)
                                                .addGap(125, 125, 125)
                                                .addComponent(jCheckBox12)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jCheckBox10)
                                                        .addComponent(jCheckBox11))
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jCheckBox7)
                                                        .addComponent(jCheckBox8)
                                                        .addComponent(jCheckBox9))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jCheckBox4)
                                                        .addComponent(jCheckBox5))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jCheckBox1)
                                                        .addComponent(jCheckBox3)
                                                        .addComponent(jCheckBox2))
                                                .addContainerGap())))
        );
        // we setVerticalGroup for jPanel4Layout
        jPanel4Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(21, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        //set text for jLabel10
        jLabel10.setText("جمعه");
        //set text for jLabel11
        jLabel11.setText("پنجشنبه");
        //set text for jLabel9
        jLabel9.setText("چهارشنبه");
        //set text for jLabel8
        jLabel8.setText("سه شنبه");
        //set text for jLabel6
        jLabel6.setText("دوشنبه");
        //set text for jLabel5
        jLabel5.setText("یکشنبه");
        //set text for jLabel4
        jLabel4.setText("شنبه");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        // set layout for jPanel2
        jPanel2.setLayout(jPanel2Layout);
        // we setHorizontalGroup for jPanel2Layout
        jPanel2Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel10)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel11)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel9)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel5)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)
                                .addContainerGap())
        );
        // we setVerticalGroup for jPanel2Layout
        jPanel2Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                .addContainerGap())
        );
        // set font for jLabel1
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        // set text for jLabel1
        jLabel1.setText("صبحانه");
        // set font for jLabel2
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        // set text for jLabel2
        jLabel2.setText("ناهار");
        // set font for jLabel3
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        // set text for jLabel3
        jLabel3.setText("شام");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        // set layout for jPanel3
        jPanel3.setLayout(jPanel3Layout);
        // we setHorizontalGroup for jPanel3Layout
        jPanel3Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addContainerGap(23, Short.MAX_VALUE))
        );
        // we setVerticalGroup for jPanel3Layout
        jPanel3Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28))
        );
        /**
         *  In Java Swing, the layer that is used to hold objects is called the content pane.
         *  Objects are added to the content pane layer of the container.
         *  The getContentPane() method retrieves the content pane layer so that you can add an object to it
         *  so here we use javax.swing.GroupLayout for objects that are in content pane
         */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        //set layout for each object in content pane
        getContentPane().setLayout(layout);
        // we setHorizontalGroup for layout
        layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonOK)
                                        .addComponent(jButtonClose))
                                .addContainerGap(24, Short.MAX_VALUE))
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * this method is for check box 17 and is empty
     * @param evt
     */
    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    /**
     * this method is for check box 20 and is empty
     * @param evt
     */
    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    /**
     * this method close the frame
     * @param evt
     */
    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

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
            java.util.logging.Logger.getLogger(StudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentReserveFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}

