
package SocietyMaintenace;

import java.awt.Container;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegisterForm extends JDialog {

    private Object user;
    

   public RegisterForm (JFrame parent)
    {
        super(parent);
        setTitle("Create an account");
        Container registerPanel = null;
        setContentPane(registerPanel);
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        
       
        setVisible(true);
    }
    public RegisterForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Headinglabel = new javax.swing.JLabel();
        ClickMebutton = new javax.swing.JButton();
        goToLoginlabel = new javax.swing.JLabel();
        Namelabel = new javax.swing.JLabel();
        Flatnumberlabel = new javax.swing.JLabel();
        AadharNumberlabel = new javax.swing.JLabel();
        SocietyNamelabel = new javax.swing.JLabel();
        DateOfJoininglabel = new javax.swing.JLabel();
        Talukalabel = new javax.swing.JLabel();
        Districtlabel = new javax.swing.JLabel();
        Statelabel = new javax.swing.JLabel();
        Pincodelabel = new javax.swing.JLabel();
        DateOfBirthlabel = new javax.swing.JLabel();
        PhoneNumberlabel = new javax.swing.JLabel();
        HomeNumberlabel = new javax.swing.JLabel();
        FamilyIncomelabel = new javax.swing.JLabel();
        EmailIDlalbel = new javax.swing.JLabel();
        CreatePasswordlabel = new javax.swing.JLabel();
        ConfirmPasswordlabel = new javax.swing.JLabel();
        Namefield = new javax.swing.JTextField();
        FlatNumberfield = new javax.swing.JTextField();
        AadharNumberfield = new javax.swing.JTextField();
        SocietyNamefield = new javax.swing.JTextField();
        Talukafield = new javax.swing.JTextField();
        Districtfield = new javax.swing.JTextField();
        Statefield = new javax.swing.JTextField();
        Pincodefield = new javax.swing.JTextField();
        PhoneNumberfield = new javax.swing.JTextField();
        HomeNumberfield = new javax.swing.JTextField();
        FamilyIncomefield = new javax.swing.JTextField();
        EmailIDfield = new javax.swing.JTextField();
        CreatePasswordfield = new javax.swing.JPasswordField();
        ConfirmPasswordfield = new javax.swing.JPasswordField();
        DateOfBirth = new com.toedter.calendar.JDateChooser();
        DateOfJoining1 = new com.toedter.calendar.JDateChooser();
        Savebutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(510, 640));
        setUndecorated(true);
        setSize(new java.awt.Dimension(510, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Headinglabel.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        Headinglabel.setForeground(new java.awt.Color(255, 255, 255));
        Headinglabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Headinglabel.setText("REGISTER");
        getContentPane().add(Headinglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, 488, -1));

        ClickMebutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ClickMebutton.setText("CLICK ME ");
        ClickMebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickMebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(ClickMebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, -1, -1));

        goToLoginlabel.setForeground(new java.awt.Color(255, 255, 255));
        goToLoginlabel.setText("GO TO LOGIN-->>");
        getContentPane().add(goToLoginlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 597, 106, -1));

        Namelabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Namelabel.setForeground(new java.awt.Color(255, 255, 255));
        Namelabel.setText("Name");
        getContentPane().add(Namelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 155, 106, -1));

        Flatnumberlabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Flatnumberlabel.setForeground(new java.awt.Color(255, 255, 255));
        Flatnumberlabel.setText("Flat Number");
        getContentPane().add(Flatnumberlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 183, 106, -1));

        AadharNumberlabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        AadharNumberlabel.setForeground(new java.awt.Color(255, 255, 255));
        AadharNumberlabel.setText("Aadhar Number");
        getContentPane().add(AadharNumberlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 211, 138, -1));

        SocietyNamelabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        SocietyNamelabel.setForeground(new java.awt.Color(255, 255, 255));
        SocietyNamelabel.setText("Society name");
        getContentPane().add(SocietyNamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 239, 138, -1));

        DateOfJoininglabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        DateOfJoininglabel.setForeground(new java.awt.Color(255, 255, 255));
        DateOfJoininglabel.setText("Date of Joining");
        getContentPane().add(DateOfJoininglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 264, 138, -1));

        Talukalabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Talukalabel.setForeground(new java.awt.Color(255, 255, 255));
        Talukalabel.setText("Taluka");
        getContentPane().add(Talukalabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 292, 138, -1));

        Districtlabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Districtlabel.setForeground(new java.awt.Color(255, 255, 255));
        Districtlabel.setText("District");
        getContentPane().add(Districtlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 318, 138, -1));

        Statelabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Statelabel.setForeground(new java.awt.Color(255, 255, 255));
        Statelabel.setText("State");
        getContentPane().add(Statelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 346, 138, -1));

        Pincodelabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Pincodelabel.setForeground(new java.awt.Color(255, 255, 255));
        Pincodelabel.setText("Pincode");
        getContentPane().add(Pincodelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 374, 138, -1));

        DateOfBirthlabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        DateOfBirthlabel.setForeground(new java.awt.Color(255, 255, 255));
        DateOfBirthlabel.setText("Date of Birth");
        getContentPane().add(DateOfBirthlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 399, 138, -1));

        PhoneNumberlabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        PhoneNumberlabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberlabel.setText("Phone Number ");
        getContentPane().add(PhoneNumberlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 425, 138, -1));

        HomeNumberlabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        HomeNumberlabel.setForeground(new java.awt.Color(255, 255, 255));
        HomeNumberlabel.setText("Home Number ");
        getContentPane().add(HomeNumberlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 453, 138, -1));

        FamilyIncomelabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        FamilyIncomelabel.setForeground(new java.awt.Color(255, 255, 255));
        FamilyIncomelabel.setText("Family Income");
        getContentPane().add(FamilyIncomelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 481, 138, -1));

        EmailIDlalbel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        EmailIDlalbel.setForeground(new java.awt.Color(255, 255, 255));
        EmailIDlalbel.setText("Email ID");
        getContentPane().add(EmailIDlalbel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 509, 138, -1));

        CreatePasswordlabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        CreatePasswordlabel.setForeground(new java.awt.Color(255, 255, 255));
        CreatePasswordlabel.setText("Create a Password");
        getContentPane().add(CreatePasswordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 534, 138, -1));

        ConfirmPasswordlabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ConfirmPasswordlabel.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPasswordlabel.setText("Confirm Password");
        getContentPane().add(ConfirmPasswordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 565, -1, -1));
        getContentPane().add(Namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 152, 262, -1));
        getContentPane().add(FlatNumberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 180, 262, -1));
        getContentPane().add(AadharNumberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 208, 262, -1));
        getContentPane().add(SocietyNamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 236, 262, -1));
        getContentPane().add(Talukafield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 287, 262, -1));
        getContentPane().add(Districtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 315, 262, -1));
        getContentPane().add(Statefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 343, 262, -1));

        Pincodefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PincodefieldActionPerformed(evt);
            }
        });
        getContentPane().add(Pincodefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 371, 262, -1));

        PhoneNumberfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberfieldActionPerformed(evt);
            }
        });
        getContentPane().add(PhoneNumberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 422, 262, -1));

        HomeNumberfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeNumberfieldActionPerformed(evt);
            }
        });
        getContentPane().add(HomeNumberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 450, 262, -1));

        FamilyIncomefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FamilyIncomefieldActionPerformed(evt);
            }
        });
        getContentPane().add(FamilyIncomefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 478, 262, -1));

        EmailIDfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailIDfieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailIDfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 506, 262, -1));
        getContentPane().add(CreatePasswordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 534, 262, -1));
        getContentPane().add(ConfirmPasswordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 562, 262, -1));

        DateOfBirth.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 200, -1));

        DateOfJoining1.setForeground(new java.awt.Color(255, 255, 255));
        DateOfJoining1.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(DateOfJoining1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 200, -1));

        Savebutton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Savebutton.setText("Save");
        Savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Divya Shah\\Documents\\GitWorkshop\\OneDrive\\Desktop\\RegisterUser.jpg")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void ClickMebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickMebuttonActionPerformed
        Namefield.setText(null);
        FlatNumberfield.setText(null);
        AadharNumberfield.setText(null);
        SocietyNamefield.setText(null);
        DateOfJoining1.setDate(null);
        Talukafield.setText(null);
        Districtfield.setText(null);
        Statefield.setText(null);
        Pincodefield.setText(null);
        DateOfBirth.setDate(null);
        PhoneNumberfield.setText(null);
        HomeNumberfield.setText(null);
        FamilyIncomefield.setText(null);
        EmailIDfield.setText(null);
        CreatePasswordfield.setText(null);
        ConfirmPasswordfield.setText(null);
        if (Namefield == null ||FlatNumberfield == null||
                AadharNumberfield == null||
                SocietyNamefield == null||
                DateOfJoining1 == null||
                Talukafield == null||
                Districtfield == null||
                Statefield == null||
                Pincodefield == null||
                DateOfBirth == null||PhoneNumberfield == null||
                HomeNumberfield == null||
                FamilyIncomefield == null||
                EmailIDfield == null||
                CreatePasswordfield == null||
                ConfirmPasswordfield == null)
        {
            JOptionPane.showMessageDialog(this,"Please enter valid Details","Try again",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Succesfull Registration","Success",JOptionPane.CLOSED_OPTION);
            dispose();
            LoginForm lf =new LoginForm();
            lf.show();
        }
        
    }//GEN-LAST:event_ClickMebuttonActionPerformed

    private void PincodefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PincodefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PincodefieldActionPerformed

    private void PhoneNumberfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberfieldActionPerformed

    private void HomeNumberfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeNumberfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeNumberfieldActionPerformed

    private void FamilyIncomefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FamilyIncomefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FamilyIncomefieldActionPerformed

    private void EmailIDfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailIDfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailIDfieldActionPerformed

    private void SavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebuttonActionPerformed
        String name = Namefield.getText();
        String flatNumber = FlatNumberfield.getText();
        String aadharNumber = AadharNumberfield.getText();
        String societyName = SocietyNamefield.getText();        
        String dateofjoining = DateOfJoining1.getDateFormatString().formatted(DateOfJoining1);
        String talukaName = Talukafield.getText();
        String districtName = Districtfield.getText();
        String stateName = Statefield.getText();
        String pincodeName = Pincodefield.getText();
        String dateofbirth =DateOfBirth.getDateFormatString().formatted(DateOfBirth);
        String phone = PhoneNumberfield.getText();        
        String homeNumber = HomeNumberfield.getText();
        String familyincome = FamilyIncomefield.getText();
        String email = EmailIDfield.getText();
        String password = String.valueOf(CreatePasswordfield.getPassword());
        String confirmPassword = String.valueOf(ConfirmPasswordfield.getPassword());
        if (dateofjoining.isEmpty()||dateofbirth.isEmpty()||name.isEmpty()||flatNumber.isEmpty()||aadharNumber.isEmpty()||talukaName.isEmpty()||districtName.isEmpty()||stateName.isEmpty()||pincodeName.isEmpty()||homeNumber.isEmpty()||email.isEmpty()||phone.isEmpty()||societyName.isEmpty()||password.isEmpty()||familyincome.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please enter valid Details","Try again",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!password.equals(confirmPassword))
        {
            JOptionPane.showMessageDialog(this,"Confirm password does not match !","Try again",JOptionPane.ERROR_MESSAGE);
            return;
        }
        registerUser();
    }//GEN-LAST:event_SavebuttonActionPerformed

    
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AadharNumberfield;
    private javax.swing.JLabel AadharNumberlabel;
    private javax.swing.JButton ClickMebutton;
    private javax.swing.JPasswordField ConfirmPasswordfield;
    private javax.swing.JLabel ConfirmPasswordlabel;
    private javax.swing.JPasswordField CreatePasswordfield;
    private javax.swing.JLabel CreatePasswordlabel;
    private com.toedter.calendar.JDateChooser DateOfBirth;
    private javax.swing.JLabel DateOfBirthlabel;
    private com.toedter.calendar.JDateChooser DateOfJoining1;
    private javax.swing.JLabel DateOfJoininglabel;
    private javax.swing.JTextField Districtfield;
    private javax.swing.JLabel Districtlabel;
    private javax.swing.JTextField EmailIDfield;
    private javax.swing.JLabel EmailIDlalbel;
    private javax.swing.JTextField FamilyIncomefield;
    private javax.swing.JLabel FamilyIncomelabel;
    private javax.swing.JTextField FlatNumberfield;
    private javax.swing.JLabel Flatnumberlabel;
    private javax.swing.JLabel Headinglabel;
    private javax.swing.JTextField HomeNumberfield;
    private javax.swing.JLabel HomeNumberlabel;
    private javax.swing.JTextField Namefield;
    private javax.swing.JLabel Namelabel;
    private javax.swing.JTextField PhoneNumberfield;
    private javax.swing.JLabel PhoneNumberlabel;
    private javax.swing.JTextField Pincodefield;
    private javax.swing.JLabel Pincodelabel;
    private javax.swing.JButton Savebutton;
    private javax.swing.JTextField SocietyNamefield;
    private javax.swing.JLabel SocietyNamelabel;
    private javax.swing.JTextField Statefield;
    private javax.swing.JLabel Statelabel;
    private javax.swing.JTextField Talukafield;
    private javax.swing.JLabel Talukalabel;
    private javax.swing.JLabel goToLoginlabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void registerUser() 
    {
        
        
        
       //user = addUserToDatabase(name,flatNumber,aadharNumber,societyName,dateofjoining,talukaName,districtName,stateName,pincodeName,dateofbirth,phone,homeNumber,familyincome,email,password);
        if(user!=null)
        {
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Failed to register new user","Try again",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }

    private Object addUserToDatabase(String name,String flatNumber,String aadharNumber,String societyName,String dateofjoining,String talukaName,String districtName,String stateName,String pincodeName,String dateofbirth,String phone,String homeNumber,String familyincome,String email,String password) 
    {
        User user = null;
        final String DB_URL="jdbc:mysql://localhost:3306/mysql";
        final String USERNAME="root";
        final String PASSWORD="123456";
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement stmt = conn.createStatement();
            String sql="INSERT INTO (name,flatNumber,aadharNumber,societyName,dateofjoining,talukaName,districtName,stateName,pincodeName,dateofbirth,phone,homeNumber,familyincome,email,password)"+"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,flatNumber);
            preparedStatement.setString(3,aadharNumber);
            preparedStatement.setString(4,societyName);
            preparedStatement.setString(5,dateofjoining);
            preparedStatement.setString(6,talukaName);
            preparedStatement.setString(7,districtName);
            preparedStatement.setString(8,stateName);
            preparedStatement.setString(9,pincodeName);
            preparedStatement.setString(10,dateofbirth);
            preparedStatement.setString(11,phone);
            preparedStatement.setString(12,homeNumber);
            preparedStatement.setString(13,familyincome);
            preparedStatement.setString(14,email);
            preparedStatement.setString(15,password);            
            int addedRows=preparedStatement.executeUpdate();
            if(addedRows>0)
            {
                user = new User();

                user.name=name;
                user.flatNumber=flatNumber;
                user.aadharNumber=aadharNumber;
                user.societyName=societyName;
                user.dateofjoining=dateofjoining;
                user.talukaName=talukaName;                
                user.districtName=districtName;
                user.stateName=stateName;
                user.pincodeName=pincodeName;
                user.dateofbirth=dateofbirth;
                user.phone=phone;                
                user.homeNumber=homeNumber;
                user.familyincome=familyincome;
                user.email=email;
                user.password=password;
                
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    private Object addUserToDatabase(String name, String flatNumber, String aadharNumber, String societyName, String dateofjoining, String talukaName, String districtName, String stateName, String pincodeName, String dateofbirth, String phone, String homeNumber, String familyincome, String email, String societyName0, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
