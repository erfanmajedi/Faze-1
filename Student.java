package Student;

import Adder.AddCredit;

/**
 * student class represent the actions that they can have such as reserving food
 * changing username and password , add credit , choosing new class and ...
 * @author Erfan Majedi
 * @since 2020.8.12
 */
public class Student extends javax.swing.JFrame {
    /**
     * constructor for student class that we call initComponents()
     * we use set location to start the program in the center of screen
     */
    public Student() {
        initComponents();
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * in this method we make our panels and some necessary buttons,labels,textFields
     * also we make the ability of scroll and we have a table for the class list
     */
    private void initComponents() {
        // make an object for jPanel1
        jPanel1 = new javax.swing.JPanel();
        // make an object for jButtonSetting
        jButtonSetting = new javax.swing.JButton();
        // make an object for jButtonAddCredit
        jButtonAddCredit = new javax.swing.JButton();
        // make an object for jButtonReserveFood
        jButtonReserveFood = new javax.swing.JButton();
        // make an object for jButtonChooseClass
        jButtonChooseClass = new javax.swing.JButton();
        // make an object for jPanel2
        jPanel2 = new javax.swing.JPanel();
        // make an object for jLabel3
        jLabel3 = new javax.swing.JLabel();
        //make an object for jTextField3
        jTextField3 = new javax.swing.JTextField();
        // make an object for jLabel2
        jLabel2 = new javax.swing.JLabel();
        //make an object for jTextField2
        jTextField2 = new javax.swing.JTextField();
        // make an object for jLabel1
        jLabel1 = new javax.swing.JLabel();
        //make an object for jTextField1
        jTextField1 = new javax.swing.JTextField();
        //make an object for jTextField4
        jTextField4 = new javax.swing.JTextField();
        // make an object for jLabel4
        jLabel4 = new javax.swing.JLabel();
        // make an object for jScrollPane1
        jScrollPane1 = new javax.swing.JScrollPane();
        // make an object for jTable1
        jTable1 = new javax.swing.JTable();
        // make an object for jButtonClose
        jButtonClose = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set title for frame
        setTitle("پنل دانشجو");
        // set text for jButtonSetting
        jButtonSetting.setText("تغییر نام کاربری و رمز عبور");
        // add the button to the program
        jButtonSetting.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "تغییر نام کاربری و رمز عبور" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingActionPerformed(evt);
            }
        });
        // set text for jButtonAddCredit
        jButtonAddCredit.setText("افزایش موجودی حساب");
        // add the button to the program
        jButtonAddCredit.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "افزایش موجودی حساب" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCreditActionPerformed(evt);
            }
        });
        // set text for jButtonReserveFood
        jButtonReserveFood.setText("رزرو غذا");
        // add the button to the program
        jButtonReserveFood.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "رزرو غذا" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReserveFoodActionPerformed(evt);
            }
        });
        // set text for jButtonChooseClass
        jButtonChooseClass.setText("انتخاب کلاس جدید");
        // add the button to the program
        jButtonChooseClass.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "انتخاب کلاس جدید" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseClassActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonAddCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonChooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButtonReserveFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                                .addGap(19, 19, 19))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonSetting)
                                        .addComponent(jButtonAddCredit))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonReserveFood)
                                        .addComponent(jButtonChooseClass))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        //set text for jLabel3
        jLabel3.setText("موجودی حساب:");
        // here we set the method false so we can't write anything in the blank field
        jTextField3.setEditable(false);
        //set text for jLabel2
        jLabel2.setText("رمز عبور:");
        // here we set the method false so we can't write anything in the blank field
        jTextField2.setEditable(false);
        //set text for jLabel1
        jLabel1.setText("نام کاربری:");
        // here we set the method false so we can't write anything in the blank field
        jTextField1.setEditable(false);
        // here we set the method false so we can't write anything in the blank field
        jTextField4.setEditable(false);
        //set text for jLabel4
        jLabel4.setText("معدل:");
        // we set the model for the table
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                // here we initialize as null
                new Object [][] {
                        {null},
                        {null},
                        {null},
                        {null}
                },
                // here we set a name
                new String [] {
                        "لیست کلاس ها"
                }
        )
            // here we call canEdit method and we set it as false
        {
            boolean[] canEdit = new boolean [] {
                    false
            };
            // this is for each cell in the list
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        // we can scroll over the table
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        // set layout for jPanel2
        jPanel2.setLayout(jPanel2Layout);
        // we setHorizontalGroup for jPanel2Layout
        jPanel2Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField2)
                                                        .addComponent(jTextField4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(45, 45, 45))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(35, 35, 35)))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel3)
                                                                .addGap(19, 19, 19))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel1)
                                                                .addGap(41, 41, 41))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        // we setVerticalGroup for jPanel2Layout
        jPanel2Layout.setVerticalGroup(
                // we setVerticalGroup for jPanel1Layout
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
        );
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
                                .addGap(87, 87, 87)
                                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonClose)
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * in this method we create a frame for StudentSetting and set visibility to true
     * because we want the program show it to us
     * @param evt
     */
    private void jButtonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingActionPerformed
        StudentSetting f = new StudentSetting();//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonSettingActionPerformed
    /**
     * in this method we create a frame for addCredit and set visibility to true
     * because we want the program show it to us
     * @param evt
     */
    private void jButtonAddCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCreditActionPerformed
        AddCredit f = new AddCredit();//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonAddCreditActionPerformed
    /**
     * in this method we create a frame for StudentReserveFood and set visibility to true
     * because we want the program show it to us
     * @param evt
     */
    private void jButtonReserveFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReserveFoodActionPerformed
        StudentReserveFood f = new StudentReserveFood();//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonReserveFoodActionPerformed
    /**
     * in this method we create a frame for StudentChooseClass and set visibility to true
     * because we want the program show it to us
     * @param evt
     */
    private void jButtonChooseClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseClassActionPerformed
        StudentChooseClass f = new StudentChooseClass();//Create JFrame
        f.setVisible(true);//Show JFrame
    }//GEN-LAST:event_jButtonChooseClassActionPerformed

    /**
     * this method get out of the frame
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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCredit;
    private javax.swing.JButton jButtonChooseClass;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonSetting;
    private javax.swing.JButton jButtonReserveFood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

