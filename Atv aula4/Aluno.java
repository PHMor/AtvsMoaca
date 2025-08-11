public class Aluno {
    private float nota;
    private String nome;

    public String setNota(float nota){
        if (nota < 10 && nota >= 0){
            this.nota = nota;
            return "Nota alterada";
        }
        else{
            return "Nota invalida";
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String retirarNota(float nota){
        if(nota < this.nota){
            this.nota -= nota;
            return "Nota retirada";
        }
        else{
            return "Nota muito pequena";
        }
    }
    public String printNota(){
        return "Nota do aluno " + nome + ":" + nota;
    }
}
