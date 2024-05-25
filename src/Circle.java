package OopsFeatures;

public class Circle {
    private int radius;

    public static void main(String args[])
    {
        Circle circle1 = new Circle(5);
        System.out.println("Area of circle is : " + circle1.area());
        System.out.println("Circumference of circle is : "+ circle1.circumstance());
    }
    public Circle(int radius)
    {
        this.radius=radius;
    }

    private double area() {
        double result = Math.PI * radius * radius;
        return result;
    }
    private double circumstance()
    {
        double result = 2 * Math.PI * radius ;
              return result;
    }
}