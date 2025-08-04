public class Cliente {
    String nome;
    String cpf;
    int idade;

    void comprarPassagem(Passagem passagem) {
        System.out.println("Passagem comprada no valor de " + passagem.valor + 
                   " no dia " + passagem.dia + 
                   " às " + passagem.hora + 
                   ":" + passagem.minutos);
    }

    
}