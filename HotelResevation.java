/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.resevation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;



public class HotelResevation {
    
    

    public static void main(String[] args) throws ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        Guest g1 = new Guest();
        g1.setid(100);
        g1.setname("guest");
        try (final FileOutputStream fout = new FileOutputStream("hotelreservationsystem.txt");
                final ObjectOutputStream out = new ObjectOutputStream(fout)) {
            out.writeObject(g1);
            out.flush();
            System.out.println("success");
            FileInputStream fin = new FileInputStream("hotelreservationsystem.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Guest guest = (Guest) in.readObject();
            System.out.println(guest);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String username, password;
        System.out.print("Enter username:");
        username = input.nextLine();
        System.out.print("Enter password:");
        password = input.nextLine();
        if (username.equals("user") && password.equals("user")) {
            System.out.println(" Welcome to the Hotel Reservation ");
        } else {
            System.out.println(" Failed ");
        }

        System.out.println(" **** Welocime to our Hotel ****   ");
        System.out.println(" **** Please Select Number ****    ");
        System.out.println("        1)Enter Your Information   ");
        System.out.println("        2) Choose Room Type        ");
        System.out.println("   3) For Extra Additional Service ");
        System.out.println("   ****************************    ");
        System.out.println("   Please Enter Your Select Number ");
        Guest guest = new Guest();
        checkin in = new checkin();
        //checkout out = new checkout();
        additionalservice guest1 = new additionalservice();
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Enter Your Information");
                guest.getCheckNationality();
                guest.getname(" ");
                guest.getNumber();
                guest.getage(0);
                guest.getid(0);

            case 2:
                
                 
                guest.getroomnum(0);
                in.BookARoom(number);
                
                //System.out.println("Check if the room is empty or no");
                //checkin x = new checkin();
                //x.currency();

            case 3:

                System.out.println("  EXTRA ADDITIONAL SERVICE");
                System.out.println("****************************");
                System.out.println(" 1) Gym");
                System.out.println(" 2) Spa ");
                System.out.println(" 3) Safari");
                System.out.println("Please Enter Your Select Number");
                int number1 = input.nextInt();
                if (number1 == 1) {
                    guest1.Gym();
                } else if (number1 == 2) {
                    guest1.Spa();
                } else if (number1 == 3) {
                    guest1.Safari();
                }
                break;
            default:
              
        }
              System.exit(0);
    }

}
