/*WAP to accept name, gender, address, phy, chem, bio marks
   tot per
   print name,address, gender, tot, per*/
import java.util.*;
class scannnn
{
    public static void main ()
    {
        String name,address;
        int phy, chem, bio;
        double tot, per;
        char g;
        Scanner tb = new Scanner (System.in);
        System.out.println("Enter Name");
        name = tb.nextLine();
        System.out.println ("Enter Address");
        address = tb.nextLine();
        System.out.println ("Enter Gender");
        g= tb.next().charAt(0);
        System.out.println ("Enter Physics Marks out of 100");
        phy = tb.nextInt ();
        System.out.println ("Enter Chemistry Marks out of 100");
        chem = tb.nextInt ();
        System.out.println ("Enter Biology Marks out of 100");
        bio = tb.nextInt ();
        tot = phy+chem+bio;
        per = (tot/300)*100;
        System.out.println("Name is "+name);
        System.out.println("Address is "+address);
        System.out.println("Gender is "+g);
        System.out.println("Your Physics marks are "+phy);
        System.out.println("Your Chemistry marks are "+chem);
        System.out.println("Your Biology marks are "+bio);
        System.out.println("Your Total marks are "+tot);
        System.out.println("Your Total Percentage is "+per);
    }
}