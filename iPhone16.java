class iPhone
{
    public void call()
    {
        System.out.println("iPhone call executed");
    }
}
public class iPhone16 extends iPhone
{
    public static void main(String args[])
    {
        iPhone16 p=new iPhone16();
        p.call();
    }
}