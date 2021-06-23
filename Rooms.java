/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.resevation;

/**
 *
 * @author Hagar
 */
public class Rooms extends Guest {

    private String RoomDetails1 = " ";
    private String RoomDetails2 = " ";
    private String RoomDetails3 = " ";
    private String RoomDetails4 = " ";
    private String RoomDetails5 = " ";
    private String RoomDetails6 = " ";
    
    private String roomName1 ="Junior Family Suite (2 Adults)";
    private int roomID1 = 444;
    private int Price1 = 150;
    
    private String roomName2 ="Deluxe Triple Room";
    private int roomID2 = 666;
    private int Price2 = 150;
    
    private String roomName3 ="Aqua Suite";
    private int roomID3 = 555;
    private int Price3 = 150;
    
    private String roomName4 ="Family Suite (2 Adults)";
    private int roomID4 = 333;
    private int Price4 = 150;
    
    private String roomName5 ="Honeymoon - Package";
    private int roomID5 = 222;
    private int Price5 = 150;
    
    private String roomName6 = "Deluxe Room";
    private int roomID6 = 111;
    private int Price6 = 150;
    
    public Rooms (String roomName1 , int roomID1 , int Price1)
    {
        this.roomID1=roomID1;
        this.roomName1=roomName1;
        this.Price1=Price1;
    }
    public Rooms ( int roomID2, String roomName2, int Price2)
    {
        this.roomID2=roomID2;
        this.roomName2=roomName2;
        this.Price2=Price2;
    }
    public Rooms ( int roomID3,int Price3,String roomName3)
    {
        this.roomID3=roomID3;
        this.roomName3=roomName3;
        this.Price3=Price3;
    }
    public void Rooms ( int roomID4,int Price4,String roomName4)
    {
        this.roomID4=roomID4;
        this.roomName4=roomName4;
        this.Price4=Price4;
    }
    public void Rooms1 ( int roomID5,int Price5,String roomName5)
    {
        this.roomID5=roomID5;
        this.roomName5=roomName5;
        this.Price5=Price5;
    }
    public void Rooms2 ( int roomID6,int Price6,String roomName6)
    {
        this.roomID6=roomID6;
        this.roomName6=roomName6;
        this.Price6=Price6;
    }
  
    
    public String getRoomDetails1() {
        System.out.println("1 king bed  and 2 sofa beds ");
        System.out.println(" Pool And Garden Veiw");
        System.out.print(" Price : 150 ");
        return RoomDetails1;
    }

    public String getRoomDetails2() {
        System.out.println(" 1 twin bed  and 1 king bed ");
        System.out.println(" Garden view Pool view ");
        System.out.print(" Price : 150 ");
        return RoomDetails2;
    }

    public String getRoomDetails3() {
        System.out.println("2 twin beds  and 1 queen bed");
        System.out.println("Garden view , Pool view  , City view");
        System.out.print(" Price : 150 ");
        return RoomDetails3;
    }

    public String getRoomDetails4() {
        System.out.println(" 2 twin beds  and 1 king bed ");
        System.out.println(" Garden View ");
        System.out.print(" Price : 150 ");
        return RoomDetails4;
    }

    public String getRoomDetails5() {
        System.out.println(" 1 King Bed ");
        System.out.println(" Sea View ");
        System.out.print(" Price : 150 ");
        return RoomDetails5;
    }

    public String getRoomDetails6() {
        System.out.println(" 1 King Bed ");
        System.out.println(" 2 Twins Bed");
        System.out.println(" Pool view ");
        System.out.print(" Price : 150 ");

        return RoomDetails6;
    }

}
