import java.util.*;
class mobilee
{
       double l,i,n;
       mobilee(double lo,double Is,double ne)
       {
           l = lo;
           i = Is;
           n = ne;
       }
       mobilee()
       {
           l = 0.0;i = 0.0;n = 500.0;
       }
       void bill(int nl,int ni)//number of local calls and number of isd calls
       {
           System.out.println("The bill of local: "+ (l * nl)
                   +"\nThe bill of ISD "+ (i *ni)
                   +"\nThe bill of network "+ (n));
       }
}
public class callRate {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        mobilee ob = new mobilee();//default constructor
        mobilee ob1 = new mobilee(0.1f,1,500);
        System.out.println("Enter number of local and number of ISD - ob");
        ob.bill(sc.nextInt(),sc.nextInt());
        System.out.println("Enter number of local and number of ISD - ob1");
        ob1.bill(sc.nextInt(),sc.nextInt());
        sc.close();
    }
}
