import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Atividade 1
        List<Forma> minhasFormas = new ArrayList<>();
        minhasFormas.add(new Circulo(10));
        minhasFormas.add(new Retangulo(2, 4));
        minhasFormas.add(new Circulo(5.5));
        minhasFormas.add(new Retangulo(10, 5));
        minhasFormas.add(new Circulo(1));
        minhasFormas.add(new Retangulo(7.5, 3));
        double somaDasAreas = 0;
        for (Forma forma : minhasFormas) {
            somaDasAreas += forma.area();
        }
        System.out.printf("A soma total de todas as áreas é: %.2f\n", somaDasAreas);

        //Atividade 2
        Veiculo carro1 = new Carro("Clio");
        Veiculo carro2 = new Carro("Astra");
        Veiculo carro3 = new Carro("Palio");
        carro1.mover(10, 20);
        carro2.mover(20, 5);
        carro3.mover(5, 5);

        Veiculo bicicleta1 = new Bicicleta("Caloi");
        Veiculo bicicleta2 = new Bicicleta("Viking");
        Veiculo bicicleta3 = new Bicicleta("Oggi");
        bicicleta1.mover(2, 3);
        bicicleta2.mover(4, 3);
        bicicleta3.mover(5, 2);

        //Atividade 3
        Produto p1 = new Produto("Detergente", 10.50, 10);

        System.out.println(p1);
    }
}
