public class Consumabile
{
    public final static int MINUTE=60;
    public final static int PRET_ORA=40;
    private String tipEchipament;
    public int tip;
    public final String tip1="Ambarcatiuni personale",tip2="Barca",tip3="Canoe",
            tip4="Caiac",tip5="Alt tip de echipament";
    private  char[] contract;
    private int ore;
    private  int  minute;
    private int pret;
    private char[] telefon;
    public Consumabile(int _minute,char[] _contract)
    {
        if((contract[0]>='a' && contract[0]<='z')||(contract[0]>='A' && contract[0]<='Z'))
            if((contract[1]>='0' && contract[1]<='9'))
                if((contract[2]>='0' && contract[2]<='9'))
                    if((contract[3]>='0' && contract[3]<='9'))
                        if(contract.length==4)
                            contract=_contract;
                        else  contract= "A000".toCharArray();
        if(contract[0]>='a' && contract[0]<='z') contract[0]= (char) (contract[0]-'a'+'A');//tranf prima litera mica in litera mare

        minute=_minute;

    }
    public void setTelefon(char[] _telefon)
    {
        int i=0,k=0;
         char[] tel= "".toCharArray();

        while(i<_telefon.length) {
            if(_telefon[i]>='0' && _telefon[i]<='9')
            { tel[k]=_telefon[i];k++;}
            i++;
        }//formare nr tel doar cu cifre
        if(tel.length>10||tel.length<10)
            telefon="0000000000".toCharArray();
        else
            telefon=tel;
    }

    public char[] getTelefon() {
        return telefon;
    }

    public Consumabile()
    {
        contract="A000".toCharArray();
        minute=0;

    }
    public char[] getContractNumber()
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
    public void setTip(int tip)
    {
        if(tip==1)
            tipEchipament=tip1;
        if(tip==2)
            tipEchipament=tip2;
        if(tip==3)
            tipEchipament=tip3;
        if(tip==4)
            tipEchipament=tip4;
        if(tip==5)
            tipEchipament=tip5;

    }
    public String getTip()
    {
        return tipEchipament;
    }

}
