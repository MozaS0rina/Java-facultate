import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {

        int i;
        System.out.print("Introduceti numarul de  al vectorului: ");
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
        int nul=0;
        for(i=1;i<=n;i++)
        {
            if (a[i]==0)nul++;
        }
        System.out.print("Numarul de elemente nule este: "+nul);
    }
}