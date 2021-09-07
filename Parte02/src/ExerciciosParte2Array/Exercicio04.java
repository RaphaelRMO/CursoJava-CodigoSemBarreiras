/*Escreva um algoritmo que leia números,
insira em um array e após mostre o maior valor. */
package ExerciciosParte2Array;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio04 {
    public static void main(String[] args) {
        try (Scanner in=new Scanner(System.in)){
            var continuar=true;
            var lista=new ArrayList<Integer>();
            int maior= Integer.MIN_VALUE;
            while (continuar) {
                System.out.println("Digite um número");
                int num = in.nextInt();
                if (num > maior) {
                    maior = num;
                }
                lista.add(num);
                System.out.println("Deseja continuar digitando? [s][n]");
                if (in.next().charAt(0)=='n'){
                    continuar=false;
                }
            }
            System.out.println("Maior valor inserido: "+maior);
            System.out.println(lista);
        }
    }
}
