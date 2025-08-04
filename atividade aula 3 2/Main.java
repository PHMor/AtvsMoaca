public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Passagem passagem1 = new Passagem();
        Passagem passagem2 = new Passagem();
        Destino destino1 = new Destino();
        Destino destino2 = new Destino();

        destino1.cidade = "Guarapuava";
        destino1.terminal = "Santa Sé";
        destino2.cidade = "Prudentopolis";
        destino2.terminal = "São João";
        
        passagem1.dia = 12;
        passagem1.hora = 4;
        passagem1.minutos = 30;
        passagem1.valor = 120;

        passagem2.dia = 22;
        passagem2.hora = 16;
        passagem2.minutos = 15;
        passagem2.valor = 150;

        cliente1.nome = "Bernardo";
        cliente1.cpf = "123.456.789-10";
        cliente1.idade = 19;

        cliente2.nome = "Gui Barbosa";
        cliente2.cpf = "123.456.789-20";
        cliente2.idade = 21;

        cliente1.comprarPassagem(passagem1);
        destino2.alterarCidade("Maringá");
    }
}
