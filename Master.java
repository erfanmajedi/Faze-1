package Master;

import CloseClass.CloseClass;

/**
 * Master class represents all the responsibilities that a master has such as "change username and password" ,
 * "create a new class" , "grading" , "close the class" and "exit"
 * @author Erfan Majedi
 * @since 2020.4.12
 */
public class Master extends javax.swing.JFrame {
    /**
     * Constructor for master and we locate the program in center of screen and we use initComponents()
     * as a connection between GUI editor and java
     */
    public Master() {
        initComponents();
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * in the initComponents() first we make our panel
     * then we create a button for setting , createClass , GradeStudents , closeClass , and close
     * by using JButton()
     */
    private void initComponents() {
        // make an object for JPanel1
        jPanel1 = new javax.swing.JPanel();
        // make an object for JButtonSetting
        jButtonSetting = new javax.swing.JButton();
        // make an object for jButtonCreateClass
        jButtonCreateClass = new javax.swing.JButton();
        // make an object for jButton Grade Students
        jButtonGradeStudents = new javax.swing.JButton();
        // make an object for jButtonCloseClass
        jButtonCloseClass = new javax.swing.JButton();
        // make an object for jButtonClose
        jButtonClose = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set a text for jButtonSetting
        jButtonSetting.setText("تغییر نام کاربری و رمز عبور");
        // add the jButtonSetting to program
        jButtonSetting.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke setting button for "تغییر نام کاربری و رمز عبور"
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingActionPerformed(evt);
            }
        });
        // set a text for jButtonCreateClass
        jButtonCreateClass.setText("ایجاد کلاس جدید");
        // add the jButtonCreateClass to program
        jButtonCreateClass.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke createClass button for "ایجاد کلاس جدید"
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateClassActionPerformed(evt);
            }
        });
        // set a text for jButtonGradeStudents
        jButtonGradeStudents.setText("نمره دهی ");
        // add the jButtonCreateClass to program
        jButtonGradeStudents.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke GradeStudent button for "نمره دهی "
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGradeStudentsActionPerformed(evt);
            }
        });
        // set a text for jButtonCloseClass
        jButtonCloseClass.setText("بستن کلاس");
        // add the jButtonCloseClass to program
        jButtonCloseClass.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke jButtonCloseClass button for "بستن کلاس"
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseClassActionPerformed(evt);
            }
        });
        // set a text for jButtonClose
        jButtonClose.setText("خروج");
        // add the jButtonCloseClass to program
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke jButtonCloseClass button for "خروج"
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonCreateClass, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                        .addComponent(jButtonCloseClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonGradeStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(jButtonSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(19, 19, 19))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonSetting)
                                        .addComponent(jButtonCreateClass))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonGradeStudents)
                                        .addComponent(jButtonCloseClass))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jButtonClose)
                                .addGap(24, 24, 24))
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * after we click the "تغییر نام کاربری و رمز عبور" button
     * this method create an object for the setting
     * @param evt
     */
    private void jButtonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingActionPerformed
        MasterSetting f = new MasterSetting();//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonSettingActionPerformed

    /**
     * after we click the "ایجاد کلاس جدید" button
     * this method create an object for MasterCreateClass
     * @param evt
     */
    private void jButtonCreateClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateClassActionPerformed
        MasterCreateClass f = new MasterCreateClass();//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonCreateClassActionPerformed

    /**
     * after we click the "نمره دهی " button
     * this method create an object for MasterGrading
     * @param evt
     */
    private void jButtonGradeStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGradeStudentsActionPerformed
        MasterGrading f = new MasterGrading();//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonGradeStudentsActionPerformed

    /**
     * after we click the "بستن کلاس" button
     * this method make an object for CloseClass
     * @param evt
     */
    private void jButtonCloseClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseClassActionPerformed
        CloseClass f = new CloseClass();//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonCloseClassActionPerformed

    /**
     * after we click the "خروج" button
     * this method make the specific icon to be closed
     * @param evt
     */
    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();//Exit
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
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonCloseClass;
    private javax.swing.JButton jButtonCreateClass;
    private javax.swing.JButton jButtonGradeStudents;
    private javax.swing.JButton jButtonSetting;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

