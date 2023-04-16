
package RegisterNow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.sql.*;
import Conn.Conn;
import HomePage.Homepage;



public class Register extends JFrame implements ActionListener{
    JLabel label,lblID, lblName, lblAddress, lblGender, lblPhone, lblEmail, lblUsername, lblPassword, lblRole, lblCreditCardInfo;
    JLabel image;
    JTextField txtID, txtName, txtAddress, txtPhone, txtEmail, txtUsername, txtPassword, txtCreditCardInfo;
    JRadioButton rbMale,rbFemale, rbOther;
    JComboBox cbRole;
    JButton btnBack, btnSubmit, btnSearch, btnEdit, btnDelete;
    
    public Register(){
        
        setBounds(400,50,950,850);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        
        label = new JLabel("Registration Page");
        label.setBounds(30, 20, 500, 60);
        label.setFont(new Font("Edwardian Script ITC",Font.PLAIN,50));
        
        lblID = new JLabel("ID: ");
        lblID.setBounds(70,90,100,30);
        
        lblName = new JLabel("Name: ");
        lblName.setBounds(70,145,100,30);
        
        lblAddress = new JLabel("Address: ");
        lblAddress.setBounds(70,200,100,30);
        
        lblGender = new JLabel("Gender: ");
        lblGender.setBounds(70,255,100,30);
        
        lblPhone = new JLabel("Phone Number: ");
        lblPhone.setBounds(70,310,100,30);
        
        lblEmail = new JLabel("Email: ");
        lblEmail.setBounds(70,365,100,30);
        
        lblUsername = new JLabel("Username: ");
        lblUsername.setBounds(70,420,100,30);
        
        lblPassword = new JLabel("Password: ");
        lblPassword.setBounds(70,475,100,30);
        
        lblRole = new JLabel("Role: ");
        lblRole.setBounds(70,530,100,30);
      
        lblCreditCardInfo = new JLabel("Credit Card Info: ");
        lblCreditCardInfo.setBounds(70,585, 100,30);
        
//-----------------------------------------------------------------------------

        txtID = new JTextField();
        txtID.setBounds(180,90,300,30);
        
        txtName = new JTextField();
        txtName.setBounds(180,145, 300, 30);
        
        txtAddress = new JTextField();
        txtAddress.setBounds(180,200,300,30);
        
        rbMale = new JRadioButton("Male");
        rbMale.setBounds(180,255,90,30);
        
        rbFemale = new JRadioButton("Female");
        rbFemale.setBounds(280,255,90,30);
        
        rbOther = new JRadioButton("Other");
        rbOther.setBounds(380,255,90,30);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbMale);
        bg.add(rbFemale);
        bg.add(rbOther);
        
        txtPhone = new JTextField();
        txtPhone.setBounds(180,310,300,30);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(180, 365, 300, 30);
        
        txtUsername = new JTextField();
        txtUsername.setBounds(180, 420, 300, 30);
        
        txtPassword = new JTextField();
        txtPassword.setBounds(180,475,300,30);
        
        String str[] = {"Individual Customer", "Corporate Customer"};
        cbRole = new JComboBox(str);
        cbRole.setBounds(180,530,300,30);
        cbRole.setBackground(Color.WHITE);
        
        txtCreditCardInfo = new JTextField();
        txtCreditCardInfo.setBounds(180, 585, 300, 30);
                
