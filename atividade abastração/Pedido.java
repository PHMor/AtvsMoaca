//Atividade 3
public class Pedido {
    Cliente cliente;
    String[] Lista = new String[10];

    void exibirPedido(){
        System.out.println("Cliente: " + cliente + "Pratos:");
        for (int i = 0; i < Lista.length; i++){
            if(Lista[i].equals("")){
            }
            else{
                System.out.println(Lista[i]);
            }
        }
    }
}
