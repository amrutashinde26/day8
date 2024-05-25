package Day_8;

import java.util.Scanner;

public class Cuboid {
    int length;
    int breadth;
    int height;

    public Cuboid(int length, int breadth, int height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int volume()
    {
        int result1 = length * breadth * height;
        area();
        System.out.println("Volume : " + result1);
        return result1;
    }
    public int area(){
        int result2 = 2 * (length * breadth + breadth * height + height* length);
        perimeter();
        System.out.println("Area : " + result2);
        return result2 ;
    }
    public int perimeter()
    {
        int result3 = 2* (length + breadth + height);
        System.out.println("Perimeter : "+ result3);
        return result3;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  length of the cuboid ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the cuboid ");
        int breadth = sc.nextInt();
        System.out.println("Enter the height of the cuboid ");
        int height = sc.nextInt();
        Cuboid Cuboid1 = new Cuboid(length, breadth, height);
        Cuboid1.volume();
    }

}