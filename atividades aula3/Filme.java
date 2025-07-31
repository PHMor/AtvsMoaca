public class Filme{
    String genero;
    String nome;
    int estoque;

    void devolverFilme() {
        estoque++;
        System.out.println("Filme devolvido");
    }
}