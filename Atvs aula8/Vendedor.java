public class Vendedor extends Funcionario {
    Vendedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    void calcularBonus(){
        System.out.println("Bonus salarial: " + salario * 0.1);
    }
}
