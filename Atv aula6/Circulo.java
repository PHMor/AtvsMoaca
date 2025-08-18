class Circulo extends Forma {
private double raio;
    public Circulo(String cor, boolean borda, boolean preenchido, double raio){
        super(cor,borda,preenchido);
        this.raio = raio;
    }

    double calcularArea(){
        return Math.PI*(raio*raio);
    }
}
