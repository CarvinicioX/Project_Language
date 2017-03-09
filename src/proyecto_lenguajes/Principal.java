package proyecto_lenguajes;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author carviniciox
 */
public class Principal extends javax.swing.JFrame {

    CommandRecognition CommandRecognition;
    ArrayList<Contact> Contacts = new ArrayList<>();
    ArrayList<User> Users = new ArrayList<>();

    /**
     * Creates new form main
     */
    public Principal()  {
        initComponents();
        this.setVisible(true);
        Contacts.add(new Contact(1, "SOPHIA", "95959595", new ImageIcon()));
        Users.add(new User(1, "SOPHIA", "SOPHIA"));
        CommandRecognition = new CommandRecognition(this);
        CommandRecognition.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWindow = new javax.swing.JDialog();
        ContactsLabelClick = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contactsWindow = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactsWindowContacts = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        contactWindow = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        newModifyContact = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        callWindow = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        videoCallWindow = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        messageWindow = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logInUsername = new javax.swing.JTextField();
        logInPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        mainWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        mainWindow.setMinimumSize(new java.awt.Dimension(480, 600));
        mainWindow.setPreferredSize(new java.awt.Dimension(480, 600));
        mainWindow.setResizable(false);
        mainWindow.setSize(new java.awt.Dimension(480, 600));
        mainWindow.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContactsLabelClick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_contacts_black_48dp.png"))); // NOI18N
        ContactsLabelClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactsLabelClickMouseClicked(evt);
            }
        });
        mainWindow.getContentPane().add(ContactsLabelClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 204, 192, 192));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        mainWindow.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        contactsWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        contactsWindow.setPreferredSize(new java.awt.Dimension(480, 600));
        contactsWindow.setResizable(false);
        contactsWindow.setSize(new java.awt.Dimension(480, 600));
        contactsWindow.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(contactsWindowContacts);

        contactsWindow.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 420, 470));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        contactsWindow.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        contactWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        contactWindow.setResizable(false);
        contactWindow.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        contactWindow.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        newModifyContact.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        newModifyContact.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        newModifyContact.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        callWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        callWindow.setResizable(false);
        callWindow.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        callWindow.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        videoCallWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        videoCallWindow.setResizable(false);
        videoCallWindow.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        videoCallWindow.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        messageWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        messageWindow.setResizable(false);
        messageWindow.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        messageWindow.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("USERNAME");

        jLabel3.setText("PASSWORD");

        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logInUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(logInPassword))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jButton1)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(logInUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(logInPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 390, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.logInUsername.getText().equals("SOPHIA") && this.logInPassword.getText().equals("SOPHIA")) {
            this.mainWindow.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario/Contraseña Erronea", "Error de LogIn", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ContactsLabelClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactsLabelClickMouseClicked
        this.contactsWindow.setVisible(true);
        this.mainWindow.setVisible(false);
    }//GEN-LAST:event_ContactsLabelClickMouseClicked

    public void usernameFocusCommand() {
        if (this.isVisible() && !this.logInUsername.isFocusOwner()) {
            this.logInUsername.requestFocusInWindow();
        }
    }

    public void passwordFocusCommand() {
        if (this.isVisible() && !this.logInPassword.isFocusOwner()) {
            this.logInPassword.requestFocusInWindow();
        }
    }

    public void generalListo() {
        if (this.isVisible()) {
            for (int i = 0; i < this.Users.size(); i++) {
                if (this.logInPassword.getText().equals(this.Users.get(i).getUsername()) && this.logInPassword.getText().equals(this.Users.get(i).getPassword())) {
                    this.mainWindow.setVisible(true);
                    this.setVisible(false);
                }
            }
        } else if (this.newModifyContact.isVisible()) {
            
        }
    }

    @Override
    public void setName(String name) {
        if (this.getFocusOwner() instanceof JTextField) {
            ((JTextField)this.getFocusOwner()).setText(name);
        }
    }

    public void openContacts() {
        if (!this.contactsWindow.isVisible()) {
            DefaultListModel listmodel = new DefaultListModel();
            for (int i = 0; i < this.Contacts.size(); i++) {
                listmodel.addElement("Nombre: " + this.Contacts.get(i).getName() + "            Número(" + this.Contacts.get(i).getPhone() + ")");
            }
            this.contactsWindowContacts.setModel(listmodel);
            if (this.mainWindow.isVisible()) {
                this.contactsWindow.setVisible(true);
                this.mainWindow.setVisible(false);
            } else if (this.contactWindow.isVisible()) {
                this.contactsWindow.setVisible(true);
                this.contactWindow.setVisible(false);
            }
        }
    }

    public void addContact() {
        if (this.contactsWindow.isVisible()) {
            this.newModifyContact.setVisible(true);
            this.contactsWindow.setVisible(false);
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContactsLabelClick;
    private javax.swing.JDialog callWindow;
    private javax.swing.JDialog contactWindow;
    private javax.swing.JDialog contactsWindow;
    private javax.swing.JList contactsWindowContacts;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField logInPassword;
    private javax.swing.JTextField logInUsername;
    private javax.swing.JDialog mainWindow;
    private javax.swing.JDialog messageWindow;
    private javax.swing.JDialog newModifyContact;
    private javax.swing.JDialog videoCallWindow;
    // End of variables declaration//GEN-END:variables
}