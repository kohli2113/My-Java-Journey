class Demo
{
    int x=44;
    Demo()  //default constructor
    {
        System.out.println("Const executed");
    }
    Demo(int x)  //Parameterized constructor
    {
        System.out.println("Const2 executed "+x+" "+this.x);
    }
    public static void main(String args[])
    {
        Demo d=new Demo();
        System.out.println(d.x);
        Demo d1=new Demo(45);
    }
}