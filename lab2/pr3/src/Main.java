import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de minute pentru" +
                " inchirierea echipamentului: ");
        n = scanner.next();
        int x = Integer.parseInt(n);
       int ore = x/60;
       int minuteExtra= x-ore*60;
       double pret= ore*40 + minuteExtra;

        System.out.println("Numele companiei: SammysMotto2 ");
        System.out.println("Numarul total de ore: "+ ore );
        System.out.println("Numarul total de minute extra: "+ minuteExtra );
        System.out.println("Pretul total este:  " + pret );

    }
}