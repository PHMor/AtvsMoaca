class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String message) {
        super(message);
    }
}

public class IdadeInvalidaExceptionExample {
    public static void cadastrarUsuario(int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("Erro: Usuário menor de 18 anos não pode ser cadastrado!");
        }
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public static void main(String[] args) {
        try {
            cadastrarUsuario(16);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}