abstract class Funcionario {
    String nome;
    double salario;
    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    abstract void calcularBonus();
}
