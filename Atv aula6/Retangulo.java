class Retangulo extends Forma {
private double largura;
private double altura;
    public Retangulo(String cor, boolean borda, boolean preenchido, double largura, double altura){
        super(cor,borda,preenchido);
        this.largura = largura;
        this.altura = altura;
    }

    double calcularArea(){
        return this.largura * this.altura;
    }
}
