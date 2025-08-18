class Aluno extends Pessoa{
    public String matricula;

    public Aluno(String matricula, String nome){
        super(nome);
        this.matricula = matricula;
    }
}
