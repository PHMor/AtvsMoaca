class Bicicleta extends Veiculo {
    private String marca;
    
    public Bicicleta(String marca){
        this.marca = marca;
    }

    @Override
    void mover(double velocidade, double tempo){
        System.out.println("Bicicleta da marca " + this.marca + " se moveu " + velocidade * tempo + ". ZIUM");
    }
}
