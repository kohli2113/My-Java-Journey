public class Employee {
//    Scenario: You are working on an application that manages employee information. You need a Employee class with name, age, and salary as private attributes. You should provide public methods to access and modify these attributes while keeping them secure.
//
//Implementation:
//
//How would you implement getter and setter methods for salary and ensure that no one can set a negative salary?
//
//
    private String name;
    private  int age;
    private int salary;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(int salary){
        if (salary>0){
            this.salary=salary;
        }
    }

    public static void main(String[] args) {

    }
}
