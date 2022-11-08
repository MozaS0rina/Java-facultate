public class Eveniment
{
    public final static int PRET=35;
    public final static int LIMITA=50;
    public final static int PRETMIC=32;
    public final static int PRETMARE=35;

    private String eveniment;
    private static int  invitati;
    private int pret;

    public Eveniment( String _eveniment,int _invitati )//constructor
    {
        eveniment=_eveniment;
        invitati=_invitati;
    }
    //metode
    public Eveniment()
    {
        eveniment="A000";
        invitati=0;
    }
    public String getEventNumber()
    {
        return eveniment;
    }
    public  void setEventNumber(String _eveniment)
    {
    //eveniment=_eveniment;
    }
    public int getInvitati()
    {
        return invitati;
    }
    public  void setInvitati( int _invitati)
    {
       // invitati=_invitati;
    }
    public int getGuests()
    {
        return pret;
    }
    public  void setGuests(boolean x)
    {
        if(x==true)
         pret=PRETMIC*invitati;
        else pret=PRETMARE*invitati;
    }

    public int Pret_per_persoana()
    {
        return PRET;
    }

public boolean isLargerEvent()
{
    if (invitati>50) return true ;
    else return false;

}


}
