package OopsFeatures;

public class Furniture {
    private String types ;
    private  String material;
    private  int price;
    public Furniture(String types,String material , int price)
    {
        this.types= types;
        this.material= material;
        this.price=price;
    }
    public String getTypes(){
        return types;
    }
    public String getMaterial()
    {
        return material;
    }
    public int getPrice()
    {
        return  price;
    }
    public int discount=0;
    public int calculate()
    {
        switch ((material.toLowerCase())){
            case "cotton":
                discount= 400;
                break;
            case "linen":
                discount = 300;
                break;
            case "wool":
                discount= 800;
                break;
            case "velvet" :
                discount = 1000;
                break;
            default:
                discount= 200;
        }
        return  price - discount ;
    }
    public void print()
    {
        System.out.println("types: "+ types);
        System.out.println(("material : "+ material));
        System.out.println("price :" + price);
        System.out.println("Discounted price: "+ calculate());
    }
    public static  void main(String args[])
    {
        Furniture furniture1 = new Furniture("table","velvet", 35000);
        furniture1.print();

    }
}
