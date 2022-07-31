import java.util.*;
class emp_sal
{
    public static void main ()
    {
        String en;
        double asal,asav;
        Scanner tb=new Scanner(System.in);
        System.out.println("Enter Employ Name");
        en=tb.nextLine();
        System.out.println("Enter Annual Salary");
        asal=tb.nextDouble();
        System.out.println("Enter Annual Savings");
        asav=tb.nextDouble();
        double ti=asal-asav;
        if(ti<=200000)
        System.out.println("Tax payable is: 0");
        else if (ti>200000 && ti<=500000)
        System.out.println("Tax payable is: " +(ti*0.10));
        else if (ti>500000 && ti<=1000000)
        System.out.println("Tax payable is: " +(ti*0.20));
        else if (ti>1000000)
        System.out.println("Tax payable is: " +(ti*0.30));
    }
}