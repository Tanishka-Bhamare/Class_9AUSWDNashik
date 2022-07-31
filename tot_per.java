class tot_per
{
    public static void main (int phy,int chem,int bio)
    {
       int total=phy+chem+bio;
        double per= ((double)total/300)*100;
        System.out.println("Your Physics marks are: "+phy);
        System.out.println("Your Chemistry marks are: "+chem);
        System.out.println("Your Biology marks are: "+bio);
        System.out.println("Total = "+total);
        System.out.println("Percentage = "+per);
    }
}