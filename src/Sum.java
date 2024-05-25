package Day_8;

public class Sum {
    public static void main(String args[]){
        Sum sumof = new Sum();
       System.out.println(sumof.addition(20,20,30));
    }
    public int addition(int a , int b){
        int c= a + b ;
        return c ;
    }
    public int addition(int a, int b, int c){
        int d = a + b+ c;
        return d;
    }
    public int addition(int a, int b, int c , int d, int e){
        int f = a + c+ b + d + e;
        return f ;
    }
}
