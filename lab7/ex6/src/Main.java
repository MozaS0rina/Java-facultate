import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int i;
        System.out.print("Introduceti numarul de linii ale matricii: ");
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        System.out.print("Introduceti numarul de coloane ale matricii: ");
        int m;
        m=scanner.nextInt();
        int   a[][]=new int[n][m];
        System.out.print("Introduceti elementele: ");
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++) {
                System.out.print("a[" + i + "][ "+j+"]= ");
                a[i][j] = scanner.nextInt();
            }
        }
        int x=0,max=0, maxlinie=0;

        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++) {
                if(a[i][j]!=0)maxlinie++;
            }
            if (max<maxlinie){max=maxlinie;
            x=i;
            }
        }
        System.out.print("Numarul de aparitii maxim  este pe linia: "+x);
    }
}