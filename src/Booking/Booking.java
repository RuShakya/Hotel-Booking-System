
package Booking;

import javax.swing.*;
import java.awt.*;


public class Booking extends JFrame{
    public JLabel label1, label2, lblCheckIn, lblCheckOut, lblRoomType;
    public JPanel panel1,panel2;
    public JTextField txtCheckIn, txtCheckOut;
    public JComboBox cbRoomType;
    public JButton btnRequest, btnBack;
    
    
    public Booking(){
    
        //setBounds(-10,0,1760,979);    --------- SET FRAME SIZE
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setLocation(0,0);
                
        // Main Label Customer Dashboard
        label1 = new JLabel("Customer Booking Dashboard");
        label1.setBounds(30, 20, 500, 60);
        label1.setFont(new Font("Edwardian Script ITC",Font.PLAIN,50));
        
        panel1 = new JPanel();
        panel1.setBackground(Color.lightGray);
        panel1.setBounds(30, 90, 470, 823);
        
        panel2 = new JPanel();
        panel2.setBackground(Color.lightGray);
        panel2.setBounds(520, 853, 1175, 60);
        
        label2 = new JLabel("Check for Booking");
        label2.setBounds(140, 100, 500, 50);
        label2.setFont(new Font("Book Antiqua",Font.PLAIN,25));
        
        lblCheckIn = new JLabel("Check-In: ");
        lblCheckIn.setBounds(60, 180, 150, 30);
        lblCheckIn.setFont(new Font("Bahnschrift SemiBold SemiConden",Font.PLAIN,18));
        
        lblCheckOut = new JLabel("Check-Out: ");
        lblCheckOut.setBounds(60, 250, 150, 30);
        lblCheckOut.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
        
        lblRoomType = new JLabel("Room Type: ");
        lblRoomType.setBounds(60, 320, 150, 30);
        lblRoomType.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
        
        txtCheckIn = new JTextField();
        txtCheckIn.setBounds(170, 180, 190, 30);
        
        txtCheckOut = new JTextField();
        txtCheckOut.setBounds(170, 250, 190, 30);
        
        String str[] = {"Single", "Double", "Twin"};
        cbRoomType = new JComboBox(str);
        cbRoomType.setBounds(170, 320, 190, 30);
        cbRoomType.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 18));
        
        btnRequest = new JButton("Request Room");
        btnRequest.setBounds(60, 390, 150, 30);
        btnRequest.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
        
        btnBack = new JButton("Back");
        btnBack.setBounds(250, 390, 150, 30);
        btnBack.setFont(new Font("Bahnschrift SemiBold SemiConden", Font.PLAIN, 14));
        
        
        
        add(label1);    add(label2);
        add(lblCheckIn);
        add(lblCheckOut);
        add(lblRoomType);
        add(txtCheckIn);
        add(txtCheckOut);
        add(cbRoomType);
        add(btnRequest);
        add(btnBack);
        
        
        add(panel1);
        add(panel2);
        
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }
    
    
    public static void main (String args[]){
        new Booking();
    }
}
