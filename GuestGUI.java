/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mennat Allah
 */
public class GuestGUI extends JFrame implements ActionListener{

    JLabel checkIn;
    JLabel checkOut;
    JLabel RoomType;
    JLabel Phone;
    JLabel deposite;
    JLabel nationality;
    JLabel Fname;
    JLabel Lname;
    JLabel age;
    JLabel id;
    JLabel view;
    JLabel acc;

    JTextField TPhone;
    JTextField Tdepostie;
    JTextField Tnationality;
    JTextField TFname;
    JTextField TLname;
    JTextField Tage;
    JTextField TID;

    JComboBox room;

    JComboBox InDay;
    JComboBox InMonth;
    JComboBox InYear;
    JComboBox OutDay;
    JComboBox OutMonth;
    JComboBox OutYear;
    JComboBox views;
    JComboBox accom;
    
    JButton reserve;

    String [] days = {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    String [] Month = {" ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String [] year = {" ", "2021", "2022", "2023", "2024", "2025"};
    String [] rooms = {" ", "Deluxe Room", "Honeymoon - Package", "Family Suite (2 Adults)", "Junior Family Suite (2 Adults)", "Aqua Suite", "Deluxe Triple Room"};
    String [] v = {" ", "Garden", "Pool"};
    String [] acco = {" ", "without", "Full board", "breakfast only", "lunch only",
        "dinner only", "breakfast and dinner"};
    public GuestGUI() {
        setSize(550, 640);
        setTitle("Guest");
        setLayout(null);

        Fname = new JLabel("First Name");
        TFname = new JTextField();

        Lname = new JLabel("Last Name");
        TLname = new JTextField();

        nationality = new JLabel("Nationality");
        Tnationality = new JTextField();

        age = new JLabel("Age");
        Tage = new JTextField();

        deposite = new JLabel("Deposite");
        Tdepostie = new JTextField();

        Phone = new JLabel("Phone");
        TPhone = new JTextField();

        id = new JLabel("National ID");
        TID = new JTextField();

        checkIn = new JLabel("Check In Date");
        InDay = new JComboBox(days);
        InMonth = new JComboBox(Month);
        InYear = new JComboBox(year);
        
        checkOut = new JLabel("Check Out Date");
        OutDay = new JComboBox(days);
        OutMonth = new JComboBox(Month);
        OutYear = new JComboBox(year);
        
        RoomType = new JLabel("Room Type");
        room = new JComboBox(rooms);
        
        view = new JLabel("Room View");
        views = new JComboBox(v);
        
        acc = new JLabel("Accommodation Type");
        accom = new JComboBox(acco);
        
        reserve = new JButton("Reserve");
        reserve.addActionListener(this);
        
        Fname.setBounds(90, 50, 90, 30);
        TFname.setBounds(190, 50, 150, 30);
        
        Lname.setBounds(90, 90, 90, 30);
        TLname.setBounds(190, 90, 150, 30);
        
        nationality.setBounds(90, 130, 90, 30);
        Tnationality.setBounds(190, 130, 150, 30);
        
        age.setBounds(90, 170, 90, 30);
        Tage.setBounds(190, 170, 150, 30);
        
        deposite.setBounds(90, 210, 90, 30);
        Tdepostie.setBounds(190, 210, 150, 30);
        
        Phone.setBounds(90, 250, 90, 30);
        TPhone.setBounds(190, 250, 150, 30);
                
        id.setBounds(90, 290, 90, 30);
        TID.setBounds(190, 290, 150, 30);
        
        checkIn.setBounds(90, 330, 90, 30);
        InDay.setBounds(190, 330, 50, 30);
        InMonth.setBounds(250, 330, 80, 30);
        InYear.setBounds(340, 330, 65, 30);
        
        checkOut.setBounds(90, 370, 90, 30);
        OutDay.setBounds(190, 370, 50, 30);
        OutMonth.setBounds(250, 370, 80, 30);
        OutYear.setBounds(340, 370, 65, 30);
        
        RoomType.setBounds(90, 410, 90, 30);
        room.setBounds(190, 410, 150, 30);
        
        view.setBounds(90, 450, 90, 30);
        views.setBounds(190, 450, 80, 30);
        
        acc.setBounds(90, 490, 90, 30);
        accom.setBounds(190, 490, 150, 30);
        
        reserve.setBounds(250, 540, 90, 30);
        
        add(Fname);
        add(TFname);
        
        add(Lname);
        add(TLname);
        
        add(nationality);
        add(Tnationality);
        
        add(age);
        add(Tage);
        
        add(deposite);
        add(Tdepostie);
        
        add(Phone);
        add(TPhone);
        
        add(id);
        add(TID);
        
        add(checkIn);
        add(InDay);
        add(InMonth);
        add(InYear);
        
        add(checkOut);
        add(OutDay);
        add(OutMonth);
        add(OutYear);
        
        add(RoomType);
        add(room);
        
        add(view);
        add(views);
        
        add(acc);
        add(accom);
        
        add(reserve);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == reserve) 
        {
            JOptionPane.showMessageDialog(this, "Room reserved");
        }
    }
}
