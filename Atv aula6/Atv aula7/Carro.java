class Carro extends Veiculo {
    private String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    @Override
    void mover(double velocidade, double tempo){
        System.out.println("Carro modelo " + this.modelo + " se moveu " + velocidade * tempo + ". VRUMMMMMMMM");
    }
}
