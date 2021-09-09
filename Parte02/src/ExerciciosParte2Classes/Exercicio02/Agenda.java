/*Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de
realizar as seguintes operações:

*void armazenaPessoa(String nome, int anoNascimento, float altura);
*void removePessoa(String nome);
*int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
*void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
*void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.*/
package ExerciciosParte2Classes.Exercicio02;

import ExerciciosParte2Classes.Exercicio01.Pessoa;

public class Agenda {
    Pessoa[] pessoas = new Pessoa[10];

    String nomeDaAgenda;

    public Agenda(String nomeDaAgenda) {
        this.nomeDaAgenda = nomeDaAgenda;
    }

    private int bucarOhProximoIndiceVazio() {
        for (int i = 0; i < this.pessoas.length; i++) {
            if (this.pessoas[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void armazenaPessoa(String nome, int anoNascimento, float altura) {
        var indiceParaGravarAhNovaPessoa = this.bucarOhProximoIndiceVazio();

        if (indiceParaGravarAhNovaPessoa == -1) {
            System.out.printf("Você não pode armazenar mais do que 10 pessoas. A pessoa %s não foi adicionada.%n", nome);
            return;
        }

        var pessoa = new Pessoa();
        pessoa.nome = nome;
        pessoa.anoNasc = anoNascimento;
        pessoa.altura = altura;
        this.pessoas[indiceParaGravarAhNovaPessoa] = pessoa;
    }

    void removePessoa(String nome) {
        var indiceDaPessoaARemover = this.buscaPessoa(nome);
        if (indiceDaPessoaARemover > -1) {
            this.pessoas[indiceDaPessoaARemover] = null;
            System.out.printf("A pessoa %s foi removida com sucesso. %n", nome);
        } else {
            System.out.printf("Pessoa %s não encontrada. %n", nome);
        }
    }

    int buscaPessoa(String nome) {
        for (int i = 0; i < this.pessoas.length; i++) {
            if (nome.equals(this.pessoas[i].nome)) {
                return i;
            }
        }

        return -1;
    }

    void imprimeAgenda() {
        for (int i = 0; i < this.pessoas.length; i++) {
            this.imprimePessoa(i);
        }
    }

    void imprimePessoa(int indice) {
        System.out.println(this.pessoas[indice]);
    }
}