public class Consumabile
{
    public final static int MINUTE=60;
    public final static int PRET_ORA=40;
    private  String  contract;
    private int ore;
    private  int  minute;
    private int pret;
    public String getContractNumber()
    {
        return contract;
    }
    public  void setContractNumber(String _contract)
    {
        contract=_contract;
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
        pret=ore*40 +minute;
        int x=ore,y=pret;
       getOre();
        return pret;
    }
    public  void setHoursAndMinutes(int _minute)
    {
        ore=_minute/60;
        minute=_minute%60;
    }
}
