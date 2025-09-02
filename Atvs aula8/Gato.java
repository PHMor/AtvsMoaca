public class Gato extends Animal {
    String raca;
    Gato(String nome, String raca){
        super(nome);
        this.raca = raca;
    }
    @Override
    void EmitirSom(){
        System.out.println("Miauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }
}
