public class Produto {
    protected String nome;
    protected double preco;
    protected int qnt;

    public Produto(String nome, double preco, int qnt){
        this.nome = nome;
        this.preco = preco;
        this.qnt = qnt;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nPreco: " + preco + "\nQuantidade: " + qnt;
    }
}
