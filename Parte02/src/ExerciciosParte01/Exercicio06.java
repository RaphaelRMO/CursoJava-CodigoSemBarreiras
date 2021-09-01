package ExerciciosParte01;/*Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô).
 O algoritmo deverá perguntar qual é a escolha do jogador 1
 (Pedra [pe], Papel [pa], Tesoura [t]) e deverá fazer o mesmo
 para o jogador 2. No final da execução o algoritmo deverá dizer
 qual é o jogador vencedor ou se houve empate.
 */

import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("Jogador um escolher a opção");
        int op1=in.nextInt();
        System.out.println("Jogador dois escolher a opção");
        int op2=in.nextInt();
        if ((op1!=1&&op1!=2&&op1!=3)||(op2!=1&&op2!=2&&op2!=3)){
            System.out.println("operação digitada errada");
        } else{
            if (op1==1&&op2==2){
                System.out.println("jogador dois ganhou");
            } else if (op1==2&&op2==3){
                System.out.println("jogador dois ganhou");
            } else if(op1==3&&op2==1){
                System.out.println("jogador dois ganhou");
            } else if (op1==op2){
                System.out.println("empate");
            } else{
                System.out.println("jogador um ganhou");
            }
        }
        in.close();
    }
}
