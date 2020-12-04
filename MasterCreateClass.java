package Master;

import javax.swing.JLabel;

/**
 * MasterCreateClass represents what class master can make and this class get info such as "create a class"
 * "class name" , "number of units" , " the day of class " , " class time " and " capacity of the class
 * @author Erfan Majedi
 * @since 2020.4.12
 */
public class MasterCreateClass extends javax.swing.JFrame {
    /**
     * constructor for MasterCreateClass
     */
    public MasterCreateClass() {
        initComponents();
        ((JLabel)jComboBoxDay.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);//Right to left JComboBox
        ((JLabel)jComboBoxHours.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);//Right to left JComboBox
        this.setLocationRelativeTo(null);//Start in center Screen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * in this method we new some necessary fields
     */
    private void initComponents() {
        //make an object for JPanel1
        jPanel1 = new javax.swing.JPanel();
        //make an object for JPanel2
        jPanel2 = new javax.swing.JPanel();
        //make an object for JLabel1
        jLabel1 = new javax.swing.JLabel();
        //make an object for JTextField1
        jTextField1 = new javax.swing.JTextField();
        //make an object for JPanel3
        jPanel3 = new javax.swing.JPanel();
        //make an object for JLabel1
        jLabel2 = new javax.swing.JLabel();
        //make an object for JTextField3
        jTextField3 = new javax.swing.JTextField();
        //make an object for JTextField2
        jTextField2 = new javax.swing.JTextField();
        //make an object for JPanel4
        jPanel4 = new javax.swing.JPanel();
        //make an object for JLabel3
        jLabel3 = new javax.swing.JLabel();
        //make an object for JComboBoxDay
        jComboBoxDay = new javax.swing.JComboBox<>();
        //make an object for JComboBoxHours
        jComboBoxHours = new javax.swing.JComboBox<>();
        //make an object for JLabel5
        jLabel5 = new javax.swing.JLabel();
        //make an object for JPanel5
        jPanel5 = new javax.swing.JPanel();
        //make an object for JLabel4
        jLabel4 = new javax.swing.JLabel();
        //make an object for JTextFieldCapacity
        jTextFieldCapasity = new javax.swing.JTextField();
        //make an object for JButtonOk
        jButtonOK = new javax.swing.JButton();
        //make an object for JButtonClose
        jButtonClose = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //set title for our frame
        setTitle("ایجاد کلاس جدید");
        //set layout for jPanel2
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        //set a text for jLabel1
        jLabel1.setText("نام کلاس:");
        //add jLabel1 to jPanel2
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));
        //add jTextField1 to jPanel2
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 11, 186, -1));
        //set a layout for jPanel3
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set a text for jLabel2
        jLabel2.setText("تعداد واحد:");
        //add jLabel2 to jPanel3
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));
        //add jTextField3 to jPanel3
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 11, 186, -1));
        //add jPanel3 to jPanel2
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 48));
        //add jTextField2 to jPanel2
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 11, 186, -1));
        //set layout for jPanel4
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // set a text for jLabel3
        jLabel3.setText("زمان تشکیل:");
        //add jLabel3 to jPanel4
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 9, -1, -1));
        //set model for our jComboBoxDay
        jComboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "شنبه", "یکشنبه", "دوشنبه", "سه شنبه", "چهارشنبه" }));
        //add jComboBoxDay to jPanel4
        jPanel4.add(jComboBoxDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 188, -1));
        //set model for ComboBoxHours
        jComboBoxHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8 تا 10", "10 تا 12", "14 تا 16" }));
        //add jComboBoxHours to jPanel4
        jPanel4.add(jComboBoxHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 188, -1));
        //set a text for jLabel5
        jLabel5.setText("ساعت:");
        //add jLabel5 to jPanel4
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));
        //set a text for jLabel4
        jLabel4.setText("ظرفیت:");
        /**
         * here we use javax.swing.GroupLayout for hierarchically group the components and arranges them in a Container
         * A sequential group positions its child elements sequentially, one after another
         * A parallel group aligns its child elements in different ways.
         */
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        //setLayout for jPanel5
        jPanel5.setLayout(jPanel5Layout);
        // we setHorizontalGroup for jPanel5Layout
        jPanel5Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(13, Short.MAX_VALUE)
                                .addComponent(jTextFieldCapasity, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(22, 22, 22))
        );
        // we setVerticalGroup for jPanel5Layout
        jPanel5Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldCapasity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        //setLayout for jPanel1
        jPanel1.setLayout(jPanel1Layout);
        // we setHorizontalGroup for jPanel1Layout
        jPanel1Layout.setHorizontalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        // we setVerticalGroup for layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        //set text for jButtonOK
        jButtonOK.setText("تایید");
        // set text for jButtonClose
        jButtonClose.setText("خروج");
        //add jButtonClose to program
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
                                .addGap(9, 9, 9)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonOK)
                                        .addComponent(jButtonClose))
                                .addContainerGap(27, Short.MAX_VALUE))
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * after we click the "خروج" button
     * this method make the specific icon to be closed
     * @param evt
     */
    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

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
            java.util.logging.Logger.getLogger(MasterCreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterCreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterCreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterCreateClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterCreateClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox<String> jComboBoxDay;
    private javax.swing.JComboBox<String> jComboBoxHours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldCapasity;
    // End of variables declaration//GEN-END:variables
}

