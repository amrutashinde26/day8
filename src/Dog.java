package OopsFeatures;

public class Dog {
    private String breed ;
    private  int age ;
    private  int weight ;
    public static void main(String args[])
    {
        Dog dog1 = new Dog("labrod",3,10);
        dog1.print();
    }

    public Dog(String breed,int age,int weight)
    {
        this.breed = breed;
        this.age = age ;
        this.weight = weight ;
    }
    public String getBreed()
    {
        return breed;
    }
    public int getAge()
    {
        return age ;
    }
    public int getWeight()
    {
        return weight;
    }
    public int calculateAge()
    {
        return  age * 7 ;
    }
    public void print()
    {
        System.out.println("breed : " + breed);
        System.out.println(("Age : "+ age));
        System.out.println("Wight : "+ weight);
        System.out.println("The Human Age Is :" + calculateAge());
    }
}
