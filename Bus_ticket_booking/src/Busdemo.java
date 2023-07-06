import java.util.ArrayList;
import java.util.Scanner;

public class Busdemo {
    public static void main(String[] args) {
        ArrayList<Bus>Buses=new ArrayList<Bus>();
        ArrayList<Booking>bookings=new ArrayList<Booking>();

        Buses.add(new Bus(1,true,2));
        Buses.add(new Bus(2,false,45));
        Buses.add(new Bus(3,true,35));

        boolean loop=true;
        Scanner in=new Scanner(System.in);

        for(Bus b  : Buses){
            b.displaybusinfo();
        }
        while (loop) {
            System.out.println("Enter 1 to book and 2 to exit");
            int option= in.nextInt();
            if(option==1){
               Booking booking = new Booking();
               if(booking.isAvailable(bookings,Buses)){
                   bookings.add(booking);
                   System.out.println("Your booking is confirmed  ");
               }
               else{
                   System.out.println("Booking is full change the bus or date ");
               }
            }
            else loop=false;
        }
    }
}
