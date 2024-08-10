
package com.mycompany.todolist;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    String organization;
    String role;
    /**
     * Creates new form LoginJFrame
     */
    public Login(){
        initComponents();
        
        // Get the screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Set the location of the JFrame in the center of the screen
        setLocation((screenSize.width - getWidth()) / 2,
                           (screenSize.height - getHeight()) / 2);
    }
    public Login(String organization,String role) {
        initComponents();
        this.organization=organization;
        this.role=role;
        // Get the screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Set the location of the JFrame in the center of the screen
        setLocation((screenSize.width - getWidth()) / 2,
                           (screenSize.height - getHeight()) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginPagePane = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        welcomeAndFormSeperator = new javax.swing.JSeparator();
        LoginPane = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        RegisterLabel = new javax.swing.JLabel();
        SignupButton = new javax.swing.JButton();
        ErrorText = new javax.swing.JLabel();
        FooterPanel = new javax.swing.JPanel();
        FooterLabel = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Todo List App");

        loginPagePane.setBackground(new java.awt.Color(251, 242, 255));
        loginPagePane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 8));

        WelcomeLabel.setFont(new java.awt.Font("SimSun", 1, 48)); // NOI18N
        WelcomeLabel.setText("LOG IN");

        welcomeAndFormSeperator.setForeground(new java.awt.Color(0, 0, 0));

        LoginPane.setBackground(new java.awt.Color(204, 204, 255));
        LoginPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        UsernameLabel.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        UsernameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        PasswordLabel.setText("Password");

        UsernameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UsernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        PasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        LoginButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        RegisterLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RegisterLabel.setText("Don't have an account?");

        SignupButton.setBackground(new java.awt.Color(204, 204, 255));
        SignupButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SignupButton.setForeground(new java.awt.Color(0, 0, 153));
        SignupButton.setText("Sign Up!");
        SignupButton.setBorder(null);
        SignupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });

        ErrorText.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        ErrorText.setForeground(new java.awt.Color(255, 0, 0));
        ErrorText.setAlignmentX(6.0F);

        javax.swing.GroupLayout LoginPaneLayout = new javax.swing.GroupLayout(LoginPane);
        LoginPane.setLayout(LoginPaneLayout);
        LoginPaneLayout.setHorizontalGroup(
            LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPaneLayout.createSequentialGroup()
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPaneLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PasswordLabel)
                                .addComponent(UsernameLabel)
                                .addComponent(UsernameField)
                                .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                            .addGroup(LoginPaneLayout.createSequentialGroup()
                                .addComponent(RegisterLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SignupButton))
                            .addGroup(LoginPaneLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(ErrorText, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LoginPaneLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        LoginPaneLayout.setVerticalGroup(
            LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPaneLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(ErrorText, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterLabel)
                    .addComponent(SignupButton))
                .addGap(44, 44, 44))
        );

        FooterPanel.setBackground(new java.awt.Color(0, 0, 0));

        FooterLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FooterLabel.setForeground(new java.awt.Color(255, 255, 255));
        FooterLabel.setText("© TODO LIST APP BY SHAFAY AND SHAEEL!");

        javax.swing.GroupLayout FooterPanelLayout = new javax.swing.GroupLayout(FooterPanel);
        FooterPanel.setLayout(FooterPanelLayout);
        FooterPanelLayout.setHorizontalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanelLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(FooterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FooterPanelLayout.setVerticalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FooterLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginPagePaneLayout = new javax.swing.GroupLayout(loginPagePane);
        loginPagePane.setLayout(loginPagePaneLayout);
        loginPagePaneLayout.setHorizontalGroup(
            loginPagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPagePaneLayout.createSequentialGroup()
                .addGroup(loginPagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPagePaneLayout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(LoginPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPagePaneLayout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addGroup(loginPagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPagePaneLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(WelcomeLabel))
                            .addComponent(welcomeAndFormSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        loginPagePaneLayout.setVerticalGroup(
            loginPagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPagePaneLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeAndFormSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(LoginPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(FooterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPagePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPagePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
         // TODO add your handling code here:
         Conn c = new Conn();
         String username= UsernameField.getText();
         String pass= PasswordField.getText();
         
         String query="select * from login where username = '"+username+"' and pass = '"+pass+"'";
         
         try{
            ResultSet rs= c.s.executeQuery(query);
            
            //this rs.next method checks if it fetched a row which simply means that yes there is a user with that pass in the database!
             if (rs.next()) {
                 setVisible(false);
                 new HomePage(username,organization, role).setVisible(true);
             }
             else{
                  ErrorText.setText("Invalid Username or Password!");
             }
         }
         catch(Exception e){
             System.out.println(e);
         }
         
          
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
    
        // TODO add your handling code here:
       setVisible(false);
        new SignUp().setVisible(true);
        
    }//GEN-LAST:event_SignupButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorText;
    private javax.swing.JLabel FooterLabel;
    private javax.swing.JPanel FooterPanel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPane;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JButton SignupButton;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel loginPagePane;
    private javax.swing.JSeparator welcomeAndFormSeperator;
    // End of variables declaration//GEN-END:variables
}
