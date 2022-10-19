import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int nota=0,k=0;
        float max=0, min=0, medie=0;
        System.out.print("Introducerea notei 99 va fi iesirea din program");
        while(nota !=99)
        {
            System.out.print("Introduceti nota: ");
            nota = scanner.nextInt();
            k++;
            if (nota < 10)
                System.out.print("Nota invalida! ");
            else
            {
                if(nota>min)min=nota;
                if(nota<max)max=nota;
                medie=nota+medie;
            }
        }
        System.out.print("Numarul de note introduse : "+k+"\n");
        medie=medie/k;
        System.out.print("Media notelor:  "+medie+"\n");
        System.out.print("Maximul este:  "+max+"\n");
        System.out.print("Minimul este:  "+min+"\n");

    }
}