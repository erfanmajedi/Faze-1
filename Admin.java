package Admin;

import Adder.AddMaster;
import Adder.AddStudent;
import FoodPlan.FoodPlan;
import List.ListClasses;
import List.ListMasters;
import List.ListStudent;

/**
 * Admin Class Represents The Responsibilities of him/herself such as "adding master" , "adding student" ,
 * "getting id or change the password" , "write a food plan" , " show the list of masters,students and classes"
 * @author Erfan Majedi
 * @since 2020.3.12
 */
public class Admin extends javax.swing.JFrame {
    /**
     * admin constructor that we put the icon in center .
     */
    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);//Start in center Screen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * we first make a panel in this method
     * then we make an abject for adding masters,students
     * and for making the list for masters,students and classes
     * we have a food plan , setting and close and for all of them we use swing.JButton
     */
    private void initComponents() {
        // make an object for JPanel1
        jPanel1 = new javax.swing.JPanel();
        // make an object for jButtonAddMaster
        jButtonAddMaster = new javax.swing.JButton();
        // make an object for jButtonAddStudent
        jButtonAddStudent = new javax.swing.JButton();
        // make an object for jButtonSetting
        jButtonSetting = new javax.swing.JButton();
        // make an object for jButtonFoodPlan
        jButtonFoodPlan = new javax.swing.JButton();
        // make an object for jButtonListClass
        jButtonListClass = new javax.swing.JButton();
        // make an object for jButtonListStudents
        jButtonListStudents = new javax.swing.JButton();
        // make an object for jButtonListMasters
        jButtonListMasters = new javax.swing.JButton();
        // make an object for jButtonClose
        jButtonClose = new javax.swing.JButton();
        // we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // we set a text for our add master
        jButtonAddMaster.setText("افزودن استاد");
        // we add the button to program
        jButtonAddMaster.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method make the button "افزودن استاد" perform
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMasterActionPerformed(evt);
            }
        });
        // we set a text for our add student
        jButtonAddStudent.setText("افزودن دانشجو");
        // we add the button to program
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method make the button "افزودن دانشجو" perform
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });
        // we set a text for our setting
        jButtonSetting.setText("تغییر نام کاربری و رمز عبور");
        // we add the button to program
        jButtonSetting.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method make the button "تغییر نام کاربری و رمز عبور" perform
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingActionPerformed(evt);
            }
        });
        // we set a text for our food plan
        jButtonFoodPlan.setText("تنظیم برنامه غذایی");
        // we add the button to program
        jButtonFoodPlan.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method make the button "تنظیم برنامه غذایی" perform
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFoodPlanActionPerformed(evt);
            }
        });
        // we set a text for our class list
        jButtonListClass.setText("لیست کلاس ها");
        // we add the button to program
        jButtonListClass.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method make the button "لیست کلاس ها" perform
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListClassActionPerformed(evt);
            }
        });
        // we set a text for our list of students
        jButtonListStudents.setText("لیست دانشجویان");
        // we add the button to program
        jButtonListStudents.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method make the button "لیست دانشجویان" perform
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListStudentsActionPerformed(evt);
            }
        });
        // we set a text for our list of masters
        jButtonListMasters.setText("لیست اساتید");
        // we add the button to program
        jButtonListMasters.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method make the button "لیست اساتید" perform
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListMastersActionPerformed(evt);
            }
        });
        // we set a text for our close button
        jButtonClose.setText("خروج");
        // we add the button to program
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method make the button "خروج" perform
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        // with swing.GroupLayout we make an group layout on our panel
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        // we set layout on our JPanel1Layout
        jPanel1.setLayout(jPanel1Layout);
        // we set the horizontal group for our JPanel1Layout
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonFoodPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonListMasters, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonAddMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonListStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonSetting)
                                        .addComponent(jButtonListClass, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(48, Short.MAX_VALUE))
        );
        // we set the vertical group for our JPanel1Layout
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonFoodPlan)
                                        .addComponent(jButtonSetting))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonListStudents)
                                        .addComponent(jButtonListMasters))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonListClass)
                                        .addComponent(jButtonAddMaster))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonAddStudent)
                                        .addComponent(jButtonClose))
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        // by using swing.GroupLayout we create an object
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        // by using swing.GroupLayout we set a layout
        getContentPane().setLayout(layout);
        // we set the horizontal group for our layout
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        // we set the vertical group for our layout
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * after we click the "افزودن دانشجو" button
     * this method make an object for AddStudent
     * @param evt
     */
    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
        AddStudent f = new AddStudent();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    /**
     * after we click the "خروج" button
     * this method comes out of the specific icon
     * @param evt
     */
    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCloseActionPerformed

    /**
     * after we click the "تنظیم برنامه غذایی" button
     * this method makes an object for FoodPlan
     * @param evt
     */
    private void jButtonFoodPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFoodPlanActionPerformed
        FoodPlan f = new FoodPlan();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonFoodPlanActionPerformed

    /**
     * after we click the "تغییر نام کلربری و رمز عبور" button
     * this method Make an object fot AdminSetting
     * @param evt
     */
    private void jButtonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingActionPerformed
        AdminSetting f = new AdminSetting();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonSettingActionPerformed

    /**
     *  after we click the "لیست دانشجویان" button
     *  this method create an object for ListStudent
     * @param evt
     */
    private void jButtonListStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListStudentsActionPerformed
        ListStudent f = new ListStudent();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonListStudentsActionPerformed

    /**
     *  after we click the "لیست اساتید" button
     *  this method create an object for ListMaster
     * @param evt
     */
    private void jButtonListMastersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListMastersActionPerformed
        ListMasters f = new ListMasters();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonListMastersActionPerformed

    /**
     * after we click the "لیست کلاس ها" button
     *  this method create an object for ListClasses
     * @param evt
     */
    private void jButtonListClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListClassActionPerformed
        ListClasses f = new ListClasses();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonListClassActionPerformed

    /**
     * after we click the "افزودن اساتید" button
     * this method create an object for AddMaster
     * @param evt
     */
    private void jButtonAddMasterActionPerformed(java.awt.event.ActionEvent evt) {
        AddMaster f = new AddMaster();//CreateJFrame
        f.setVisible(true);//Show JFrame
    }

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddMaster;
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonFoodPlan;
    private javax.swing.JButton jButtonListClass;
    private javax.swing.JButton jButtonListMasters;
    private javax.swing.JButton jButtonListStudents;
    private javax.swing.JButton jButtonSetting;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

