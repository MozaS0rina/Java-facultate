import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int r1,r2,r3,r4,r5;
        System.out.print("Introduceti scorul lui Art>> ");
        r1 = scanner.nextInt();
        System.out.print("Introduceti scorul lui Bob>> ");
        r2 = scanner.nextInt();
        System.out.print("Introduceti scorul lui Call>>  ");
        r3 = scanner.nextInt();
        System.out.print("Introduceti scorul lui Dan>>  ");
        r4 = scanner.nextInt();
        System.out.print("Introduceti scorul lui Eli>>  ");
        r5 = scanner.nextInt();
        System.out.print(" Scorurile jocului"+"\n");
        int i;
        System.out.print("Art ");
        for(i=1;i<=r1;i++)
            System.out.print("*");
        System.out.print("\n");
        System.out.print("Bob");
        for(i=1;i<=r2;i++)
            System.out.print("*");
        System.out.print("\n");
        System.out.print("Cal ");
        for(i=1;i<=r3;i++)
            System.out.print("*");
        System.out.print("\n");
        System.out.print("Dan ");
        for(i=1;i<=r4;i++)
            System.out.print("*");
        System.out.print("\n");
        System.out.print("Eli ");
        for(i=1;i<=r5;i++)
            System.out.print("*");
        System.out.print("\n");

    }
}