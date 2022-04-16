/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inventory_Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author yagra
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        SelectCustomer();
    }
    

     Connection Con = null; 
    Statement St = null;
    ResultSet Rs = null;
    Statement St1 = null;
    ResultSet Rs1 = null;
    String prodid="a";

   public void SelectCustomer(){
    try{
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","root","root");
        St = Con.createStatement();
        Rs = St.executeQuery("select * from CUSTOMER_TABLE");
        CustomerTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }
     catch(SQLException e){
          e.printStackTrace();
      }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CustomID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CustomName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CustomNo = new javax.swing.JTextField();
        Customadd = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        CustomDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        count = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        sum = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INVENTORY CONTROL");

        jLabel4.setFont(new java.awt.Font("STCaiyun", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANAGE CUSTOMERS");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("x");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(379, 379, 379))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(358, 358, 358)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        CustomID.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        CustomID.setForeground(new java.awt.Color(51, 51, 51));
        CustomID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomIDActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("CustomerID");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Name");

        CustomName.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        CustomName.setForeground(new java.awt.Color(51, 51, 51));
        CustomName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomNameActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Phone/Email");

        CustomNo.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        CustomNo.setForeground(new java.awt.Color(51, 51, 51));
        CustomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomNoActionPerformed(evt);
            }
        });

        Customadd.setBackground(new java.awt.Color(0, 153, 204));
        Customadd.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        Customadd.setForeground(new java.awt.Color(255, 255, 255));
        Customadd.setText("ADD");
        Customadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomaddMouseClicked(evt);
            }
        });
        Customadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomaddActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(0, 153, 204));
        updatebtn.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("EDIT");
        updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtnMouseClicked(evt);
            }
        });
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        homebtn.setBackground(new java.awt.Color(0, 153, 204));
        homebtn.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        homebtn.setForeground(new java.awt.Color(255, 255, 255));
        homebtn.setText("HOME");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        CustomDelete.setBackground(new java.awt.Color(0, 153, 204));
        CustomDelete.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        CustomDelete.setForeground(new java.awt.Color(255, 255, 255));
        CustomDelete.setText("DELETE");
        CustomDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomDeleteMouseClicked(evt);
            }
        });
        CustomDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomDeleteActionPerformed(evt);
            }
        });

        CustomerTable.setAutoCreateRowSorter(true);
        CustomerTable.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "CustomerName", "CustomerContact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomerTable.setRowHeight(25);
        CustomerTable.setSelectionBackground(new java.awt.Color(0, 153, 204));
        CustomerTable.getTableHeader().setReorderingAllowed(false);
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("STCaiyun", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Customers List");

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));

        count.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        count.setForeground(new java.awt.Color(255, 255, 255));
        count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count.setText("X");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Order Number");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(count, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(count)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));

        sum.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        sum.setForeground(new java.awt.Color(255, 255, 255));
        sum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sum.setText("X");
        sum.setToolTipText("");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Order Amount");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(303, 303, 303))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CustomDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Customadd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CustomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CustomID)
                                    .addComponent(CustomName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CustomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CustomName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CustomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Customadd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CustomIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomIDActionPerformed

    private void CustomNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomNameActionPerformed

    private void CustomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomNoActionPerformed

    private void CustomaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomaddActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtnActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homebtnActionPerformed

    private void CustomDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomDeleteActionPerformed

    private void CustomaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomaddMouseClicked
    try{
           Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","root","root");
           String sql="Select CustomerID from CUSTOMER_TABLE";
           St = Con.createStatement();
           Rs = St.executeQuery(sql);
           Boolean check=true;
           boolean customcheck = true;
         customcheck = CustomID.getText().matches("-?\\d+(\\.\\d+)?");
          
        if(!customcheck)
        {JOptionPane.showMessageDialog(this,"Invalid parameter of customer Id");
        return;}
           while(Rs.next()){
               if(Integer.valueOf(CustomID.getText())== Rs.getInt("CustomerID")){
                   JOptionPane.showMessageDialog(this,"Customer Id already exist");
                   check=false;
               }
           }
           Rs.close();
           St.close();
           if(check){
          PreparedStatement add = Con.prepareStatement("insert into CUSTOMER_TABLE values(?,?,?)");
          int id=Integer.valueOf(CustomID.getText());
          if(id<=0){
              JOptionPane.showMessageDialog(this,"Invalid Parameter");
          }
          else{
          add.setInt(1,id );
          add.setString(2, CustomName.getText());
          add.setString(3, CustomNo.getText());
          int row = add.executeUpdate();
          JOptionPane.showMessageDialog(this,"Customer Succeesfully Added");}}
          Con.close();
          SelectCustomer();
    } 
      catch(SQLException e){
          e.printStackTrace();
}     
    }//GEN-LAST:event_CustomaddMouseClicked

    private void CustomDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomDeleteMouseClicked
         if(CustomID.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "Enter The Customer ID to be deleted");
      }
      else
      {
          
          try{
               Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","root","root");
               String sql="Select CustomerID from CUSTOMER_TABLE";
           St = Con.createStatement();
           Rs = St.executeQuery(sql);
           Boolean check=false;
           while(Rs.next()){
               if(Integer.valueOf(CustomID.getText())== Rs.getInt("CustomerID")){
                 
                   check=true;
               }
           }
           Rs.close();
           St.close();
           if(check){
               String Id =CustomID.getText();
               String Query = "Delete from root.CUSTOMER_TABLE where CustomerID="+Id;
               Statement Add = Con.createStatement();
               Add.executeUpdate(Query);
           SelectCustomer();
               
               JOptionPane.showMessageDialog(this, "Customer has been removed");
          }
           else{
               JOptionPane.showMessageDialog(this,"Enter valid Customer ID");
               
           }
           
          }
          catch (SQLException e)
          {
            e.printStackTrace();
          }
      }
    }//GEN-LAST:event_CustomDeleteMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
         DefaultTableModel model=(DefaultTableModel)CustomerTable.getModel();
        int Myindex = CustomerTable.getSelectedRow();
        CustomID.setText(model.getValueAt(Myindex,0).toString());
        prodid=model.getValueAt(Myindex,0).toString();
        CustomName.setText(model.getValueAt(Myindex,1).toString());
        CustomNo.setText(model.getValueAt(Myindex,2).toString());
        try{
              Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","root","root");
               St = Con.createStatement();
               St1 = Con.createStatement();
               Rs = St.executeQuery("select count(*) from root.ORDER_TABLE where CUSTOMERNAME='"+model.getValueAt(Myindex, 1).toString()+"'");
               Rs1 = St1.executeQuery("select sum(AMOUNT) from root.ORDER_TABLE where CUSTOMERNAME='"+model.getValueAt(Myindex, 1).toString()+"'");
               while(Rs.next()){
                   count.setText(""+Rs.getInt(1));
               }
               while(Rs1.next()){
                   sum.setText("Rs. "+Rs1.getInt(1));
               }
        
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_CustomerTableMouseClicked

    private void updatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseClicked
     if(CustomID.getText().isEmpty() ||CustomName.getText().isEmpty() || CustomNo.getText().isEmpty() ){
         JOptionPane.showMessageDialog(this,"Incomplete Information");
         
     }
     else if(!prodid.equals(CustomID.getText()) && !prodid.equals("a")){
         JOptionPane.showMessageDialog(this,"Customer id cannot be changed" );
     }
     else{
         try{
              Con = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","root","root");
              String sql="Select CustomerID from CUSTOMER_TABLE";
           St = Con.createStatement();
           Rs = St.executeQuery(sql);
           Boolean check=false;
           while(Rs.next()){
               if(Integer.valueOf(CustomID.getText())== Rs.getInt("CustomerID")){
                   check=true;
               }
           }
           Rs.close();
           St.close();
           if(check){
              String UpdateQuery = "Update root.CUSTOMER_TABLE set CustomerName='"+CustomName.getText()+"'"+",CustomerContact='"+CustomNo.getText()+"'"+"where CustomerID="+CustomID.getText();
              Statement add = Con.createStatement();
              add.executeUpdate(UpdateQuery);
              JOptionPane.showMessageDialog(this,"Updated Sucessfully");
              SelectCustomer();        }
           else{
               JOptionPane.showMessageDialog(this,"Customer Id does not exist");
           }
         }
         catch(Exception e){
             
             e.printStackTrace();
         }
     }
    }//GEN-LAST:event_updatebtnMouseClicked

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
       new Home().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_homebtnMouseClicked

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomDelete;
    private javax.swing.JTextField CustomID;
    private javax.swing.JTextField CustomName;
    private javax.swing.JTextField CustomNo;
    private javax.swing.JButton Customadd;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JLabel count;
    private javax.swing.JButton homebtn;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sum;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
