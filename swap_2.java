//WAP to swap two numbers without using third variable
import java.util.*;
class swap_2
{
    public static void main ()
    {
        int n1,n2;
        Scanner tb= new Scanner (System.in);
        System.out.println ("Enter num 1");
        n1=tb.nextInt();
        System.out.println ("Enter num 2");
        n2=tb.nextInt();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println ("Value of n1 after swaping is "+n1);
        System.out.println ("Value of n2 after swaping is "+n2);
    }
}