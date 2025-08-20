class Circulo extends Forma {
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    double area(){
        return Math.PI*(this.raio*this.raio);
    }
}
