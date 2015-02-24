
import java.awt.Color;
import static java.awt.Color.white;
import javax.swing.JFileChooser;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikem_000
 */
public class EZFacUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public EZFacUI() {
        initComponents();

        // first commit
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        roomInfoPopup = new javax.swing.JPanel();
        roomCampus = new javax.swing.JLabel();
        roomBuildingName = new javax.swing.JLabel();
        roomFloor = new javax.swing.JLabel();
        roomNumber = new javax.swing.JLabel();
        roomFOAPAL = new javax.swing.JLabel();
        roomFOAPALName = new javax.swing.JLabel();
        roomType = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        deptColorChooser = new javax.swing.JColorChooser();
        changeDeptColor = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mapChooser = new javax.swing.JFileChooser();
        quitConfirmation = new javax.swing.JDialog();
        quitConfirmYes = new javax.swing.JButton();
        quitConfirmCancel = new javax.swing.JButton();
        quitConfirmQuestion = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        buildingDropdown = new javax.swing.JComboBox();
        floorDropdown = new javax.swing.JComboBox();
        campusDropdown = new javax.swing.JComboBox();
        floorLabel = new javax.swing.JLabel();
        campusLabel = new javax.swing.JLabel();
        buildingLabel = new javax.swing.JLabel();
        spreadsheetPanel = new javax.swing.JScrollPane();
        spreadsheetTable = new javax.swing.JTable();
        occupancy = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileButton = new javax.swing.JMenu();
        addNewMap = new javax.swing.JMenuItem();
        quitButton = new javax.swing.JMenuItem();
        settingsButton = new javax.swing.JMenu();
        modDeptColor = new javax.swing.JMenuItem();
        resetDeptColors = new javax.swing.JMenuItem();
        helpButton = new javax.swing.JMenu();
        userManualButton = new javax.swing.JMenuItem();
        aboutButton = new javax.swing.JMenuItem();

        jFrame1.setMinimumSize(new java.awt.Dimension(276, 236));

        roomInfoPopup.setMinimumSize(new java.awt.Dimension(275, 225));

        roomCampus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        roomCampus.setText("Campus: ");

        roomBuildingName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        roomBuildingName.setText("Building Name: ");

        roomFloor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        roomFloor.setText("Floor: ");

        roomNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        roomNumber.setText("Room Number: ");

        roomFOAPAL.setText("FOAPAL: ");

        roomFOAPALName.setText("FOAPAL Name: ");

        roomType.setText("Room Type: ");

        jLabel5.setText("Room Area: ");

        jLabel10.setText("Action Date: ");

        jLabel12.setText("Action Type: ");

        jLabel23.setText("MC");

        jLabel13.setText("Ritter Hall Annex");

        jLabel19.setText("Fourth Floor");

        jLabel20.setText("00431");

        jLabel21.setText("1000000920001 ");

        jLabel14.setText("CHP:Ctr for Intergenerati ");

        jLabel16.setText("Office-Administration ");

        jLabel15.setText("129 ");

        jLabel17.setText("11/14 ");

        jLabel18.setText("CHG FOP ");

