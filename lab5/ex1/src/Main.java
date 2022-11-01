import java.util.Scanner;
public class Main
{
        public static void main(String[] args)
        {

           Caracter july = new Caracter();
            Caracter xavi = new Caracter();

            july = getData(july,"july");
            xavi= getData(xavi,"xavi");
            System.out.print("Datele lui "+Caracter.getNume()+"sunt:");
            System.out.print("Culoarea este: "+Caracter.getCuloare());
            System.out.print("Are  "+Caracter.getNrVieti()+"si "+Caracter.getNrOchi()+" ochi");
        }
        public static  Caracter  getData( Caracter caracter,String nume) {
            String culoare;

            int ochi, vieti;


            Scanner keyboard = new Scanner(System.in);

            System.out.print("Introdu culoarea lui " +nume);

            culoare = keyboard.next();

            keyboard.nextLine();

            System.out.print("Introdu numarul de ochi al lui " + nume );

            ochi = keyboard.nextInt();
            System.out.print("Introdu numarul de vieti al lui " + nume);

            vieti = keyboard.nextInt();

            Caracter.setNume(nume);
            Caracter.setCuloare(culoare);
            Caracter.setNrVieti(vieti);
            Caracter.setNrOchi(ochi);
           return caracter;
        }
}