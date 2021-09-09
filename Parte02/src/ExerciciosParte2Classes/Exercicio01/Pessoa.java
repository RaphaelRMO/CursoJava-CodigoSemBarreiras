/*Crie uma classe para representar uma pessoa,
com os atributos de nome, ano de nascimento e altura.
Crie também um método para imprimir todos dados de uma
pessoa usando System.out.println. Crie um método para dizer
quantos anos a pessoa fará no ano corrente.
 */
package ExerciciosParte2Classes.Exercicio01;

public class Pessoa {
    public String nome;
    public Integer anoNasc;
    public Float altura;

    void imprimeDados(){
        System.out.printf("Nome: %s\nAno de Nascimento: %d\nAltura: %.2f\n",
                this.nome,
                this.anoNasc,
                this.altura);
    }
    void idadeCorrente(){
        int anoCorrente=2021;
        System.out.println(anoCorrente - this.anoNasc);
    }

}
