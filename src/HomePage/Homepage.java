
package HomePage;

import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import LogIn.Login;


public class Homepage extends JFrame implements ActionListener{
	JLabel text1, text2;
        JLabel image;
        JButton btnLogin, btnRegister;
        
        
	public Homepage(){
                
                // set JFrame
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                setSize(screenSize.width, screenSize.height);
                setLocation(0,0);
                setResizable(false);
                
                // Add Image in frame
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/FirstOne.png"));
		image = new JLabel(i1);
                image.setBounds(0, 0, screenSize.width, screenSize.height);
		add(image);
                
                
                // Add text Luton Hotel
                text1 = new JLabel("Luton Hotel");
                text1.setBounds(60,5,500,100);
                text1.setForeground(Color.BLACK);
                text1.setFont(new Font("Times New Roman",Font.BOLD,60));
                image.add(text1);
                
                
                // Add text Hotel Management System
                text2 = new JLabel("Hotel Online Booking and Management System");
                text2.setBounds(50,65,1000,100);
                text2.setForeground(Color.BLACK);
                text2.setFont(new Font("Edwardian Script ITC",Font.PLAIN,50));
                image.add(text2);
                
                
                // Add Login Button
                btnLogin = new JButton("Log in");
                btnLogin.setBounds(1525,20,150,40);
                btnLogin.setFont(new Font("Times New Roman",Font.BOLD,18));
                btnLogin.setBackground(Color.BLACK);
                btnLogin.setForeground(Color.WHITE);
                btnLogin.addActionListener(this);
                image.add(btnLogin);
                
                
                
                // Add Register Button
                btnRegister = new JButton("Register Now");
                btnRegister.setBounds(1525,70,150,40);
                btnRegister.setBackground(Color.white);
                btnRegister.setFont(new Font("Times New Roman",Font.BOLD,18));
                btnRegister.addActionListener(this);
                image.add(btnRegister);
                
                
                // set Visibility
                setVisible(true);
	}
	
        // Action Litener for Login
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==btnLogin){
                this.setVisible(false);
                new LogIn.Login();
            }
            else if(e.getSource()==btnRegister){
                this.setVisible(false);
                new RegisterNow.Register();
            }
            
        }
        
	public static void main(String args[]) {
		new Homepage();
	}
        
        
}
