package Day_8;

public class ObjCount {
    public static  void main (String args[]){
        ObjCount obj1 = new ObjCount();
        ObjCount obj2 = new ObjCount();
        ObjCount obj3 = new ObjCount();
        System.out.println("The Number of Object is created is "+ ObjCount.getObjectCount());
    }
    public static int ObjCounter = 0 ;
    public  ObjCount(){
        ObjCounter++;
    }
    public static int getObjectCount()
    {
        return ObjCounter;
    }
}
