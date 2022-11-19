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
        int negativ=0,pozitiv=0;
        for(i=1;i<=n;i++)
        {
            if (a[i]<0)negativ++;
            else if (a[i]>0)pozitiv++;
        }
        System.out.print("Numarul de elemente negative este: "+negativ);
        System.out.print("Numarul de elemente pozitive este: "+pozitiv);

    }
}