
package LogIn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import HomePage.Homepage;
import Booking.Booking;
//import Conn.Conn;
import Conn.Conn;

public class Login extends JFrame implements ActionListener{
    public JLabel lblUser, lblPass;
    public JTextField txtUser;
    public JPasswordField txtPass; 
    public JButton btnLogin, btnBack, btnClose;
    
    public Login(){
        setBounds(400,200,800,400); 
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setLayout(null);
        
        JLabel label = new JLabel("Login Page");
        label.setBounds(30, 20, 500, 50);
        label.setFont(new Font("Edwardian Script ITC",Font.PLAIN,40));
        
        lblUser = new JLabel("Username: ");
        lblUser.setBounds(70,90,100,30);
        
        lblPass = new JLabel("Password: ");
        lblPass.setBounds(70,145,100,30);
        
        txtUser = new JTextField();
        txtUser.setBounds(160,90,200,30);
        
        txtPass = new JPasswordField();
        txtPass.setBounds(160,145, 200, 30);
        //txtPass.setEchoChar('*');
        
        btnLogin = new JButton("Login");
        btnLogin.setBounds(60,230,150,30);
        btnLogin.setBackground(Color.BLACK);
        btnLogin.setForeground(Color.WHITE);
        btnLogin.addActionListener(this);
        
        btnBack = new JButton("Back");
        btnBack.setBounds(255, 230, 150, 30);
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.WHITE);
        btnBack.addActionListener(this);
        
        btnClose = new JButton("Close");
        btnClose.setBounds(600, 300, 150, 30);
        btnClose.setBackground(Color.BLACK);
        btnClose.setForeground(Color.WHITE);
        btnClose.addActionListener(this);
        
        
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/Third.png"));
        JLabel image = new JLabel(i3);
        image.setBounds(400,10,362,280);
                
        
        add(label);
        add(lblUser);
        add(lblPass);
        add(txtUser);
        add(txtPass);
        add(btnLogin);
        add(btnBack);
        add(btnClose);
        add(image);
                      
        setVisible(true);
    }
    
    
    public static void main(String args[]){
        new Login();
    }
    
    // Action Listener for Login
    @Override
    public void actionPerformed(ActionEvent e){
        
        // Action of Back Button
        if(e.getSource()==btnBack){
            this.setVisible(false);
            new Homepage();
        }
        
        // Action of Close Button
        else if(e.getSource()==btnClose){
            this.dispose();
        }
        
        // Action of Login Button
        else if (e.getSource()==btnLogin){
            String user = txtUser.getText();
            String pass = txtPass.getText();
            try{
                Conn c = new Conn();
              
                // Connection with Db
                String query = "SELECT * FROM tbl_login WHERE Username = '"+user+"' and Password = '"+pass+"'";
                
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next()){
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "Login Successfully");
                    new Booking();
                }else{
                    JOptionPane.showMessageDialog(null, "Unknown Invalid Username or Password");
                }
                
            }catch(Exception ex) {
                ex.printStackTrace();
            }
        
        }
        
    }
        
}
