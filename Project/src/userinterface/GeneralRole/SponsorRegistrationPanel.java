/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GeneralRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SponsorApprovalStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Yashwanth
 */
public class SponsorRegistrationPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private static final Pattern mailPattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
    private static final Pattern ssnPattern = Pattern.compile("^\\d{3}-?\\d{2}-?\\d{4}$|^XXX-XX-XXXX$");
    private static final Pattern passportPattern = Pattern.compile("^\\d{3}-?\\d{2}-?\\d{4}$|^XXX-XX-XXXX$");
    private static final Pattern phonePattern = Pattern.compile("^\\D?(\\d{3})\\D?\\D?(\\d{3})\\D?(\\d{4})$");

    /**
     * Creates new form VolunteerRegistration
     */
    public SponsorRegistrationPanel(JPanel userProcessContainerÏ, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
    }

    private int validateMail(String validate) {
        Matcher match = mailPattern.matcher(validate);
        if (match.matches()) {
            return 1;
        }
        return 0;
    }

    private int validatePassport(String validate) {
        Matcher match = passportPattern.matcher(validate);
        System.out.println(match.matches());
        if (match.matches()) {
            return 1;
        }
        return 0;
    }
    private int validateSsn(String validate) {
        Matcher match = ssnPattern.matcher(validate);
        System.out.println(match.matches());
        if (match.matches()) {
            return 1;
        }
        return 0;
    }

    private int validatePhone(String validate) {
        Matcher match = phonePattern.matcher(validate);
        System.out.println(match.matches());
        if (match.matches()) {
            return 1;
        }
        return 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        roleCombo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ssn = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        passport = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        dob = new com.toedter.calendar.JDateChooser();
        password = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Blue/rss.png"))); // NOI18N
        jLabel1.setText("Welcome to Sponsor Registration");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");

        SubmitBtn.setBackground(new java.awt.Color(255, 51, 51));
        SubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/add_user.png"))); // NOI18N
        SubmitBtn.setText("SUBMIT");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Role");

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GeneralRole", "CorporateRole", "StudentRole" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email ID");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone Number");

        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOB");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SSN");

        ssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Passport No");

        passport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passportActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(ssn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(passport, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1)
                                        .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(number, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {email, fName, number, passport, roleCombo, ssn, username});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SubmitBtn)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        int check = 0;
        int co = 1;
        int checkMail = 0;
        int userCheck = 0;
        int checkSsn = 0;
        int checkPass = 0;
        int checkPhone = 0;
        int checkdate = 0;

        String name = null;
        String userName = null;
        String pass = null;
        String mail = null;
        String role = "null";
        String passport1 = null;
        String address1 = null;
        long ssn1 = 0;
        long pass1 = 0;
        long number1 = 0;
      //  Date dob1 = null;
        Date sysDate = null;
        if (fName.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty() || email.getText().isEmpty() || passport.getText().isEmpty() || ssn.getText().isEmpty() || dob.getDate() == null || number.getText().isEmpty() || address.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registration cannot be completed as one or more fields are empty");
            return;
        } else {
            check = 1;
            SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
            format.setLenient(false);
       //     dob1 = null;
            sysDate = new Date();

            name = fName.getText();
            userName = username.getText();
            pass = password.getText();
            mail = email.getText();
            role = "null";
            passport1 = passport.getText();
            checkMail = validateMail(email.getText());
            if (checkMail == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter a valid Email-ID format");
                return;
            }
            try {
         //       dob1 = format.parse(dob.getText());
                ssn1 = Long.parseLong(ssn.getText());
                pass1 = Long.parseLong(passport.getText());
                number1 = Long.parseLong(number.getText());
                checkSsn = validateSsn(Long.toString(ssn1));
                checkPass = validatePassport(Long.toString(pass1));
                checkPhone = validatePhone(Long.toString(number1));

                long diff = sysDate.getTime() - dob.getDate().getTime();
                long diffDays = diff / (24 * 60 * 60 * 1000);
                long years = diffDays / 365;

                System.out.println(diff);
                System.out.println(diffDays);
                System.out.println(years);
                if ((years < 16 && diff > 0) && (years >= 0 && diff > 0)) {
                    JOptionPane.showMessageDialog(null, "Cannot enroll as age is less than 16 years");
                    checkdate = 1;
                    return;
                }

                if (diff < 0) {
                    JOptionPane.showMessageDialog(null, "Date of Birth cannot be a future date");
                    checkdate = 1;
                    return;
                }

                co = 0;

                if (checkSsn == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid SSN format (9 digits only allowed) ");
                    return;
                }
                
                if (checkPass == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid Passport ID format (9 digits only allowed) ");
                    return;
                }

                if (checkPhone == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid Phone format(10 digits)");
                    return;
                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Please enter number for SSN and Phone Number");
                return;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter number for SSN and Phone Number");
                return;
            }
            address1 = address.getText();
        }
        //
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, pass);
        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        System.out.println(organization);
                        userAccount = organization.getUserAccountDirectory().authenticateUser(userName, pass);
                        System.out.println(userAccount);
                        if (userAccount != null) {
                            userCheck++;
                            System.out.println(userAccount);
                            // break;
                        }
                    }
                }
            }
        }
        System.out.println(userCheck);
        if (userCheck > 0) {
            JOptionPane.showMessageDialog(this, "User name already exists!");
        } else if (userCheck == 0) {
            if (co == 0 && check == 1 && checkMail != 0 && checkSsn != 0 && checkPhone != 0 && checkdate == 0) {
                SponsorApprovalStatus request = new SponsorApprovalStatus();
                request.setTypeOfRequest("Sponsor");
                request.setName(name);
                request.setUsername(userName);
                request.setPassword(pass);
                request.setMailid(mail);
                request.setDob(dob.getDate());
                request.setPassport(passport1);
                request.setNumber(number1);
                request.setSsn(ssn1);
                request.setAddress(address1);
                request.setStatus("Pending");
                if (roleCombo.getSelectedItem() == "GeneralRole") {
                    role = (String) roleCombo.getSelectedItem();
                    request.setRole(role);
                    //System.out.println(role);
                }
                if (roleCombo.getSelectedItem() == "CorporateRole") {
                    role = (String) roleCombo.getSelectedItem();
                    request.setRole(role);
                    // System.out.println(role);
                }
                if (roleCombo.getSelectedItem() == "StudentRole") {
                    role = (String) roleCombo.getSelectedItem();
                    request.setRole(role);
                    // System.out.println(role);
                }
                for (Network network : system.getNetworkList()) {
                    //Step 2.a: check against each enterprise
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        for (UserAccount user : enterprise.getUserAccountDirectory().getUserAccountList()) {
                            if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Event) && (roleCombo.getSelectedItem() == "GeneralRole") && (user.getUsername().equals("adminfund"))) {
                                //System.out.println(user);
                                user.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(this, "Registration submitted Successfully. Sent to Fund Admin for Approval!");
                                fName.setText("");
                                username.setText("");
                                password.setText("");
                                email.setText("");
                                passport.setText("");
                                ssn.setText("");
                                number.setText("");
                                dob.setDate(null);
                                address.setText("");
                            } else if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Event) && (roleCombo.getSelectedItem() == "CorporateRole") && (user.getUsername().equals("adminfund"))) {
                                // System.out.println(user);
                                user.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(this, "Registration submitted Successfully. Sent to Fund Admin for Approval!");
                                fName.setText("");
                                username.setText("");
                                password.setText("");
                                email.setText("");
                                passport.setText("");
                                ssn.setText("");
                                number.setText("");
                                dob.setDate(null);
                                address.setText("");
                            } else if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Event) && (roleCombo.getSelectedItem() == "StudentRole") && (user.getUsername().equals("adminfund"))) {
                                // System.out.println(user);
                                user.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(this, "Registration submitted Successfully. Sent to Fund Admin for Approval!");
                                fName.setText("");
                                username.setText("");
                                password.setText("");
                                email.setText("");
                                passport.setText("");
                                ssn.setText("");
                                number.setText("");
                                dob.setDate(null);
                                address.setText("");
                            }
                        }
                    }
                }
            }
        }

        /*request.setMessage("");
        request.setReceiver(null);
        request.setSender(null);
        request.setRequestDate(null);
        request.setResolveDate(null);*/
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void ssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnActionPerformed

    private void passportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextArea address;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField number;
    private javax.swing.JTextField passport;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> roleCombo;
    private javax.swing.JTextField ssn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
