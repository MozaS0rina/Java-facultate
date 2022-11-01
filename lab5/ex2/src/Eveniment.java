public class Eveniment
{
    public final static int PRET=35;
    public final static int LIMITA=50;
    private String eveniment;
    private static int  invitati;
    private int pret;
    public String getEventNumber()
    {
        return eveniment;
    }
    public  void setEventNumber(String _eveniment)
    {
        eveniment=_eveniment;
    }
    public int getInvitati()
    {
        return invitati;
    }
    public  void setInvitati(int _invitati)
    {
        invitati=_invitati;
    }
    public int getGuests()
    {
        return pret;
    }
    public  void setGuests(int _invitati)
    {
         pret=PRET*invitati;
    }


}
