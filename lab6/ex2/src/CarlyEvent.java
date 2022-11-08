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
            if(eveniment.isLargerEvent()==true)
            { eveniment.setGuests(true);
                System.out.println("Evenimentul este mare daca are peste 50 de invitati. ");
                System.out.println("Evenimentul are "+x+" invitati,deci este mare");
            }

        }
        public static  Eveniment event(Eveniment eveniment)
        {
            int x=nr_invitati();
            eveniment.setInvitati(x);
            pret();
            //eveniment.setGuests();
            String nrev;
            System.out.println("Codul evenimentului este:  ");
            Scanner scanner = new Scanner(System.in);
            nrev=scanner.next();
            eveniment.setEventNumber(nrev);
            return eveniment;
        }
    public  void comparare(Eveniment eveniment,Eveniment eveniment2)
    {
        if (eveniment.getInvitati()>eveniment2.getInvitati()) {
            System.out.print("Primul eveniment e mai mare ca al doilea!");
            System.out.print("Numarul de invitati este : " + eveniment.getInvitati());
        }
        else
        if (eveniment.getInvitati()<eveniment2.getInvitati()) {
            System.out.print("Primul eveniment e mai mic ca al doilea!");
            System.out.print("Numarul de invitati este : " + eveniment2.getInvitati());
        }

        else
            System.out.print("Primul eveniment e la fel de mare ca al doilea!");
    }
}
