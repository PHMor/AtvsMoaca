//Atividade 7
public class Reserva {
    Quarto quarto;
    Hospede hospedebonito;
    String dataentrada;
    String datasaida;

    void exibirDados(){
        System.out.println("Quarto: " + quarto + "\nHospede: " + hospedebonito.nome + "\nData de entrada: " + dataentrada);
    }
}
