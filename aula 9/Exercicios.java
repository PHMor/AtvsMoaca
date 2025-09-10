interface FormaGeometrica {
    double calcularArea();
}

class Circulo implements FormaGeometrica {
    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Retangulo implements FormaGeometrica {
    private double largura;
    private double altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

interface Autenticavel {
    boolean autenticar(String senha);
}

class Usuario implements Autenticavel {
    private String senhac;

    Usuario(String senha) {
        this.senhac = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return senhac.equals(senha);
    }
}

class Administrador implements Autenticavel {
    private String senhac;

    Administrador(String senhac) {
        this.senhac = senhac;
    }

    @Override
    public boolean autenticar(String senha) {
        return senhac.equals(senha);
    }
}

interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    private String conteudo;

    Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println(conteudo);
    }
}

class Recibo implements Imprimivel {
    private double valor;

    Recibo(double valor) {
        this.valor = valor;
    }

    @Override
    public void imprimir() {
        System.out.println("Recibo valor = R$" + valor);
    }
}

public class Exercicios {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(5.0);
        FormaGeometrica retangulo = new Retangulo(4.0, 6.0);
        System.out.println(circulo.calcularArea());
        System.out.println(retangulo.calcularArea());

        Autenticavel usuario = new Usuario("1234");
        Autenticavel admin = new Administrador("123456");
        System.out.println(usuario.autenticar("1234"));
        System.out.println(admin.autenticar("123456"));
        System.out.println(admin.autenticar("1234"));

        Imprimivel relatorio = new Relatorio("Bernardao daooooora");
        Imprimivel recibo = new Recibo(150.0);
        relatorio.imprimir();
        recibo.imprimir();
    }
}