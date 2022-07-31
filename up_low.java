import java.util.*;
class up_low
{
    public static void main ()
    {
        Scanner tb = new Scanner (System.in);
        System.out.println ("Enter a letter");
        char a=tb.next().charAt (0);
        if (a>='A' && a<='Z')
        System.out.println ("It's Upper case");
        else
        System.out.println ("It's Lower case");
    }
}