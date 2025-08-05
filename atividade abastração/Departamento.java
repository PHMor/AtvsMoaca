//Atividade 4
public class Departamento {
    String nome;
    String[] funcionarios = new String[10];

    void adicionarFuncionario(Funcionario funcionario){
        for (int i = 0; i < funcionarios.length; i++){
            if(funcionarios[i] == null){
                funcionarios[i] = funcionario.nome;
            }
            else{
            }
        }
    }
}
