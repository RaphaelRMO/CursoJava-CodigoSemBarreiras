/*Construa um algoritmo que leia 10 valores inteiros e positivos e:

Encontre o maior valor
Encontre o menor valor
Calcule a média dos números lidos
Esse exercício foi dado na aula 3 e agora vamos otimizar ele utilizando
 o while e for.
 */

package ExerciciosParte2;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        double menor=Integer.MAX_VALUE, maior=Integer.MIN_VALUE, soma=0;
        int quantNum=10;
        Scanner in=new Scanner(System.in);
        for(int i=1;i<=quantNum;i++) {
            System.out.printf("Digite o %d número",i);
            double n1 = in.nextDouble();
            soma+=n1;
            if (n1<menor) {
                menor = n1;
            } if (n1>maior){
                maior=n1;
            }
        }
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(soma/quantNum*1.0);
    }
}
