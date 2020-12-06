package Adder;

/**
 * this class add credit for you by getting your card number and password amd you can say to it that how much money
 * do you want to add
 * @author Erfan Majedi
 * @since 2020.6.12
 */
public class AddCredit extends javax.swing.JFrame {
    /**
     * constructor for add credit class that we call initComponents() and again we set the program to start
     * in the middle of the screen
     */
    public AddCredit() {
        initComponents();
        this.setLocationRelativeTo(null);//Start in center Screen
    }
    // use SuppressWarnings for ignore some warnings
    @SuppressWarnings("unchecked")
    // <editor-fold defaultState="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * in the initComponents() first we make our panel
     * then we create a button for close and ok
     * by using JButton()
     * we have three labels and three text field for that information that we want to write
     */
    private void initComponents() {
        // make an object for jPanel1
        jPanel1 = new javax.swing.JPanel();
        // make an object for jLabel1
        jLabel1 = new javax.swing.JLabel();
        // make an object for jLabel2
        jLabel2 = new javax.swing.JLabel();
        // make an object for jTextField1
        jTextField1 = new javax.swing.JTextField();
        // make an object for jTextField2
        jTextField2 = new javax.swing.JTextField();
        // make an object for jLabel3
        jLabel3 = new javax.swing.JLabel();
        // make an object for jTextField3
        jTextField3 = new javax.swing.JTextField();
        // make an object for jButtonClose
        jButtonClose = new javax.swing.JButton();
        // make an object for jButtonOk
        jButtonOK = new javax.swing.JButton();
        //we close the program by clicking on close icon on top corner
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // set a title for our frame
        setTitle("افزایش موجودی حساب");
        // set text for jLabel1
        jLabel1.setText("شماره کارت:");
        // set text for jLabel2
        jLabel2.setText("رمز عبور:");
        // set text for jLabel3
        jLabel3.setText("مبلغ:");
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
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(jTextField1)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                .addGap(60, 60, 60))
        );
        // we setVerticalGroup for jPanel1Layout
        jPanel1Layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
        );
        //set text for close button
        jButtonClose.setText("خروج");
        // add jButtonClose to program
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            /**
             * this method invoke "خروج" button
             * @param evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        // set a text for jButtonOk
        jButtonOK.setText("پرداخت");
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
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        // we setVerticalGroup for layout
        layout.setVerticalGroup(
                //we create parallelGroup for align in different ways
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonClose)
                                        .addComponent(jButtonOK))
                                .addGap(18, 18, 18))
        );
        //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * after we click the "خروج" button
     * this method comes out of the specific icon
     * @param evt
     */
    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();//Exit
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
            java.util.logging.Logger.getLogger(AddCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCredit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

