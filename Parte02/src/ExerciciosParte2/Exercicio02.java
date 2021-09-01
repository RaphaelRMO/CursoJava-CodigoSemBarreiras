/*Construa um algoritmo usando uma estrutura
de repetição que calcule o fatorial de um número.
 */
package ExerciciosParte2;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int resultado=1;
        System.out.println("Digite o numero que quer saber o fatorial");
        int num=in.nextInt();
        for (;num>0;num--){
            resultado *=num;
        }
        System.out.printf("o número digitado fatorial é: %d",resultado);
        in.close();
    }
}
