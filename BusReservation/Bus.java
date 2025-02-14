
//Class for Bus
public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    //constructors
    public Bus(int no,boolean ac,int capacity){
        this.busNo=no;
        this.ac=ac;
        this.capacity=capacity;
    }
    //getter and setter methods;
    public int getBusno(){
        return busNo;
    }
    public void setBudno(int busNo){
        this.busNo=busNo;
    }

    public boolean getAc(){
        return ac;
    }
    public void setAc(boolean ac){
        this.ac=ac;
    }

    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
}
