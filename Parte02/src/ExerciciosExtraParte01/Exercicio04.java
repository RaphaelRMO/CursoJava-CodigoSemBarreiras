/*Informar todos os números de
1000 a 1999 que quando divididos por 11 obtemos resto = 5.
 */
package ExerciciosExtraParte01;

public class Exercicio04 {
    public static void main(String[] args) {
        for (int i=1000;i<2000;i++){
            if (i%11==5){
                System.out.println("DIVIDIDO POR 11 RESTO 5: "+i);
            }
        }
    }
}
