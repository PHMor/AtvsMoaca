class Gerente extends Funcionario {
    private String setor;
    public Gerente(String nome, double salario, String setor){
        super(nome,salario);
        this.setor = setor;
    }
    void printGerente(){
        System.out.println("Nome: " + nome + "\nSalario: " + salario + "\nSetor: " + setor);
    }
}
