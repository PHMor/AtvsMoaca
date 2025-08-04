public class Passagem {
    int dia;
    int hora;
    int minutos;
    float valor;

    void marcarDestino(Destino destino){
        System.out.println("Destino marcado com sucesso em: " + destino.cidade);
    }
}