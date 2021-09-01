package ExerciciosParte01;/*Escreva um algoritmo que leia um número inteiro e
diga se ele é par ou ímpar. */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Digite um número");
        int n=in.nextInt();
        if (n%2==0){
            System.out.println("o número é par");
        }
        else{
            System.out.println("o número é impar");
        }
    }
}
