//WAP to swap two numbers using third variable (input using scanner)
import java.util.*;
class swap
{
    public static void main ()
    {
        int a,b,c;      
        Scanner tb = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        a=tb.nextInt();
        System.out.println("Enter 2nd Number");
        b=tb.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println ("Value of 1st Number after swapping is"+a);
        System.out.println ("Value of 2st Number after swapping is"+b);
        
    }
}