        btnBack = new JButton("Back");
        btnBack.setBounds(70, 640, 200, 30);
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.WHITE);
        btnBack.addActionListener(this);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(300, 640, 200, 30);
        btnSubmit.setBackground(Color.BLACK);
        btnSubmit.setForeground(Color.WHITE);
        btnSubmit.addActionListener(this);
        
        btnSearch = new JButton("Search");
        btnSearch.setBounds(70, 695, 200, 30);
        btnSearch.setBackground(Color.BLACK);
        btnSearch.setForeground(Color.WHITE);
        btnSearch.addActionListener(this);
        
        btnEdit = new JButton("Edit");
        btnEdit.setBounds(300, 695, 200, 30);
        btnEdit.setBackground(Color.BLACK);
        btnEdit.setForeground(Color.WHITE);
        btnEdit.addActionListener(this);
        
        btnDelete = new JButton("Delete");
        btnDelete.setBounds(70, 750, 200, 30);
        btnDelete.setBackground(Color.BLACK);
        btnDelete.setForeground(Color.WHITE);
        btnDelete.addActionListener(this);
        
        
        
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/FifthFour.png"));
        image = new JLabel(i4);
        image.setBounds(400,20,700,1080);
        
       
        add(lblID); add(txtID);
	add(lblName); add(txtName);
        add(lblAddress); add(txtAddress);
        add(lblGender); add(rbMale); add(rbFemale); add(rbOther);
	add(lblPhone); add(txtPhone);
	add(lblEmail); add(txtEmail);
	add(lblUsername); add(txtUsername);
	add(lblPassword); add(txtPassword);
	add(lblRole); add(cbRole);
        add(lblCreditCardInfo); add(txtCreditCardInfo);
        add(btnBack); add(btnSubmit);
        add(btnSearch); add(btnEdit);
        add(btnDelete);
        add(image);
        add(label);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        //Action for btnBack
        if(ae.getSource()==btnBack){
            setVisible(false);
            new Homepage();
        }
        
        // Action for Submit Button
        if(ae.getSource()==btnSubmit){
            int ID = Integer.parseInt(txtID.getText());
            String Name = txtName.getText();
            String Address = txtAddress.getText();
            String Gender = null;
                if(rbMale.isSelected()){
                    Gender = "Male";
                }else if(rbFemale.isSelected()){
                    Gender = "Female";
                }else if(rbOther.isSelected()){
                    Gender = "Other";
                }
            String Phone = txtPhone.getText();
            String Email = txtEmail.getText();
            String Username = txtUsername.getText();
            String Password = txtPassword.getText();
            String Role = (String)cbRole.getSelectedItem();
            String CreditCardInfo = txtCreditCardInfo.getText();
        
            try{
                Conn c = new Conn();
                String query1 = "INSERT INTO tbl_register VALUES(ID, '"+Name+"', '"+Address+"', '"+Gender+"', '"+Phone+"', '"+Email+"', '"+Username+"', '"+Password+"', '"+Role+"', '"+CreditCardInfo+"' )";
                //String query2 = "INSERT INTO tbl_login VALUES('"+Username+"', '"+Password+"') ";
                c.s.executeUpdate(query1);
                //c.s.executeQuery(query2);
                
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "Registered Successfully");
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }    
        
        /*
        // Action of btn Search
        if(ae.getSource()==btnSearch){
            /*int ID = Integer.parseInt(txtID.getText());
            String Name = txtName.getText();
            String Address = txtAddress.getText();
            String Gender = null;
                if(rbMale.isSelected()){
                    Gender = "Male";
                }else if(rbFemale.isSelected()){
                    Gender = "Female";
                }else if(rbOther.isSelected()){
                    Gender = "Other";
                }
            String Phone = txtPhone.getText();
            String Email = txtEmail.getText();
            String Username = txtUsername.getText();
            String Password = txtPassword.getText();
            String Role = (String)cbRole.getSelectedItem();
            String CreditCardInfo = txtCreditCardInfo.getText();*/
            
        /*
            try{
                Conn c = new Conn();
                String query2 = "SELECT * FROM tbl_register WHERE ID=?";
                
                
                
                int ID = Integer.parseInt(txtID.getText());
                //s.setInt(1,ID);
                ResultSet rs = c.s.executeQuery(query2);
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(null, "Sorry Record Not Found");
                }
                else{
                    txtName.setText(rs.getString("Name"));
                    txtAddress.setText("Address");
                    //txt
                }
                
                /*if (rs.next()== true) {
                int retrievedId = rs.getInt("ID");
                String retrievedName = rs.getString("Name");
                String retrievedAddress = rs.getString("Address");
                String retrievedRole = rs.getString("Role");
                String retrievedPhoneNumber = rs.getString("Phone");
                String retrievedCreditCardInfo = rs.getString("creditCardInfo");*/
            
        /*
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        
        //Action for btnDelete
        if(ae.getSource()==btnDelete){
            if(ae.getSource()==btnSubmit){
            int ID = Integer.parseInt(txtID.getText());
            String Name = txtName.getText();
            String Address = txtAddress.getText();
            String Gender = null;
                if(rbMale.isSelected()){
                    Gender = "Male";
                }else if(rbFemale.isSelected()){
                    Gender = "Female";
                }else if(rbOther.isSelected()){
                    Gender = "Other";
                }
            String Phone = txtPhone.getText();
            String Email = txtEmail.getText();
            String Username = txtUsername.getText();
            String Password = txtPassword.getText();
            String Role = (String)cbRole.getSelectedItem();
            String CreditCardInfo = txtCreditCardInfo.getText();
            
            try{
                Conn c = new Conn();
                String query3 = "Delete FROM tbl_register WHERE ID=?";
                
                c.s.executeUpdate(query3);
                
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        */
        

    }
    
    public static void main (String args[]){
        new Register();
    }
}
