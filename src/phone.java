package OopsFeatures;

public class phone {
    private String make;
    private String model;
    private int  storage;

    public phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    public int getStorage() {
        return storage;
    }
    public int priceCalculate()
    {
        int makeprice = 0;
        int modelprice = 0;
        int storagrprice = storage * 2 ;
        switch(make.toLowerCase())
        {
            case "apple":
                makeprice = 10000;
                break;
            case "samsung":
                makeprice = 7000;
                break;
            case "nokia" :
                makeprice = 5000;
                break;
            default:
                makeprice= 3000;
                break;
        }
        if(model.toLowerCase().contains("pro"))
        {
            modelprice = 500;
        } else if (model.toLowerCase().contains("plus")) {
            modelprice = 400;
        } else if (model.toLowerCase().contains("5g")) {
            modelprice = 300;
        }
        else
        {
            modelprice = 200;
        }

        return makeprice + modelprice + storagrprice;
    }
    public void print()
    {
        System.out.println("Make : "+make);
        System.out.println("Model : "+model);
        System.out.println("storage : " + storage);
        System.out.println("price :" + priceCalculate());
    }
    public static void main(String args[])
    {
       phone phone1 = new phone("nokia","pro",8);
       phone1.print();
    }
}
