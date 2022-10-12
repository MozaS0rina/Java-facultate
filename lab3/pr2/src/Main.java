import java.util.Scanner;

public class Main
{
    public static String n;
    public static int nr_invitati()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de initati la eveniment: ");
        n = scanner.next();
        int x=Integer.parseInt(n);
        return x;
    }
    public static void motto()
    {
        System.out.println("Motto: Carly’s makes the food that makes it a party. ");
    }
    public static void pret()
    {
        int x=Integer.parseInt(n);
        int total =  x* 35;
        System.out.println("Pretul per oaspete este de 35 $ ");
        System.out.println("Pretul total este:  " + total );
        String var;
        if( x>=50)var="adevarat";
        else  var="fals";
        System.out.println("Evenimentul este mare daca are peste 50 de invitati. ");
        System.out.println("Evenimentul are "+x+" invitati,deci este "+var);
    }
    public static void main(String[] args)
    {
        int nr=nr_invitati();
        motto();
        pret();
    }
}