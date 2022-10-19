import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int r1,r2,r3,r4,r5;
        System.out.print("Introduceti scorul pe sezon al lui Art>> ");
        r1 = scanner.nextInt();
        System.out.print("Introduceti scorul pe sezon al lui Bob>> ");
        r2 = scanner.nextInt();
        System.out.print("Introduceti scorul pe sezon al lui Call>>  ");
        r3 = scanner.nextInt();
        System.out.print("Introduceti scorul pe sezon al lui Dan>>  ");
        r4 = scanner.nextInt();
        System.out.print("Introduceti scorul pe sezon al lui Eli>>  ");
        r5 = scanner.nextInt();
        System.out.print(" Scorurile jocului pe sezon "+"\n");
        int i;
        r1=r1/10;
        r2=r2/10;
        r3=r3/10;
        r4=r4/10;
        r5=r5/10;
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