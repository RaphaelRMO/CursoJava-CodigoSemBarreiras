/*1. Faça um laço de repetição que solicite ao usuário
 digitar um número;
2. O laço encerra quando o usuário acertar o número;
3. Se o número do usuário for menor que o oculto, escrever: “MAIOR”,
 se o número do usuário for maior que o oculto, escrever: “MENOR”.
 */

package ExerciciosExtraParte01;
import java.util.Random;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rnd = new Random(); //Inicia Aleatório
        int x = rnd.nextInt(100); //Gera um número aleatório (0 – 99)
        int n=-1;
        while (n!=x){
            System.out.println("Digite um número");
            n=in.nextInt();
            if (n>x) {
            System.out.println("Numero digitado maior");
            }else if(n<x){
                System.out.println("número digitado menor");
            }
        }
        System.out.println("Acertou");
    }
}
