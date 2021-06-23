/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mennat Allah
 */
public class Welcome extends JFrame {
    JButton j;
    
    public Welcome() {
        setSize(new Dimension(500, 500));
        setTitle("HOTEL RESERVATION");
        setLayout(new BorderLayout());

        j = new JButton();
        j.setPreferredSize(new Dimension(75, 150));
        j.setBackground(Color.RED);
        j.setFont(new Font("Arial", Font.PLAIN, 40));
        j.setForeground(Color.BLACK);
        j.setText("LOGIN FORM");
        j.addActionListener(new login());
        
        add(j, BorderLayout.SOUTH);
        JPanel north = new JPanel(new BorderLayout());
        JLabel t = new JLabel("HOTEL RESERVATION");
        north.setBackground(Color.WHITE);
        t.setFont(new Font("Arial", Font.PLAIN, 50));
        t.setForeground(Color.BLUE);
        t.setHorizontalAlignment(0);
        t.setVerticalAlignment(1);
        
        add(north, BorderLayout.NORTH);
        north.add(t);
        JPanel p = new JPanel(new GridLayout(10, 1));
        p.setBackground(Color.WHITE);

        JLabel please_select = new JLabel("PLEASE SELECT");
        p.add(please_select);
        p.add(new JLabel(""));
        please_select.setFont(new Font("Ariel", Font.PLAIN, 50));
        JButton please_select1 = new JButton(" GUEST ");
        JButton please_select2 = new JButton(" TRADITIONAL SERVICE ");
        JButton please_select3 = new JButton(" CHECKIN ");
        JButton please_select4 = new JButton(" CHECKOUT ");
        
        add(please_select1);
        p.add(please_select1);
        
        add(please_select2);
        p.add(please_select2);
        add(please_select3);
        
        p.add(please_select3);
        p.add(please_select4);
        p.add(please_select4);
        p.add(new JLabel(""));
        
        add(p, BorderLayout.CENTER);
        add(p);
    }
    
    private class login implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(j)){
                setVisible(false);
                Login l = new Login();
                l.setVisible(true);
            }
        }
    }
}
