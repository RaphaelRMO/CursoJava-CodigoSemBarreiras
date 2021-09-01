/*Faça um programa para listar todos os divisores de um número ou dizer que o número é primo caso não existam
divisores  Ao final, verifique se o usuário deseja analisar outro número
 */
package ExerciciosExtraParte01;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char continuar='s';
        while (continuar=='s'){
            System.out.println("digite o número que quer saber os divisores");
            int n=in.nextInt();
            int divisores=n;
            for(int i=0 ; i<n ;i++){
                if(n % divisores==0){
                    System.out.printf("\nnúmero divisível por %d", divisores);
                }
                divisores--;
            }
            System.out.printf("\ncontunuar? s/n");
            continuar=in.next().charAt(0);
        }
    }
}
