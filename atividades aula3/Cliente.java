public class Cliente {
    String nome;
    String cpf;
    int idade;

    Filme filme;

    void alugarFilme(Filme filmeAlugado) {
        if (filmeAlugado.estoque > 0){
            filmeAlugado.estoque--;
        System.out.println("Filme alugado");}
        else {
            System.out.println("Sem estoque");
        }
    }

    
}
