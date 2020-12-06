package Adder;

/**
 * add master class get the name , lastName , major , university , email of the master
 * and add them to the list
 * @author Erfan Majedi
 * @since 2020.6.12
 */
public class AddMaster extends javax.swing.JFrame {
    /**
     * constructor for add master that we call initComponents()
     * and we make the program to start in center of the screen
     */
    public AddMaster() {
        initComponents();
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * in this method we make the panel first
     * then we have add and cancel button
     * we have five labels and five textField for each info that a master has
     */
    private void initComponents() {
        //make an object for jPanel1
        jPanel1 = new javax.swing.JPanel();
        //make an object for jLabel1
        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        //make an object for jLabel2
        jLabel2 = new javax.swing.JLabel();
        // make an object for jTextFieldFamily
        jTextFieldFamily = new javax.swing.JTextField();
        //make an object for jLabel3
        jLabel3 = new javax.swing.JLabel();
        //make an object for jLabel4
        jLabel4 = new javax.swing.JLabel();
        //make an object for jLabel5
        jLabel5 = new javax.swing.JLabel();
        //make an object for jButtonAdd
        jButtonAdd = new javax.swing.JButton();
        //make an object for jButtonCancel
        jButtonCancel = new javax.swing.JButton();
        // make an object for jTextFieldDegree
        jTextFieldDegree = new javax.swing.JTextField();
        // make an object for jTextFieldUniversity
        jTextFieldUniversity = new javax.swing.JTextField();
        // make an object for jTextFieldTel
        jTextFieldTel = new javax.swing.JTextField();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set text for jLabel1
        jLabel1.setText("نام:");
        //set tool tip for name text field
        jTextFieldName.setToolTipText("");
        //set a doubled buffer for name text field
        jTextFieldName.setDoubleBuffered(true);
        // set text for jLabel2
        jLabel2.setText("نام خانوادگی:");
        //set tool tip for Lastname text field
        jLabel2.setToolTipText("");
        // set text for jLabel3
        jLabel3.setText("مدرک تحصیلی:");
        // set text for jLabel4
        jLabel4.setText(" دانشگاه:");
        // set text for jLabel5
        jLabel5.setText("ایمیل:");
        // set a text for jButtonAdd
        jButtonAdd.setText("افزودن");
        // add jButtonAdd to the program
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "افزودن" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        // set text for jButtonCancel
        jButtonCancel.setText("خروج");
        // add jButtonCancel to the program
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "خروج" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextFieldDegree, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldFamily)
                                                        .addComponent(jTextFieldName)
                                                        .addComponent(jTextFieldUniversity)
                                                        .addComponent(jTextFieldTel))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(28, 28, 28))))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonCancel)
                                        .addComponent(jButtonAdd))
                                .addContainerGap(24, Short.MAX_VALUE))
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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * this method is empty cause we don't want too add in this faze
     * @param evt
     */
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
    }//GEN-LAST:event_jButtonAddActionPerformed
    /**
     * after we click the "خروج" button
     * this method comes out of the specific icon
     * @param evt
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();//Exit
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDegree;
    private javax.swing.JTextField jTextFieldFamily;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldUniversity;
    // End of variables declaration//GEN-END:variables
}

