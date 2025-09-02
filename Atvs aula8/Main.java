import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Bernardo", "Burdoga"));
        animais.add(new Cachorro("Burdoga", "Bisteca"));
        animais.add(new Gato("Princesa", "Yorkshire"));
        animais.add(new Gato("Lilo", "Heterocromia"));

        for (Animal animal : animais) {
            animal.EmitirSom();
        }

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Chevrolé", "Onix"));
        veiculos.add(new Carro("VolksVagem", "Gou"));
        veiculos.add(new Moto("Kavasaki", "Ninja"));

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
            veiculo.acelerar();
        }

        Funcionario f1 = new Gerente("Bernardo", 2800);
        Funcionario f2 = new Vendedor("Jabulane", 1580);

        f1.calcularBonus();
        f2.calcularBonus();
    }
}
