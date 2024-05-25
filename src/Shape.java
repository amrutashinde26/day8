package Day_8;

import java.util.Scanner;

public class Shape {
    int length;
    int breadth;
    int height;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length And Breadth of the rectangle");
        int reclength = sc.nextInt();
        int recbreadth = sc.nextInt();

        System.out.println("Enter The Length And height of the Triangle");
        int trilength = sc.nextInt();
        int triheight = sc.nextInt();

        Shape rectangle = new Shape(reclength, recbreadth);
        Shape triangle = new Shape(trilength, triheight,true);
        Shape outerof = new Shape();
        Caluculate areaof = outerof.new Caluculate();
        Shape recarea = areaof.isrectangle(rectangle);
        Shape triarea = areaof.istriangle(triangle);
        System.out.println("Area Of Triangle is : "+ recarea.length);
        System.out.println("Area Of Triangle is : "+ triarea.length);
    }
    // constructor for rectangle
    Shape(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    // constuctor for triangle
    Shape(int length, int height ,boolean istriangle) {
        this.length = length;
        this.height = height;
    }

    Shape() {

    }

  public   class Caluculate {
        public Shape isrectangle(Shape Rectangle) {
            int area = Rectangle.length * Rectangle.breadth;
            Shape result = new Shape();
            result.length = area;
            return result;
        }

        public Shape istriangle(Shape triangle) {
            double area = 0.5 * triangle.length * triangle.height;
            Shape result = new Shape();
            result.length =(int) area;
            return result;
        }
       /* public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Length And Breadth of the rectangle");
            int reclength = sc.nextInt();
            int recbreadth = sc.nextInt();

            System.out.println("Enter The Length And height of the Triangle");
            int trilength = sc.nextInt();
            int triheight = sc.nextInt();

            Shape rectangle = new Shape(reclength, recbreadth);
            Shape triangle = new Shape(trilength, triheight,true);
            Shape outerof = new Shape();
            Caluculate areaof = outerof.new Caluculate();
            Shape recarea = areaof.isrectangle(rectangle);
            Shape triarea = areaof.istriangle(triangle);
            System.out.println("Area Of Triangle is : "+ recarea);
            System.out.println("Area Of Triangle is : "+ triarea);*/
        }
    }





