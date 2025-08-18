public class Main {
    public static void main(String[] args) {
        //Atividade 1
        Gerente gerente1 = new Gerente("bernardo", 1.5, "descarregar caminhao");
        gerente1.printGerente();

        //Atividade 2
        Retangulo retagulo1 = new Retangulo("vermelho", true, false, 10, 20);
        Circulo circulo1 = new Circulo("Azul", false, true, 20);
        System.out.println("Area do retangulo: " + retagulo1.calcularArea());
        System.out.println("Area do circulo: " + circulo1.calcularArea());

        //Atividade 3
        Aluno aluno1 = new Aluno("18284929", "Bistecao");
        System.out.println("Nome do aluno1: " + aluno1.nome);
        System.out.println("Matricula aluno1: " + aluno1.matricula);
    }
}
