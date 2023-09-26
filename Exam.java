package onlineExam; 

 

public class Exam { 

    private int rigisterNo; 

    private boolean exam; 

    private int capacity; //get and set 

 

    Exam(int rigno,boolean exam,int examcapacity){ 

        this.rigisterNo = rigno; 

        this.exam = exam; 

        this. capacity = examcapacity; 

   } 

   public int getrigisterNo(){ //accessors 

        return rigisterNo;   

    } 

    public boolean isExam(){ 

        return exam; 

    } 

    public int getCapacity() {  //accessor method 

        return capacity; 

    } 

    public void setExam(boolean val){  //mutator 

        exam = val; 

    } 

    public void setCapacity(int examcapacity){ //mutator 

        capacity = examcapacity; 

    } 

 

    } 