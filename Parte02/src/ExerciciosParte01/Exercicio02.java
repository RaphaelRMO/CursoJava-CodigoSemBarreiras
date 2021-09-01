package ExerciciosParte01;/*Elabore um algoritmo que dada a idade de um nadador
classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("digite a idade");
        int idade=in.nextInt();
        if(idade<5){
            System.out.println("classificação não informada.");
        }else if (idade >=5 && idade<=7){
            System.out.println("Classificação: Infantil A");
        }else if (idade >=8 && idade<=11) {
            System.out.println("Classificação: Infantil B");
        }else if (idade >=12 && idade<=13) {
            System.out.println("Classificação: Juvenil A");
        }else if (idade >=14 && idade<=17) {
            System.out.println("Classificação: Juvenil B");
        }else{
            System.out.println("Classificação: Adulto");
        }
        in.close();
    }
}
