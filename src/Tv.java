package OopsFeatures;

public class Tv
{
private  String brand;
private  int size;
private int price ;
public Tv(String brand,int size,int price)
{
    this.brand = brand ;
    this.size = size ;
    this.price = price;
}
public  String getBrand()
{
    return  brand;
}
public int getSize()
{
    return size;
}
public int getPrice()
{
    return price;
}
int discounted=0 ;
public int calculatePrice()
{
    int discount = 0;
    switch (size) {
        case 2:
            discount = 200;
            break;
        case 3:
            discount = 300;
            break;
        case 4:
            discount = 400;
            break;
    }
discounted = price - discount ;
return discounted ;
    }
    public void print()
    {
        System.out.println("Brand :" + brand);
        System.out.println("size : "+ size);
        System.out.println("Discounted price is :"+ calculatePrice());
    }
    public static  void main(String args[])
    {
        Tv tv1 = new Tv("Samsung",3,5000);
        tv1.print();
    }
}


