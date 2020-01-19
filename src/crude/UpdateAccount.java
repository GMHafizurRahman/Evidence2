package crude;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UpdateAccount extends javax.swing.JFrame {

    String newId, existingId, newPhone, newAddress, newName;
    //Connection connection = null;
    //PreparedStatement preparedStatement = null;
    //Statement statement = null;

    public UpdateAccount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        IdTabbedPnnel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFieldNewId = new javax.swing.JTextField();
        txtFieldOldId = new javax.swing.JTextField();
        btnIdUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnIdExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFieldName = new javax.swing.JTextField();
        txtFieldNameOldId = new javax.swing.JTextField();
        btnNameBack = new javax.swing.JButton();
        btnNameUpdate = new javax.swing.JButton();
        btnNameEit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtFieldAddress = new javax.swing.JTextField();
        btnFieldExistId = new javax.swing.JTextField();
        btnAddressBack = new javax.swing.JButton();
        btnAddressUpdate = new javax.swing.JButton();
        btnAddressExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtFieldPhone = new javax.swing.JTextField();
        txtPhoneExitId = new javax.swing.JTextField();
        btnPhoneUpdate = new javax.swing.JButton();
        btnPhoneBack = new javax.swing.JButton();
        btnPhoneExit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(0, 204, 0))); // NOI18N

        IdTabbedPnnel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("New Id:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Existing Id:");

        btnIdUpdate.setText("Update");
        btnIdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnIdExit.setText("Exit");
        btnIdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btnIdUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIdExit))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFieldNewId, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txtFieldOldId)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldNewId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldOldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIdUpdate)
                    .addComponent(btnBack)
                    .addComponent(btnIdExit))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        IdTabbedPnnel.addTab("Id", jPanel2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("New Name/User Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Existing Id:");

        btnNameBack.setText("Back");
        btnNameBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameBackActionPerformed(evt);
            }
        });

        btnNameUpdate.setText("Update");
        btnNameUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameUpdateActionPerformed(evt);
            }
        });

        btnNameEit.setText("Exit");
        btnNameEit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameEitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(83, 83, 83)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnNameBack)
                                .addGap(33, 33, 33)
                                .addComponent(btnNameUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnNameEit))
                            .addComponent(txtFieldNameOldId))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldName)))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldNameOldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNameBack)
                    .addComponent(btnNameUpdate)
                    .addComponent(btnNameEit))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        IdTabbedPnnel.addTab("Name", jPanel3);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("New Address:");

        btnAddressBack.setText("Back");
        btnAddressBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressBackActionPerformed(evt);
            }
        });

        btnAddressUpdate.setText("Update");
        btnAddressUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressUpdateActionPerformed(evt);
            }
        });

        btnAddressExit.setText("Exit");
        btnAddressExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressExitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Existing Id:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFieldExistId, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAddressBack)
                        .addGap(26, 26, 26)
                        .addComponent(btnAddressUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddressExit)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFieldExistId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddressBack)
                    .addComponent(btnAddressUpdate)
                    .addComponent(btnAddressExit))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        IdTabbedPnnel.addTab("Address", jPanel6);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("New Phone No:");

        btnPhoneUpdate.setText("Update");
        btnPhoneUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhoneUpdateActionPerformed(evt);
            }
        });

        btnPhoneBack.setText("Back");
        btnPhoneBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhoneBackActionPerformed(evt);
            }
        });

        btnPhoneExit.setText("Exit");
        btnPhoneExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhoneExitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Existing Id:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnPhoneBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnPhoneUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPhoneExit))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhoneExitId, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtPhoneExitId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPhoneBack)
                    .addComponent(btnPhoneUpdate)
                    .addComponent(btnPhoneExit))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        IdTabbedPnnel.addTab("Phone", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IdTabbedPnnel, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IdTabbedPnnel, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new AddAndReadDatabase().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnIdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdUpdateActionPerformed

        PreparedStatement preparedStatement = null;
        Connection connection = null;
        Statement statement = null;
        newId = txtFieldNewId.getText();
        existingId = txtFieldOldId.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test");
            preparedStatement = connection.prepareStatement("UPDATE person set id=  '" + newId + "'   where id= '" + existingId + "';");
            preparedStatement.executeUpdate();
            //connection.close();
            //preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("connection close");
                }

            } catch (Exception e) {
                e.printStackTrace();

            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                    System.out.println("preparedStatement close");
                }

            } catch (Exception e) {
                e.printStackTrace();

            }
