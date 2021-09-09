package ExerciciosParte2Classes.Exercicio03;

public class Elevador {
    Integer andarAtual = 0;
    Integer totalAndares;
    Integer capacidade;
    Integer ocupacaoAtual = 0;

    public Elevador(Integer totalAndares, Integer capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    void entrar() {
        if (this.ocupacaoAtual < this.capacidade) {
            this.ocupacaoAtual++;
        } else {
            System.out.println("Elevador com a capacidade maxima.");
        }
    }

    void sair() {
        if (this.ocupacaoAtual > 0) {
            this.ocupacaoAtual--;
        }
    }

    void subir() {
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
        }
    }

    void descer() {
        if (this.andarAtual > 0) {
            this.andarAtual++;
        }
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "andarAtual=" + andarAtual +
                ", totalAndares=" + totalAndares +
                ", capacidade=" + capacidade +
                ", ocupacaoAtual=" + ocupacaoAtual +
                '}';
    }
}
