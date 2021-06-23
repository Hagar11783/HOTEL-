/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.resevation;

import java.util.Scanner;

public class Guest {

    Scanner input = new Scanner(System.in);

    public String CheckNationality;
    public String name;
    public int age;
    public int Nationalid;
    public String checkindate;
    public int checkoutdate;
    public int roomnum;
    public String roomtype;
    public boolean checkroom;
    public double deposit;
    public int number;

    public Guest() {
        //this.name=name;

    }

    public Guest(String CheckNationality, String name,int number, int age, int Nationalid, String checkindate, int checkoutdate, int roomnum, String roomtype, boolean checkroom, double deposit) {
        this.CheckNationality = CheckNationality;
        this.name = name;
        this.number=number;
        this.age = age;
        this.Nationalid = Nationalid;
        this.checkindate = checkindate;
        this.checkoutdate = checkoutdate;
        this.roomnum = roomnum;
        this.roomtype = roomtype;
        this.checkroom = checkroom;
        this.deposit = deposit;
    }

    public int getNumber() {
        System.out.println("Enter Your Phone Number");
        int numb = input.nextInt();
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getname(String name) {
        System.out.println("Please Enter Your Name");
        String num = input.nextLine();
        return num;
    }

    public String setname(String name) {
        return this.name = name;
    }

    public int getage(int age) {
        System.out.println("Enter Your Age");
        int age1 = input.nextInt();
        return age1;
    }

    public int setage(int age) {
        return this.age = age;
    }

    public int getid(int Nationalid) {
        System.out.println("Enter Your National ID ");
        int num1 = input.nextInt();
        return num1;
    }

    public int setid(int Nationalid) {
        return this.Nationalid = Nationalid;
    }

    public String getcheckin(String checkindate) {
        System.out.println("Enter CheckIn Date ");
        String date1 = input.nextLine();
        return date1;
    }

    public String setcheckin(String checkindate) {
        return this.checkindate = checkindate;
    }

    public int getcheckout(int checkoutdate) {
        return checkoutdate;
    }

    public int setcheckout(int checkindate) {
        return this.checkoutdate = checkoutdate;
    }

    public int getroomnum(int roomnum) {
        System.out.println("Which Room Would You Like To Select ?");
        System.out.println("***************************************");
        Rooms roomtype1 = new Rooms("Deluxe Room ", 111, 150);
        System.out.println(" 1) Deluxe Room");
        roomtype1.getRoomDetails1();
        System.out.println("***************************************");
        Rooms roomtype2 = new Rooms("Deluxe Room ", 222, 150);
        System.out.println(" 2) Honeymoon - Package");
        roomtype2.getRoomDetails2();
        System.out.println("***************************************");
        Rooms roomtype3 = new Rooms(" Family Suite (2 Adults) ", 333, 150);
        System.out.println(" 3) Family Suite (2 Adults)");
        roomtype3.getRoomDetails3();
        System.out.println("***************************************");
        
        Rooms roomtype4 = new Rooms("Junior Family Suite (2 Adults) ", 444, 150);
        System.out.println(" 4)Junior Family Suite (2 Adults)");
        roomtype4.getRoomDetails4();
        System.out.println("***************************************");
        Rooms roomtype5 = new Rooms(" Aqua Suite ", 555, 150);
        System.out.println(" 5)Aqua Suite");
        roomtype5.getRoomDetails5();
        System.out.println("***************************************");
        Rooms roomtype6 = new Rooms(" Deluxe Triple Room ", 666, 150);
        System.out.println(" 6)Deluxe Triple Room");
        roomtype6.getRoomDetails6();
        System.out.println("***************************************");
        System.out.println("Please Enter Your Select Number");
        int y = input.nextInt();

        if (y == 1)
        {
            roomtype1.getRoomDetails1();
        }
        else if (y == 2) 
        {
            roomtype2.getRoomDetails2();
        }
         else if (y == 3) 
        {
            roomtype3.getRoomDetails3();
        }
         else if (y == 4) 
        {
            roomtype4.getRoomDetails4();
        }
         else if (y == 5) 
        {
            roomtype5.getRoomDetails5();
        }
         else if (y == 6) 
        {
            roomtype6.getRoomDetails6();
        }
        return 0;

    }

    public int setroomnum(int roomnum) {
        return this.roomnum = roomnum;
    }

    public String getroomtype(String roomtype) {
        return roomtype;
    }

    public String setroomtype(String roomtype) {
        return this.roomtype = roomtype;
    }

    public double getdeposit(double deposit) {
        return deposit;
    }

    public double setdeposit(double deposit) {
        return this.deposit = deposit;
    }

    public String getCheckNationality() {
        System.out.println("Please Enter Your Nationality");
        String x = input.nextLine();
        return x;
    }

    public void setCheckNationality(String CheckNationality) {
        this.CheckNationality = CheckNationality;
    }

    public boolean isCheckroom() {
        return checkroom;
    }

    public void setCheckroom(boolean checkroom) {
        this.checkroom = checkroom;
    }
}
