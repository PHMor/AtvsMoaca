class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String message) {
        super(message);
    }
}

public class DivisaoPorZeroExceptionExample {
    public static int dividir(int a, int b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException("Erro: Divisão por zero não permitida!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(dividir(10, 0));
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}