/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.resevation;
import java.util.Scanner;
/**
 *
 * @author Hope
 */
public class additionalservice extends checkin
{ 
    Scanner s=new Scanner(System.in);
    public String Gym;
    public String Spa;
    public String Safari;
    public String Transportations;
    public String Breakfast;
    public String Dinner;
    public int price;
    
        
 public void Gym()
 {
    
     int ch;
     int tot1=0,tot2=0,tot3=0,tot4=0;
     System.out.println("your choice is gym");
      System.out.println("gym price=");
      int gymp=500;
      System.out.println(gymp);
     System.out.println("Some additional services if needed");
     System.out.println("press 1 , for transportations");
     System.out.println("press 2 , for breakfast ");
     System.out.println("press 3 , for dinner");
     System.out.println("press 4 , for user");
     ch=s.nextInt();
     
     if(ch==1)
     {
         System.out.print("any transportations=");
         int x=300;
       System.out.println(x);
         tot1=gymp+x;
       System.out.println("Gym+trasportation="+tot1);
        checkin b = new checkin();
         b.currency();
     }
       if(ch==2)
     {
      System.out.print("breakfast price=");
       int z=100;
       
      System.out.println(z);
       tot2=z+gymp;
       System.out.println("Gym+breakfast="+tot2);
       checkin a = new checkin();
       a.currency();
     }
     if(ch==3)
     {
      System.out.print("dinner price=");
       int f=50;
       
      System.out.println(f);
       tot3=f+gymp;
       System.out.println("Gym+dinner="+tot3);
        checkin c = new checkin();
       c.currency();
     }
     if(ch ==4)
     {
     tot4=gymp;
     
       System.out.println("Gym="+tot4);
        checkin n = new checkin();
       n.currency();
     
     }
     
 }
 
 public void Spa(){
     Scanner ss=new Scanner(System.in);
     int px,cs;
     int total1=0,total2=0,total3=0,total4=0;
     System.out.println("your choice is spa");
      System.out.println("spaprice");
       int spap=1000;
      System.out.println(spap);
     System.out.println("Some additional services if needed");  
     System.out.println("press 1 , for transportations");
     System.out.println("press 2 , for breakfast ");
     System.out.println("press 3 , for dinner");
     System.out.println("press 4 , for existing");
     cs=ss.nextInt();
     
     
     if(cs==1)
     {
      System.out.print("price of transportation");
      int ppx=250;
      
      System.out.println(ppx);
       total1=ppx+spap+150;
       System.out.println("Spa+trasportation="+total1);
        checkin m = new checkin();
       m.currency();
     }
       if(cs==2)
     {
      System.out.print("please enter the price of breakfast");
       int ppy=130;
       
      System.out.println(ppy);
       total2=ppy+spap+150;
       System.out.println("Spa+breakfast="+total2);
        checkin l = new checkin();
       l.currency();
     }
     if(cs==3)
     {
      System.out.print(" price of dinner");
       int ppz=80;
       
      System.out.println(ppz);
       total3=ppz+spap+150;
       System.out.println("spa+dinner="+total3);
        checkin p = new checkin();
       p.currency();
     }
     if(cs ==4)
     {
     total4=spap+150;
     
       System.out.println("spa="+total4);
        checkin o = new checkin();
       o.currency();
     
     }
 }
 public void Safari(){
     Scanner sz=new Scanner(System.in);
     int cc;
     int Total1=0,Total2=0,Total3=0,Total4=0,Total5=0;
     System.out.println("your choice is safarii");
      System.out.println("safari price=");
      int sfp=2500;
     System.out.println(sfp);
     System.out.println("Some additional services if needed");  
     System.out.println("press 1 , for glassboat");
     System.out.println("press 2 , for transportations");
     System.out.println("press 3 , for breakfast ");
     System.out.println("press 4 , for dinner");
     System.out.println("press 5 , for existing");
     cc=sz.nextInt();

     if(cc==1)
     {
      System.out.print(" price of glassboat");
       int pp=350;
       
      System.out.println(pp);
       Total1=pp+sfp+150;
       System.out.println("Safari+glassboat="+Total1);
        checkin u = new checkin();
       u.currency();
     }
       if(cc==2)
     {
      System.out.print(" price of transportations");
       int pp1=200;
       
      System.out.println(pp1);
       Total2=pp1+sfp+150;
       System.out.println("Safari+transportations="+Total2);
        checkin y = new checkin();
       y.currency();
     }
     if(cc==3)
     {
      System.out.print(" price of breakfast");
       int pp2=100;
       
      System.out.println(pp2);
       Total3=pp2+sfp+150;
       System.out.println("Safari+breakfast="+Total3);
        checkin e = new checkin();
       e.currency();
     }
     
     if(cc==4)
     {
      System.out.print(" price of dinner");
       int pp3=40;
       
      System.out.println(pp3);
       Total4=pp3+sfp+150;
       System.out.println("Safari+dinner="+Total4);
        checkin q = new checkin();
       q.currency();
     }
     
     
     if(cc ==5)
     {
     Total5=sfp+150;
     
       System.out.println("Safari="+Total5);
        checkin f = new checkin();
       f.currency();
     
     }
   }

}
