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
            k++;//incrementezi counterul chiar daca numarul ii bun sau nu
            if (nota < 10) // conditai ar trebui sa fie nota > 10 || nota < 0
                System.out.print("Nota invalida! ");
            else
            {
                if(nota>min)min=nota;
                if(nota<max)max=nota;
                medie=nota+medie;//aici calculezi suma nu media
            }
        }
        System.out.print("Numarul de note introduse : "+k+"\n");
        medie=medie/k;
        System.out.print("Media notelor:  "+medie+"\n");
        System.out.print("Maximul este:  "+max+"\n");
        System.out.print("Minimul este:  "+min+"\n");

    }
}
