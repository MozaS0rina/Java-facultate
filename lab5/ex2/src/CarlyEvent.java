import java.util.Scanner;

public class CarlyEvent {

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
            Eveniment eveniment=new Eveniment();
            int x=eveniment.getGuests();
            String var;
            if( x>=50)var="adevarat";
            else  var="fals";
            System.out.println("Evenimentul este mare daca are peste 50 de invitati. ");
            System.out.println("Evenimentul are "+x+" invitati,deci este "+var);
        }
        public static  Eveniment event(Eveniment eveniment)
        {
            int x=nr_invitati();
            eveniment.setInvitati(x);
            eveniment.setGuests(x);
            String nrev;
            System.out.println("Codul evenimentului este:  ");
            Scanner scanner = new Scanner(System.in);
            nrev=scanner.next();
            eveniment.setEventNumber(nrev);
            return eveniment;
        }
}
