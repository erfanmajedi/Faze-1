package Student;


import javax.swing.JLabel;

/**
 * in this class the student can choose his/her class and click the button to add it to the list
 * we used combo box for the suggestions of which lesson he/she want to choose
 * @author Erfan Majedi
 * @since 2020.8.12
 */
public class StudentChooseClass extends javax.swing.JFrame {
    /**
     * constructor for studentChooseClass that we call initComponents() in it and we make a combo box to
     * show us the suggestions from right to left then we make the program to start in the center of the screen
     */
    public StudentChooseClass() {
        initComponents();
        ((JLabel)jComboBoxClasses.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);//Right to left JComboBox
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * in this method we make our panel and some necessary buttons,labels
     * also we make the ability of scroll and we have a table for the class list
     * and we make a comboBox for the suggestions
     */
    private void initComponents() {
        // make an object for jPanel1
        jPanel1 = new javax.swing.JPanel();
        // make an object for jLabel1
        jLabel1 = new javax.swing.JLabel();
        // make an object for jComboBoxClasses
        jComboBoxClasses = new javax.swing.JComboBox<>();
        // make an object for jButtonChooseClass
        jButtonChooseClass = new javax.swing.JButton();
        // make an object for jScrollPane2
        jScrollPane2 = new javax.swing.JScrollPane();
        // make an object for jTable1
        jTable1 = new javax.swing.JTable();
        // make an object for jButtonOK
        jButtonOK = new javax.swing.JButton();
        // make an object for jButtonCancel
        jButtonCancel = new javax.swing.JButton();
        // we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set layout for getContentPane()
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set text for jLabel1
        jLabel1.setText("انتخاب کلاس:");
        // set the suggestions for our comboBox
        jComboBoxClasses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ریاضی 1", "ریاضی 2", "برنامه نویسی پیشرفته", "ساختمان داده" }));
        // set text for jButtonChooseClass
        jButtonChooseClass.setText("انتخاب کلاس");
        // add the button to the program
        jButtonChooseClass.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "انتخاب کلاس" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseClassActionPerformed(evt);
            }
        });
        // set model for the jTable1 that represents the list of classes
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                // set all of the fields null
                new Object [][] {
                        {null},
                        {null},
                        {null},
                        {null}
                },
                // set a name
                new String [] {
                        "لیست دروس"
                }
        ));
        // make the ability to scroll over the jTable1
        jScrollPane2.setViewportView(jTable1);
        /**
         * here we use javax.swing.GroupLayout for hierarchically group the components and arranges them in a Container
         * A sequential group positions its child elements sequentially, one after another
         * A parallel group aligns its child elements in different ways.
         */
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        // set layout for jPanel1
        jPanel1.setLayout(jPanel1Layout);
        // we setHorizontalGroup for jPanel1Layout
        jPanel1Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonChooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                                .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1)))
                                .addContainerGap())
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonChooseClass))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addContainerGap())
        );
        // add jPanel1 to the getContentPane()
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 540, 290));
        // set text for jButtonOk
        jButtonOK.setText("تایید");
        // add the button to the getContentPane()
        getContentPane().add(jButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 230, -1));
        // set text for jButtonCancel
        jButtonCancel.setText("خروج");
        // add the button to the program
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "خروج" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        // add the button to the getContentPane()
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 230, -1));

        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * this method get out of the frame
     * @param evt
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * this method is empty because we don't want it to work
     * @param evt
     */
    private void jButtonChooseClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseClassActionPerformed

    }//GEN-LAST:event_jButtonChooseClassActionPerformed

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
            java.util.logging.Logger.getLogger(StudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentChooseClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChooseClass;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox<String> jComboBoxClasses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
