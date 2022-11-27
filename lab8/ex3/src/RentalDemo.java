import java.util.Scanner;

public class RentalDemo
{
    Consumabile[] consumabile=new Consumabile[8];
   // Consumabile consumabile2=new Consumabile();
    public int n;
   /* public static String n;
    public static int timp()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de minute pentru" +
                " inchirierea echipamentului: ");
        n = scanner.next();
        int x = Integer.parseInt(n);
        return x;
    }
    public static void motto()
    {
        System.out.println("Motto: Sammy’s makes it fun in the sun .");
    }
    public static void inchiriere()
    {
        int x = Integer.parseInt(n);
        int ore = x/60;
        int minuteExtra= x-ore*60;
        double pret= ore*40 + minuteExtra;
        System.out.println("Numarul total de ore: "+ ore );
        System.out.println("Numarul total de minute extra: "+ minuteExtra );
        System.out.println("Pretul total este:  " + pret );
    }*/
    public void setari(Consumabile consumabile)
    {   Scanner scanner = new Scanner(System.in);
        while(n>=60 && n<=7200)
        {
        System.out.print("Introduceti numarul de minute pentru" +
                " inchirierea echipamentului: ");
        n = scanner.nextInt();
        }

        consumabile.setOre(n);
        System.out.print("Introduceti numarul contractului: ");
        String contractnr= scanner.next();
        consumabile.setContractNumber(contractnr);
        consumabile.setHoursAndMinutes();


    }
    public void afisari(Consumabile consumabile)
    {
        System.out.println(" Contractul cu numarul " + consumabile.getContractNumber()+" are urmatoarele detalii:  " );
        System.out.println("Numarul total de ore: "+consumabile.getOre() );
        System.out.println("Pretul total : "+ consumabile.getHoursAndMinutes(n) );
    }

    public  void main(String[] args)
    {
        //int x =timp();
        //motto();
        //inchiriere();
        int i;
        for(i=0;i<8;i++)
        {setari(consumabile[i]);
        afisari(consumabile[i]);}

        int j,k;
        Consumabile aux = new Consumabile();
        for(k=0;k<7;k++) {
            for(j=k+1;j<8;j++) {
                String ev1,ev2;
                ev1=(consumabile[k].getContractNumber()).toString();
                ev2=(consumabile[j].getContractNumber()).toString();
                if(ev1.compareTo(ev2)<0 )
                    aux=consumabile[k];
                consumabile[k]=consumabile[j];
                consumabile[j]=aux;

            }
        }
        k=0;
        while(k<8) {
            System.out.print("Sortarea crescatoare a echipamentelor: \n");
//afisari in ord cresc
            afisari(consumabile[k]);
            k++;

        }
       /* setari(consumabile2);
        afisari(consumabile2);
        int i;
        for(i=1;i<=consumabile2.getOre();i++)
        {
            System.out.print("Coupon good for 10 percent off next rental!");
        }*/



    }
}