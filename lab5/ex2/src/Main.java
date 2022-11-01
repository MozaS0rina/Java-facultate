import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int nr=CarlyEvent.nr_invitati();
        CarlyEvent.motto();
        Eveniment eveniment=new Eveniment();
//afisari
        System.out.print("Numarul evenimetului este: "+eveniment.getEventNumber());
        System.out.print("Numarul de invitati este : "+eveniment.getInvitati());
        System.out.print("Pretul evenimetului este: "+eveniment.getGuests());
        CarlyEvent.pret();


    }
}