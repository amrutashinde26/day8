package Day_8;

import java.util.Scanner;

public class AreaFind {
    public static void main(String args[])
    {
       AreaFind result = new AreaFind();
       double squareArea = result.Findarea(10);
       System.out.println("Area Of Square is : " + squareArea);
       double rectanglearea = result.Findarea(10,20);
       System.out.println(("Area Of Rectangle is : " + rectanglearea));
       double circlearea = result.Findarea(20,true);
       System.out.println("Area Of Circle Is : " + circlearea);
    }

    // find the area of square
    public static Double Findarea(double square) {
        return square * square;
    }

    //find the area of rectangle
    public static double Findarea(double length, double width) {
        return length * width;
    }

    //find the area of circle
    public static double Findarea(double radius, boolean isradius) {
        if (isradius) {
            return Math.PI * radius* radius;
        } else {
            return 0;
        }
    }
}
