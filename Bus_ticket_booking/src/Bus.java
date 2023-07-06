public class Bus {
   private int busno;
   private boolean ac;
   private int capacity;

    Bus(int busno, boolean ac, int capacity) {
        this.busno = busno;
        this.ac=ac;
        this.capacity=capacity;
    }
    public int getBusno(){
        return busno;
    }
    public boolean isac(){
        return ac;
    }
    public void setAc(boolean val){
        ac=val;
    }
   public int getCapacity(){
        return capacity;
   }
    public void setCapacity(int cap){
        capacity=cap;
    }
    public void displaybusinfo(){
        System.out.println("Bus no : "+ busno + "\n AC : "+ac + "\nBus Capacity :" + capacity );
    }
}
