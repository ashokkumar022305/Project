import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passangername;
    int busno;
    Date date;
    Booking(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name : ");
        passangername=in.next();
        System.out.println("Enter the Busno : ");
        busno=in.nextInt();
        System.out.println("Enter the Date  : ");
        String inputdate=in.next();
        SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy");
        try {
            date=dateformat.parse(inputdate);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses){
        int capacity = 0;
        for (Bus bus:buses ){
            if(bus.getBusno()==busno){
                capacity=bus.getCapacity();
            }
        }
        int booked=0;
        for (Booking b:bookings){
            if(b.busno==busno&&b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity;
    }

}
