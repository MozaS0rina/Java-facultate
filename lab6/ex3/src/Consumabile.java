public class Consumabile
{
    public final static int MINUTE=60;
    public final static int PRET_ORA=40;
    private  String  contract;
    private int ore;
    private  int  minute;
    private int pret;
    public Consumabile(int _minute,String _contract)
    {
        contract=_contract;
        minute=_minute;

    }
    public Consumabile()
    {
        contract="A000";
        minute=0;

    }
    public String getContractNumber()
    {
        return contract;
    }
    public  void setContractNumber(String _contract)
    {
       // contract=_contract;
    }
    public int getOre()
    {
        return ore;
    }
    public  void setOre(int minute)
    {
        ore=minute/60;
    }
    public int getHoursAndMinutes(int _minute)
    {
        ore=_minute/60;
        minute=_minute%60;
        if (minute<=40)
            pret=ore*40 +1;
        else pret=ore*40 +minute/40 + minute%40;

        int x=ore,y=pret;
       getOre();
        return pret;
    }
    public  void setHoursAndMinutes()
    {
        ore=minute/60;
        minute=minute%60;
    }
    public Consumabile TimpInchiriereMaxim( Consumabile consumabile,Consumabile consumabile2)
    {
        if (consumabile.pret>consumabile2.pret) {
            return consumabile;
        }else return consumabile2;

    }


}
