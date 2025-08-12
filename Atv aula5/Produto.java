public class Produto {
    private String nome;
    private float preco;

    public Produto(){
        System.out.println("Produto criado.");
    }

    public Produto(String nome, float preco){
        this.nome = nome;
        if (preco > 0 ){
            this.preco = preco;
        }
        else {
            this.preco = 0;
            System.out.println("Valor invalido.");
        }
    }
}