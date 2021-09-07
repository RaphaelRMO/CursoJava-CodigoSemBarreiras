/*Escreva um algoritmo que simula um jogo da forca simples.
o usuario precisara adivinhar uma palavra chutando cada letra
em no máximo 10 chutes, caso o usuario acerte a letra o jogo
dirá que ele acertou, caso tenha errado, o numero de
tentativas vai diminuindo. Caso o numero de tentativas chegue
a 0 o usuário perde. */
package ExerciciosParte2Array;

import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var tentativas = 10;

            String[] possiveisPalavras = {
                    "banana",
                    "abacaxi",
                    "mamute",
                    "hipocondriaco",
                    "java",
                    "alelo",
                    "chocolate",
                    " morango "
            };

            var random = new Random();
            var palavra = possiveisPalavras[random.nextInt(possiveisPalavras.length)].trim().toLowerCase();

            System.out.printf("A palavra escolhida tem %d letras\n", palavra.length());

            var palavraRevelada = new String[palavra.length()];

            var palavraAcertada = false;

            while (tentativas > 0 && !palavraAcertada) {
                var houveAcerto = false;
                System.out.println("Digite uma letra");
                char letra = scanner.next().toLowerCase().charAt(0);

                var letraJaEscolhida = false;

                for (var letraAcertada : palavraRevelada) {
                    if (letraAcertada != null && letraAcertada.equals(String.valueOf(letra))) {
                        System.out.println("Você já escolheu essa letra!");
                        letraJaEscolhida = true;
                        break;
                    }
                }

                if (letraJaEscolhida) {
                    tentativas--;
                    System.out.printf("Você tem %d tentativas\n", tentativas);
                    continue;
                }

                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {

                        // Com o uso de array da String
                        palavraRevelada[i] = String.valueOf(palavra.charAt(i));
                        houveAcerto = true;

                    }
                }

                if (!houveAcerto) {
                    tentativas--;
                }

                palavraAcertada = true;
                for (var letraRevelada : palavraRevelada) {
                    if (letraRevelada == null) {
                        palavraAcertada = false;
                        break;
                    }
                }

                for (var letraRevelada : palavraRevelada) {
                    if (letraRevelada != null) {
                        System.out.print(letraRevelada + " ");
                    } else {
                        System.out.print("- ");
                    }
                }
                System.out.println("");

                if (!palavraAcertada) {
                    System.out.printf("Você tem %d tentativas\n", tentativas);
                }


            }

            if (tentativas == 0) {
                System.out.println("Você pedeu.");
            } else {
                System.out.println("Você ganhou.");
            }
        }

    }

}



