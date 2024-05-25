package OopsFeatures;

public class Student {
    private  String  name;
    private String age;
    private int Id;

    public static void main(String args[])
    {
        Student result = new Student("Naveen","25",123);
        result.print();
    }
    public Student(String name,String age , int Id){
        this.name = name;
        this.age = age ;
        this.Id = Id ;
    }
    public String  getName()
    {
            return name ;
    }
    public String getAge()
    {
        return age;
    }
    public  int getId()
    {
        return Id ;
    }

    public  void print()
    {
        System.out.println("The Name Is :" + name);
        System.out.println("The Age Is : "+ age);
    }
    /*public static void main(String args[]);
    {
         Student result = new Student("Naveen","25",123);
         result.print();
    }*/
}
