//Atividade 4
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();
        Departamento departamento1 = new Departamento();
        departamento1.adicionarFuncionario(funcionario1);
        departamento1.adicionarFuncionario(funcionario2);
        departamento1.adicionarFuncionario(funcionario3);

        //Atividade 9

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.nome = "Toby";
        animal1.especie = "Cachorro";
        animal1.idade = 12;

        animal2.nome = "Princesa";
        animal2.especie = "Gato";
        animal2.idade = 4;

        animal1.fazerBarulho();
        animal2.fazerBarulho();
    }
}
