import java.util.*;
class grade
{
    public static void main()
    {
        int phy,chem,maths,bio,comp,grade,rn;
        double tot,per;
        String name;
        char div;
        Scanner tb =  new Scanner (System.in);
        System.out.println ("Enter Name");
        name = tb.nextLine ();
        System.out.println ("Enter Grade");
        grade = tb.nextInt ();
        System.out.println ("Enter Division");
        div = tb.next().charAt (0);
        System.out.println ("Enter Roll Number");
        rn = tb.nextInt ();
        System.out.println ("Enter Physics Marks");
        phy = tb.nextInt ();
        System.out.println ("Enter Chemistry Marks");
        chem = tb.nextInt ();
        System.out.println ("Enter Biology Marks");
        bio = tb.nextInt ();
        System.out.println ("Enter Maths Marks");
        maths = tb.nextInt ();
        System.out.println ("Enter Computer Marks");
        comp = tb.nextInt ();
        tot=phy+chem+bio+maths+comp;
        per=(tot/500)*100;
        System.out.println ("Name:"+name);
        System.out.println ("Class:"+grade);
        System.out.println ("Division:"+div);
        System.out.println ("Roll Number:"+rn);
        System.out.println ("Physics marks:"+phy);
        System.out.println ("Chemistry marks:"+chem);
        System.out.println ("Biology marks:"+bio);
        System.out.println ("Maths marks:"+maths);
        System.out.println ("Computer marks:"+comp);
        System.out.println ("Total:"+tot);
        System.out.println ("Percentage:"+per);
        if (per>=90)
        System.out.println("Your Grade is: A");
        if (per>=70 && per<90)
        System.out.println("Your Grade is: B");
        if (per>=50 && per<70)
        System.out.println("Your Grade is: C");
        if (per>=40 && per<50)
        System.out.println("Your Grade is: D");
        if (per<40)
        System.out.println("Your Grade is: F");
    }
}