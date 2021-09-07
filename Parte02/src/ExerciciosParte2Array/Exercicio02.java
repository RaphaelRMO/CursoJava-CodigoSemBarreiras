/*Escreva um algoritmo que leia números, insira em um array
e após mostre a quantidade de números negativos. */
package ExerciciosParte2Array;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio02 {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)){
            var continuar = true;
            var lista = new ArrayList<Integer>();
            var cont=0;
            while (continuar){
                System.out.println("Digite um número");
                int num=in.nextInt();
                if (num>0){
                    cont++;
                }
                lista.add(num);
                System.out.println("Continuar digitando? [s] [n]");

                if (in.next().charAt(0)=='n'){
                    continuar=false;
                }
            }
            System.out.println("A quantidade de números negativos é:" + cont);
        }
    }
}
