public class Main
{
    public static void main(String[] args)
    {
        float productie=0;
        float piese=4000;
        int i,ok=0;
        for(i=1;i<=12;i++)
        {
            piese=piese*106/100;
            productie =productie+piese;
            if (piese>7000)ok=i;
        }
        System.out.print("Productia muncitorului dupa un an este de "+productie+" piese"+"\n");
        if (ok!=0) System.out.print("Muncitorul are nevoie de marire din luna "+ok);
    }
}