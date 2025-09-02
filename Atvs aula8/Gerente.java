public class Gerente extends Funcionario {
    Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    void calcularBonus(){
        System.out.println("Bonus salarial: " + salario * 0.2);
    }
}