        jButton2.setText("Select Color");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roomInfoPopupLayout = new javax.swing.GroupLayout(roomInfoPopup);
        roomInfoPopup.setLayout(roomInfoPopupLayout);
        roomInfoPopupLayout.setHorizontalGroup(
            roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomInfoPopupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roomInfoPopupLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roomInfoPopupLayout.createSequentialGroup()
                        .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(roomType)
                                    .addComponent(roomFOAPALName)
                                    .addComponent(roomFOAPAL)
                                    .addGroup(roomInfoPopupLayout.createSequentialGroup()
                                        .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(roomFloor)
                                            .addComponent(roomCampus)
                                            .addComponent(roomBuildingName))
                                        .addGap(1, 1, 1)))
                                .addComponent(roomNumber)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roomInfoPopupLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        roomInfoPopupLayout.setVerticalGroup(
            roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomInfoPopupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomBuildingName)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomFloor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomNumber)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomFOAPAL)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomFOAPALName)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomType)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomInfoPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(roomInfoPopup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addComponent(roomInfoPopup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deptColorChooser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        changeDeptColor.setText("jMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        mapChooser.setAccessory(addNewMap);

        quitConfirmation.setAlwaysOnTop(true);
        quitConfirmation.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        quitConfirmation.setMinimumSize(new java.awt.Dimension(500, 300));

        quitConfirmYes.setText("Yes");
        quitConfirmYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitConfirmYesActionPerformed(evt);
            }
        });

        quitConfirmCancel.setText("Cancel");
        quitConfirmCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitConfirmCancelActionPerformed(evt);
            }
        });

        quitConfirmQuestion.setText("Are you sure you want to quit?");

        javax.swing.GroupLayout quitConfirmationLayout = new javax.swing.GroupLayout(quitConfirmation.getContentPane());
        quitConfirmation.getContentPane().setLayout(quitConfirmationLayout);
        quitConfirmationLayout.setHorizontalGroup(
            quitConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quitConfirmationLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(quitConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quitConfirmationLayout.createSequentialGroup()
                        .addComponent(quitConfirmYes)
                        .addGap(36, 36, 36)
                        .addComponent(quitConfirmCancel))
                    .addComponent(quitConfirmQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(129, 129, 129))
        );
        quitConfirmationLayout.setVerticalGroup(
            quitConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quitConfirmationLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(quitConfirmQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addGroup(quitConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitConfirmYes)
                    .addComponent(quitConfirmCancel))
                .addGap(53, 53, 53))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPanelMouseClicked(evt);
            }
        });

        buildingDropdown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buildingDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ritter Hall (004)" }));
        buildingDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingDropdownActionPerformed(evt);
            }
        });

        floorDropdown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        floorDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2nd Floor" }));
        floorDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorDropdownActionPerformed(evt);
            }
        });

        campusDropdown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campusDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Main" }));
        campusDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campusDropdownActionPerformed(evt);
            }
        });

        floorLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        floorLabel.setText("Floor");

        campusLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campusLabel.setText("Campus");

        buildingLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buildingLabel.setText("Building");

        spreadsheetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spreadsheetPanel.setViewportView(spreadsheetTable);

        occupancy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        occupancy.setText("Ocupancy");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(spreadsheetPanel)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(campusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campusDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buildingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buildingDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(floorLabel)
                        .addGap(10, 10, 10)
                        .addComponent(floorDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(occupancy)
                        .addGap(77, 88, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(occupancy)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buildingDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campusDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buildingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(floorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(floorDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(spreadsheetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );

        fileButton.setText("File");

        addNewMap.setText("Add New Map");
        addNewMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewMapActionPerformed(evt);
            }
        });
        fileButton.add(addNewMap);

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        fileButton.add(quitButton);

        menuBar.add(fileButton);

        settingsButton.setText("Settings");

        modDeptColor.setText("Change Department Color");
        modDeptColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modDeptColorActionPerformed(evt);
            }
        });
        settingsButton.add(modDeptColor);

        resetDeptColors.setText("Revert to Default Colors");
        resetDeptColors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetDeptColorsActionPerformed(evt);
            }
        });
        settingsButton.add(resetDeptColors);

        menuBar.add(settingsButton);

        helpButton.setText("Help");

        userManualButton.setText("User Manual");
        helpButton.add(userManualButton);

        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        helpButton.add(aboutButton);

        menuBar.add(helpButton);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(636, 636, 636)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campusDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campusDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campusDropdownActionPerformed

    private void floorDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_floorDropdownActionPerformed

    private void mainPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseClicked
        jFrame1.setVisible(true);

    }//GEN-LAST:event_mainPanelMouseClicked

    private void buildingDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buildingDropdownActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void resetDeptColorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetDeptColorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetDeptColorsActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        quitConfirmation.setVisible(true);
      //  System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_quitButtonActionPerformed

    private void addNewMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewMapActionPerformed
    mapChooser = new javax.swing.JFileChooser();
    mapChooser.removeChoosableFileFilter(mapChooser.getAcceptAllFileFilter());
    FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF & SVG", "pdf", "svg");
    mapChooser.addChoosableFileFilter(filter);
    int returnVal = mapChooser.showOpenDialog(this);

    
    }//GEN-LAST:event_addNewMapActionPerformed

    private void modDeptColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modDeptColorActionPerformed
        deptColorChooser = new javax.swing.JColorChooser();
                AbstractColorChooserPanel[] oldPanels = deptColorChooser.getChooserPanels();
    for (int i = 0; i < oldPanels.length; i++) {
      String clsName = oldPanels[i].getClass().getName();
       if (clsName.equals("javax.swing.colorchooser.DefaultRGBChooserPanel")) {
        deptColorChooser.removeChooserPanel(oldPanels[i]);
      } else if (clsName.equals("javax.swing.colorchooser.DefaultHSBChooserPanel")) {
        deptColorChooser.removeChooserPanel(oldPanels[i]);
      }
        else if (clsName.equals("javax.swing.colorchooser.DefaultHSYKChooserPanel")) {
        deptColorChooser.removeChooserPanel(oldPanels[i]);
                }
    }
        Color newColor = deptColorChooser.showDialog(this,"Choose a Department Color",white);
    
    }//GEN-LAST:event_modDeptColorActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void quitConfirmYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitConfirmYesActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_quitConfirmYesActionPerformed

    private void quitConfirmCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitConfirmCancelActionPerformed
        quitConfirmation.setVisible (false);// TODO add your handling code here:
    }//GEN-LAST:event_quitConfirmCancelActionPerformed

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
            java.util.logging.Logger.getLogger(EZFacUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EZFacUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EZFacUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EZFacUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutButton;
    private javax.swing.JMenuItem addNewMap;
    private javax.swing.JComboBox buildingDropdown;
    private javax.swing.JLabel buildingLabel;
    private javax.swing.JComboBox campusDropdown;
    private javax.swing.JLabel campusLabel;
    private javax.swing.JMenuItem changeDeptColor;
    private javax.swing.JColorChooser deptColorChooser;
    private javax.swing.JMenu fileButton;
    private javax.swing.JComboBox floorDropdown;
    private javax.swing.JLabel floorLabel;
    private javax.swing.JMenu helpButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel mainPanel;
    public javax.swing.JFileChooser mapChooser;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem modDeptColor;
    private javax.swing.JLabel occupancy;
    private javax.swing.JMenuItem quitButton;
    private javax.swing.JButton quitConfirmCancel;
    private javax.swing.JLabel quitConfirmQuestion;
    private javax.swing.JButton quitConfirmYes;
    private javax.swing.JDialog quitConfirmation;
    private javax.swing.JMenuItem resetDeptColors;
    private javax.swing.JLabel roomBuildingName;
    private javax.swing.JLabel roomCampus;
    private javax.swing.JLabel roomFOAPAL;
    private javax.swing.JLabel roomFOAPALName;
    private javax.swing.JLabel roomFloor;
    private javax.swing.JPanel roomInfoPopup;
    private javax.swing.JLabel roomNumber;
    private javax.swing.JLabel roomType;
    private javax.swing.JMenu settingsButton;
    private javax.swing.JScrollPane spreadsheetPanel;
    private javax.swing.JTable spreadsheetTable;
    private javax.swing.JMenuItem userManualButton;
    // End of variables declaration//GEN-END:variables
}
