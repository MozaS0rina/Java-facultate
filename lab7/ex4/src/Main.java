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
        System.out.print("Introduceti elementele : ");
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++) {
                System.out.print("a[" + i + "][ "+j+"]= ");
                a[i][j] = scanner.nextInt();
            }
        }
        int x,k=0;
        System.out.print("Introduceti valoarea x: ");
x=scanner.nextInt();
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++) {
                if(a[i][j]==x)k++;
            }
        }
        System.out.print("Numarul de aparitii este: "+k);
    }
}