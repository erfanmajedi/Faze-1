package Adder;

import javax.swing.JLabel;

/**
 * add student class get info from the student that login to the system and wants his/her
 * name , lastname , id , level of study and the major that he/her study in
 * @author Erfan Majedi
 * @since 2020.6.12
 */
public class AddStudent extends javax.swing.JFrame {
    /**
     * constructor for add student that we call initComponents() and make a combo box for the level of majors
     * and we make the program to start in center of the screen
     */
    public AddStudent() {
        initComponents();
        ((JLabel)jComboBoxCourse.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);//Right to left JComboBox
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * here we make our panel then we have five labels and one combo box for level of majors and
     * four text field for name , lastname , id and what are the student majoring in
     * we have to buttons as well for cancel and add the student to the list
     */
    private void initComponents() {
        // make an object for jPanel2
        jPanel2 = new javax.swing.JPanel();
        // make an object for jLabel1
        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        // make an object for jLabel2
        jLabel2 = new javax.swing.JLabel();
        // make an object for jTextFieldFamily
        jTextFieldFamily = new javax.swing.JTextField();
        // make an object for jLabel3
        jLabel3 = new javax.swing.JLabel();
        // make an object for jTextFieldStudentNumber
        jTextFieldStudentNumber = new javax.swing.JTextField();
        // make an object for jLabel4
        jLabel4 = new javax.swing.JLabel();
        // make an object for jComboBoxCourse
        jComboBoxCourse = new javax.swing.JComboBox<>();
        // make an object for jButtonAddStudent
        jButtonAddStudent = new javax.swing.JButton();
        // make an object for jButtonCancel
        jButtonCancel = new javax.swing.JButton();
        // make an object for jLabel5
        jLabel5 = new javax.swing.JLabel();
        // make an object for jTextFieldCourse
        jTextFieldCourse = new javax.swing.JTextField();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set font for our frame
        setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        // set text for jLabel1
        jLabel1.setText("نام:");
        // set text for jLabel2
        jLabel2.setText("نام خانوادگی:");
        // set text for jLabel3
        jLabel3.setText("شماره دانشجویی:");
        // set text for jLabel4
        jLabel4.setText("مقطع تحصیلی:");
        // we set the level of majors in the combo box
        jComboBoxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "کاردانی", "کارشناسی", "کارشناسی ارشد", "دکتری" }));
        // set text for jButtonAddStudent
        jButtonAddStudent.setText("افزودن");
        // add the button to the program
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "افزودن" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });
        // set text for jButtonCancel
        jButtonCancel.setText("انصراف");
        // add the button to the program
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "انصراف" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        // set text for jLabel5
        jLabel5.setText("رشته تحصیلی:");
        /**
         * here we use javax.swing.GroupLayout for hierarchically group the components and arranges them in a Container
         * A sequential group positions its child elements sequentially, one after another
         * A parallel group aligns its child elements in different ways.
         */
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        // set layout for jPanel2
        jPanel2.setLayout(jPanel2Layout);
        // we setHorizontalGroup for jPanel2Layout
        jPanel2Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 96, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jComboBoxCourse, 0, 189, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldStudentNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextFieldName)
                                                        .addComponent(jTextFieldFamily)
                                                        .addComponent(jTextFieldCourse))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel5)
                                                                .addComponent(jLabel4))
                                                        .addComponent(jLabel1)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)))
                                .addContainerGap())
        );
        // we setVerticalGroup for jPanel2Layout
        jPanel2Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextFieldFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jComboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonAddStudent)
                                        .addComponent(jButtonCancel))
                                .addGap(26, 26, 26))
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
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * this method is empty because in this faze we don't want to add button to work
     * @param evt
     */
    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed

    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    /**
     * after we click the "خروج" button
     * this method comes out of the specific icon
     * @param evt
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JComboBox<String> jComboBoxCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCourse;
    private javax.swing.JTextField jTextFieldFamily;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldStudentNumber;
    // End of variables declaration//GEN-END:variables
}

