public class Cachorro extends Animal {
    String raca;
    Cachorro(String nome, String raca){
        super(nome);
        this.raca = raca;
    }
    @Override
    void EmitirSom(){
        System.out.println("Au au au");
    }
}
