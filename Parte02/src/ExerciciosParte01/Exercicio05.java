package ExerciciosParte01;/*Escreva um algoritmo em Java que seja capaz de fazer as
 seguintes operações matemáticas (adição, subtração, multiplicação e divisão).
 Todas as operações serão entre dois valores. No começo do algoritmo
 pergunte ao usuário qual operação ele deseja fazer e quais são os valores.
 */

import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Digite a operação que deseja fazer:");
        System.out.println("1 = adição");
        System.out.println("2 = Subtração");
        System.out.println("3 = Multiplicação");
        System.out.println("4 = Divisão");
        int op=in.nextInt();
        if (op==1||op==2||op==3||op==4) {
            System.out.println("digite o primeiro número");
            float n1 = in.nextFloat();
            System.out.println("Digite o segundo número");
            float n2 = in.nextFloat();
            if (n2 == 0&&op==4) {
                System.out.println("impossivel dividir por zero");
            } else {
                switch (op) {
                    case 1:
                        System.out.println("resultado: " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println("resultado: " + (n1 - n2));
                        break;
                    case 3:
                        System.out.println("resultado: " + (n1 * n2));
                        break;
                    case 4:
                        System.out.println("resultado: " + (n1 / n2));
                        break;
                }
            }
        }
        else{
            System.out.println("operador digitado é invalido");
        }
        in.close();
    }
}
