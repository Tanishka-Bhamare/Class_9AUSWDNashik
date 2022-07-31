class ternary_2
{
    public static void main (double bill)
    {
        double discount=(bill>10000)?bill*10.0/100:bill*5.0/100;
        System.out.println("Discount="+discount);
    }
}