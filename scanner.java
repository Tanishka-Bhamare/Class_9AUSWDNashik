import java.util.*;
class scanner
{
    public static void main ()
    {
        double per,tot;
        Scanner tb=new Scanner (System.in);
        System.out.println("Enter Physics marks out of 100");
        int Phy=tb.nextInt();
        System.out.println("Enter Chemistry marksout of 100");
        int Chem=tb.nextInt();
        System.out.println("Enter Biology marksout of 100");
        int Bio=tb.nextInt();
        tot=Phy+Chem+Bio;
        per=(tot/300)*100;
        System.out.println("Total is "+tot);
        System.out.println("Percentage is "+per);
    }
}