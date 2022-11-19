import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
    int i;
    System.out.print("Introduceti numarul de elemente al vectorului: ");
    int n;
     Scanner scanner=new Scanner(System.in);
     n=scanner.nextInt();
        int   a[]=new int[n];
        System.out.print("Introduceti elementele vectorului: ");
     for(i=1;i<=n;i++)
     {
         System.out.print("a["+i+"]= ");
         a[i]= scanner.nextInt();
     }
     int min=a[1];
        for(i=2;i<=n;i++)
        {
            if (min>a[i])min=a[i];
        }
        System.out.print("Numarul minim este: "+min);
    }
}