import java.util.*;
class Exam_marks
{
    public static void main()
    {
        int phy,chem,bio,maths,eng1,eng2,frn,comp,hist,geog;
        double tot, per;
        Scanner tb= new Scanner (System.in);
        System.out.println ("Enter Physics Marks out of 80");
        phy=tb.nextInt();
        System.out.println ("Enter Chemistry Marks out of 80");
        chem=tb.nextInt();
        System.out.println ("Enter Biology Marks out of 80");
        bio=tb.nextInt();
        System.out.println ("Enter Maths Marks out of 80");
        maths=tb.nextInt();
        System.out.println ("Enter English-1 Marks out of 80");
        eng1=tb.nextInt();
        System.out.println ("Enter English-2 Marks out of 80");
        eng2=tb.nextInt();
        System.out.println ("Enter French Marks out of 80");
        frn=tb.nextInt();
        System.out.println ("Enter Computer Marks out of 80");
        comp=tb.nextInt();
        System.out.println ("Enter History Marks out of 80");
        hist=tb.nextInt();
        System.out.println ("Enter Geography Marks out of 80");
        geog=tb.nextInt();
        tot=phy+chem+bio+maths+eng1+eng2+frn+comp+hist+geog;
        per=(tot/800)*100;
        System.out.println("Physics marks: "+phy);
        System.out.println("Chemistry marks: "+chem);
        System.out.println("Biology marks: "+bio);
        System.out.println("Maths marks: "+maths);
        System.out.println("English-I marks: "+eng1);
        System.out.println("English-II marks: "+eng2);
        System.out.println("French marks: "+frn);
        System.out.println("Computer marks: "+comp);
        System.out.println("History marks: "+hist);
        System.out.println("Geography marks: "+geog);
        System.out.println ("Total marks out of 800 are: "+tot);
        System.out.println ("Your Term Percentage are: "+per);
    }
}