import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        //punctul a
        Scanner scanner= new Scanner(System.in);
        int  nr;
        Random rand= new Random();
        int r= rand.nextInt();
        System.out.print("Introduceti un numar intreg de ghicit:  ");
        nr = scanner.nextInt();
        if (nr == r)
                System.out.print("Ati nimerit numarul!");
            else
            {
            System.out.print("Mai incercati! Nu ati ghichit numarul.");
            if (nr < r) System.out.print(" Numarul a fost mai mic ! ");
                 else System.out.print(" Numarul a fost mai mare ! ");
              }
        //punctul b

        System.out.print("Pentru a iesi  introduceti 0. "+"\n");
        r= rand.nextInt();
            int ok=0,k=0;
            while(ok==0&& nr!=0)
            {
                System.out.print("Introduceti un nou numar intreg de ghicit:  "+"\n");
                nr = scanner.nextInt();
                k++;
                if (nr == r)
                    System.out.print("Ati nimerit numarul!"+"\n");
                else
                {
                    System.out.print("Mai incercati! Nu ati ghichit numarul."+"\n");
                }
                r= rand.nextInt();
            }




    }
}