//        }
            
        }
        this.dispose();
    }//GEN-LAST:event_btnIdUpdateActionPerformed

    private void btnIdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnIdExitActionPerformed

    private void btnNameBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameBackActionPerformed
      new AddAndReadDatabase().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNameBackActionPerformed

    private void btnNameUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameUpdateActionPerformed
        newName = txtFieldName.getText();
        existingId = txtFieldNameOldId.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test");
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE person set name=  '" + newName + "'   where id= '" + existingId + "';");
            preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
//        } finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                    System.out.println("connection close");
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//            try {
//                if (preparedStatement != null) {
//                    preparedStatement.close();
//                    System.out.println("preparedStatement close");
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//        }
            
        }
        this.dispose();
    }//GEN-LAST:event_btnNameUpdateActionPerformed

    private void btnNameEitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameEitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnNameEitActionPerformed

    private void btnAddressBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressBackActionPerformed
        new AddAndReadDatabase().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddressBackActionPerformed

    private void btnAddressUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressUpdateActionPerformed
         newAddress = txtFieldAddress.getText();
        existingId = btnFieldExistId.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test");
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE person set address=  '" + newAddress + "'   where id= '" + existingId + "';");
            preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
//        } finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                    System.out.println("connection close");
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//            try {
//                if (preparedStatement != null) {
//                    preparedStatement.close();
//                    System.out.println("preparedStatement close");
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//        }
            
        }
        this.dispose();
    }//GEN-LAST:event_btnAddressUpdateActionPerformed

    private void btnAddressExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnAddressExitActionPerformed

    private void btnPhoneBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhoneBackActionPerformed
        new AddAndReadDatabase().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPhoneBackActionPerformed

    private void btnPhoneUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhoneUpdateActionPerformed
        newPhone = txtFieldPhone.getText();
        existingId = txtPhoneExitId.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test");
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE person set phone=  '" + newPhone + "'   where id= '" + existingId + "';");
            preparedStatement.executeUpdate();
            connection.close();
            preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
//        } finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                    System.out.println("connection close");
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//            try {
//                if (preparedStatement != null) {
//                    preparedStatement.close();
//                    System.out.println("preparedStatement close");
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//        }
            
        }
        this.dispose();
    }//GEN-LAST:event_btnPhoneUpdateActionPerformed

    private void btnPhoneExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhoneExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnPhoneExitActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane IdTabbedPnnel;
    private javax.swing.JButton btnAddressBack;
    private javax.swing.JButton btnAddressExit;
    private javax.swing.JButton btnAddressUpdate;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField btnFieldExistId;
    private javax.swing.JButton btnIdExit;
    private javax.swing.JButton btnIdUpdate;
    private javax.swing.JButton btnNameBack;
    private javax.swing.JButton btnNameEit;
    private javax.swing.JButton btnNameUpdate;
    private javax.swing.JButton btnPhoneBack;
    private javax.swing.JButton btnPhoneExit;
    private javax.swing.JButton btnPhoneUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtFieldAddress;
    private javax.swing.JTextField txtFieldName;
    private javax.swing.JTextField txtFieldNameOldId;
    private javax.swing.JTextField txtFieldNewId;
    private javax.swing.JTextField txtFieldOldId;
    private javax.swing.JTextField txtFieldPhone;
    private javax.swing.JTextField txtPhoneExitId;
    // End of variables declaration//GEN-END:variables
}
