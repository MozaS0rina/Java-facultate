import java.util.Scanner;

public class Main
{
    public static String n;
    public static int timp()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de minute pentru" +
                " inchirierea echipamentului: ");
        n = scanner.next();
        int x = Integer.parseInt(n);
        return x;
    }
    public static void motto()
    {
        System.out.println("Motto: Sammy’s makes it fun in the sun .");
    }
    public static void inchiriere()
    {
        int x = Integer.parseInt(n);
        int ore = x/60;
        int minuteExtra= x-ore*60;
        double pret= ore*40 + minuteExtra;
        System.out.println("Numarul total de ore: "+ ore );
        System.out.println("Numarul total de minute extra: "+ minuteExtra );
        System.out.println("Pretul total este:  " + pret );
    }
    public static void main(String[] args)
    {
        int x =timp();
        motto();
        inchiriere();
    }
}