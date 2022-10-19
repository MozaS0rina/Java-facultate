import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int d,s=1;
        Scanner scanner= new Scanner(System.in);
        int  n;
        System.out.print("Introduceti un numar natural:  ");
        n = scanner.nextInt();
        for(d=2;d<=n/2;d++)
            if(n%d==0)
                s=s+d;
        if(n==s)
            System.out.print("Numarul  "+n+" este perfect");
        else
            System.out.print("numarul "+n+" nu este perfect");

    }
}