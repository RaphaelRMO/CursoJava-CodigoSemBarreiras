/*Escreva um algoritmo que leia números insira em um array
e após mostre os números informados na tela.*/

package ExerciciosParte2Array;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio01 {
    public static void main(String[] args) {
       try (Scanner in=new Scanner(System.in)){
           boolean continuar=true;
           var num=new ArrayList<Integer>();
           while (continuar){
               System.out.println("Digite um número: ");
               num.add(in.nextInt());

               System.out.println("Deseja continuar digitando? s/n");
               if (in.next().charAt(0)=='n'){
                    continuar = false;
               }
           }
           System.out.println(num);
       }
    }
}
