package OopsFeatures;

public class Employee {
    private String Name;
    private int Salary;
    private int Id;

    public static void main(String args[])
    {
        Employee employee1 = new Employee("Amruta",30000,148);
        employee1.annualsal();
        employee1.print();
    }
public Employee(String Name , int Salary,int Id)
{
    this.Name = Name;
    this.Salary = Salary;
    this.Id = Id ;
}
    public String getName()
    {
        return Name;
    }

    public int getSalary()
    {
        return Salary;
    }

    public int getId() {
        return Id;
    }

    public void annualsal() {
        int sal = 12 * Salary;
        System.out.println("The yearly Salary is : " + sal);
    }

    public void print() {
        System.out.println("Employee Name Is :" + Name);
        System.out.println("Employee Salary is :" + Salary);
    }

}