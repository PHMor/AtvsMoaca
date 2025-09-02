abstract class Veiculo {
    String marca;
    String modelo;

    Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    abstract void acelerar();
    public void exibirDados(){
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
    }
}
