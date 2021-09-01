package ExerciciosParte01;/*Escreva um algoritmo em Java que leia dois números inteiros
e determine qual é o menor. Escreva um algoritmo que determina o maior também.
 */
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int n1=in.nextInt();
        System.out.println("Digite o segundo número");
        int n2=in.nextInt();
        if(n1>n2){
            System.out.println(n1+" é maior que " +n2);
        }
        else if(n2>n1){
            System.out.println(n2+" é maior que "+n1);
        }
        else{
            System.out.println(n1+ " é igual a "+n2);
        }
        in.close();
    }
}
