public class EventDemo
{
    public static void main(String[] args)
    {
        int k=0;
        Eveniment[] eveniment = new Eveniment[8];
        while(k<8) {
            int nr = CarlyEvent.nr_invitati();
            CarlyEvent.motto();

            eveniment[k] = new Eveniment();//primul obiect
            CarlyEvent.event(eveniment[k]);
            CarlyEvent.pret();
//afisari
            System.out.print("Numarul evenimetului  este: " + eveniment[k].getEventNumber());
            System.out.print("Numarul de invitati este : " + eveniment[k].getInvitati());
            System.out.print("Pretul evenimetului  este: " + eveniment[k].getGuests());
        k++;
        }

   int j;
        Eveniment aux = new Eveniment();
        for(k=0;k<7;k++) {
            for(j=k+1;j<8;j++) {
                String ev1,ev2;
                ev1=(eveniment[k].getEventNumber()).toString();
                ev2=(eveniment[j].getEventNumber()).toString();
                if(ev1.compareTo(ev2)<0 )
                    aux=eveniment[k];
                    eveniment[k]=eveniment[j];
                    eveniment[j]=aux;

                }
            }
        k=0;
        while(k<8) {

//afisari in ord cresc
            System.out.print("Sortarea crescatoare a evenimentelor: \n");
            System.out.print("Numarul evenimetului  este: " + eveniment[k].getEventNumber());
            System.out.print("Numarul de invitati este : " + eveniment[k].getInvitati());
            System.out.print("Pretul evenimetului  este: " + eveniment[k].getGuests());
            k++;

        }

       /* Eveniment eveniment2=new Eveniment();//al doilea
        System.out.print("Va rugam sa introduceti numaul de ivitati intre 5 si 100! ");

//afisari
        System.out.print("Numarul evenimetului 1 este: "+eveniment.getEventNumber());
        System.out.print("Numarul de invitati este : "+eveniment.getInvitati());
        System.out.print("Pretul evenimetului 1 este: "+eveniment.getGuests());
        int i;
        for(i=1;i<= eveniment.getInvitati();i++)
        {
            System.out.print("Please come to my event!");
        }


        System.out.print("Numarul evenimetului 2 este: "+eveniment2.getEventNumber());
        System.out.print("Numarul de invitati este : "+eveniment2.getInvitati());
        System.out.print("Pretul evenimetului 2 este: "+eveniment2.getGuests());
        for(i=1;i<= eveniment2.getInvitati();i++)
        {
            System.out.print("Please come to my event!");
        }*/

    }
}