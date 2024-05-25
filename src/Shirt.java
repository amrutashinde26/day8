package OopsFeatures;

public class Shirt {
    private String size;
    private String color;
    private int price;
    public  Shirt(String size , String color, int price )
    {
        this.size = size ;
        this.color = color ;
        this.price = price ;
    }

    public String getSize()
    {
        return size;
    }

    public String getColor()
    {
        return color;
    }

    public int setPrice()
    {
        return price ;
    }
    /*int discount = 0 ;*/
    public int calculate()
    {
        int discount = 0 ;
        switch (size.toUpperCase())
        {
            case "XS":
                discount = 100;
                break;
            case "L":
                discount = 200;
                break;
            case "M":
                discount = 150;
                break;
            default:
                discount = 0;
        }
            return  price - discount;
        }
    public void print()
    {
        System.out.println("size: "+ color);
        System.out.println("color : "+ color);
        System.out.println("price : "+price);
        System.out.println("Discounted price is :"+ calculate());
    }

    public static  void main(String args[])
    {
        Shirt shirt1 = new Shirt("xs","blue",1000);
        shirt1.print();

    }
}
