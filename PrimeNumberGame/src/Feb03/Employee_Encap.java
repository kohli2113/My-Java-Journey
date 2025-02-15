package PrimeNumberGame.src.Feb03;
//Create an PrimeNumberGame.src.Jan31.Employee class with private fields and provide getter and setter methods to implement encapsulation.
public class Employee_Encap {
    private String name;
    private String position;
    private double salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee_Encap e=new Employee_Encap();
        e.setName("VK");
        System.out.println("Name is:"+e.getName());
    }
}

