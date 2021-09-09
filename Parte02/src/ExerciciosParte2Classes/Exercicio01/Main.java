package ExerciciosParte2Classes.Exercicio01;

import ExerciciosParte2Classes.Exercicio02.Agenda;

public class Main {
    public static void main(String[] args) {
        var pessoa=new Pessoa();

        pessoa.altura=1.79f;
        pessoa.anoNasc=1991;
        pessoa.nome="Raphael";
        pessoa.imprimeDados();
        pessoa.idadeCorrente();
    }
}
