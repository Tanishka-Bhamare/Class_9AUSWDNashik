import java.util.*;
class Myself
{
    public static void main ()
    {
       Scanner tb = new Scanner (System.in);
       System.out.println("Enter Name");
       String name=tb.nextLine();
       System.out.println("Enter Gender");
       String gender=tb.nextLine();
       System.out.println("Enter Age");
       int age=tb.nextInt();
       System.out.println("Myself "+name);
       System.out.println("My age is "+age);
       System.out.println("I am a "+gender);
    }
}