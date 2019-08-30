/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipfinder;

/**
 *
 * @author BRI
 */
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
public class IpFinder extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    JLabel label;
    JTextField textField;
    JButton btn;
    
    IpFinder(){
        super("IP FINDER TOOLS");
        label = new JLabel("Enter URL: ");
        label.setBounds(50,70,150,20);
        textField = new JTextField();
        textField.setBounds(50,100,200,20);
        btn = new JButton("Find IP");
        btn.setBounds(50,150,80,30);
        btn.addActionListener(this);
        add(label);
        add(textField);
        add(btn);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        String url = textField.getText();
        try{
            InetAddress ia = InetAddress.getByName(url);
            System.out.println(ia);
            String ip = ia.getHostAddress();
            JOptionPane.showMessageDialog(this,ip);
        }catch(UnknownHostException ie){
            JOptionPane.showMessageDialog(this,ie.toString());
        }
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        new IpFinder();
    }
    
}
