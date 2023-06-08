
import java.util.Scanner;
/*
 * Faça Um programa que peça uma nota,entre zero e dez.
 * Mostre uma menssagem caso o valor seja invalido
 * e continue pedindfo 
 * até o usuario informar um valor valido.
 */



public class Ex2_Nota{
   
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int  nota;

    System.out.println("Nota: ");
     nota = scan.nextInt();


     while(nota < 0 | nota  > 10) {
    System.out.println("Nota invalida Digite novamente");
    nota = scan.nextInt();
}

}
}