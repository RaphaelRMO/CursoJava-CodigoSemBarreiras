package ExerciciosParte01;/*Construa um algoritmo que leia 10 valores
inteiros e positivos e:
 Encontre o maior valor
 Encontre o menor valor
 Calcule a média dos números lidos*/
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float maior, menor;
        System.out.println("Digite o primeiro valor");
        float n1=in.nextFloat();
        maior=n1;
        menor=n1;
        System.out.println("Digite o segundo valor");
        float n2=in.nextFloat();
        if(n2>maior){
            maior=n2;
        }
        if(n2<menor){
            menor=n2;
        }
        System.out.println("Digite o terceiro valor");
        float n3=in.nextFloat();
        if(n3>maior){
            maior=n3;
        }
        if(n3<menor){
            menor=n3;
        }
        System.out.println("Digite o quarto valor");
        float n4=in.nextFloat();
        if(n4>maior){
            maior=n4;
        }
        if(n4<menor){
            menor=n4;
        }
        System.out.println("Digite o quinto valor");
        float n5=in.nextFloat();
        if(n5>maior){
            maior=n5;
        }
        if(n5<menor){
            menor=n5;
        }
        System.out.println("Digite o sexto valor");
        float n6=in.nextFloat();
        if(n6>maior){
            maior=n6;
        }
        if(n6<menor){
            menor=n6;
        }
        System.out.println("Digite o setimo valor");
        float n7=in.nextFloat();
        if(n7>maior){
            maior=n7;
        }
        if(n7<menor){
            menor=n7;
        }
        System.out.println("Digite o oitavo valor");
        float n8=in.nextFloat();
        if(n8>maior){
            maior=n8;
        }
        if(n8<menor){
            menor=n8;
        }
        System.out.println("Digite o nono valor");
        float n9=in.nextFloat();
        if(n9>maior){
            maior=n9;
        }
        if(n9<menor){
            menor=n9;
        }
        System.out.println("Digite o decimo valor");
        float n10=in.nextFloat();
        if(n10>maior){
            maior=n10;
        }
        if(n10<menor){
            menor=n10;
        }
        System.out.println("o maior número é: "+maior);
        System.out.println("O menor número é: "+menor);
        System.out.printf("a media entre os números é: %f",
                (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10);
        in.close();
    }
}
