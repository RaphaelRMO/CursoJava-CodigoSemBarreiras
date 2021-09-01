/*Faça um programa para calcular a série de Fibonacci para
um número informado pelo usuário, sendo
F(0) = 0, F(1) = 1 e F(n)= F(n-1)+F(n-2) 
Por exemplo, caso o usuário informe o número 9, o resultado seria:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */
package ExerciciosExtraParte01;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Digite o termo da série Fibonacci que quer saber");
        int n=in.nextInt();

        int resultado=0, r2=0, r1=1;
        System.out.printf("%d, ", 0);
        System.out.printf("%d, ", 1);
        for (int i=1; i<n;i++){
            resultado=r1+r2;
            if(r2==1)
                r2++;
            r2=r1;
            r1=resultado;
            if(i==n-1){
                System.out.printf("%d", resultado);
            }else {
                System.out.printf("%d, ", resultado);
            }


        }

    }

}
