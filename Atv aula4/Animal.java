public class Animal {
    private String nome;
    private String especie;

    public String setDados(String nome, String especie){
        if (!nome.equals("") && !especie.equals("")){
            this.nome = nome;
            this.especie = especie;
            return "Dados alterados!";
        }
        else{
            return "Dados inválidos";
        }
    }

    public String alterarNome(String nome){
        if (!nome.equals("")){
            this.nome = nome;
            return "Dados alterados!";
        }
        else{
            return "Dados inválidos";
        }
    }

    public String consultarDados(){
        return "Nome: " + nome + "\nEspecie: " + especie;
    }
}
