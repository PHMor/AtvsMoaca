public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array!");
        }
    }
}
