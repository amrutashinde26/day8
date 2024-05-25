package Day_8;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first byte value" );
        byte firstvalue = sc.nextByte();
        System.out.println("Enter the second byte value ");
        byte secondvalue = sc.nextByte();

        int first =(int) firstvalue;
        int second = (int) secondvalue ;

        int sum = first + second ;
        System.out.println(sum);

    }
}
