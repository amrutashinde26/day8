package OopsFeatures;

public class Computer {
    private String processor ;
    private String RAM;
    private int storage ;
    public Computer(String processor,String RAM,int storage)
    {
        this.processor = processor;
        this.RAM = RAM;
        this.storage=storage;
    }
    public String getProcessor()
    {
        return processor ;
    }
    public String getRAM()
    {
        return RAM;
    }
    public int getStorage()
    {
        return storage;
    }
    /*int discountedprice = 0 ;*/
    public int calculate()
    {
        int baseprice = 4000;
        int discountedprice = 0 ;
        int processorprice= 0;
        int ramprice = 0;
        int storageprice= storage * 2 ;
        switch (processor)
        {
            case "gtxxd345":
                processorprice = 500;
                break;
            case "jft546":
                processorprice =550;
                break;
            case "er45h6":
                processorprice= 600;
                break;
            case "dvf431":
                processorprice = 700;
                break;
        }
        if(getRAM().contains("8GB"))
        {
            ramprice = 500;
        } else if (getRAM().contains("16GB"))
        {
            ramprice = 600;
        } else if (RAM.contains("32GB"))
        {
            ramprice = 700;

        }
        else
        {
            ramprice = 300;
        }
        discountedprice =baseprice + processorprice + ramprice + storageprice;
        return discountedprice;

    }
    public void print()
    {
        System.out.println("processor : "+ processor);
        System.out.println("RAM : " + RAM);
        System.out.println("Storage: "+ storage);
        System.out.println("price : "+ calculate());
    }
    public static void main(String args[])
    {
        Computer computer1 = new Computer("jft546","16GB",5);
        computer1.print();
    }
}
