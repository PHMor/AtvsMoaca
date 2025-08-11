public class Main {
    public static void main(String[] args) {

        System.out.println("Atividade 1");
        Livro livro1 = new Livro();
        livro1.setTitulo("Amigos");
        livro1.setAno(-10);
        livro1.setAno(1999);
        livro1.setAutor("Bernardo Kuster Ragugnetti");

        Aluno aluno1 = new Aluno();
        System.out.println("\nAtividade 2");
        aluno1.setNome("Bernardao");
        System.out.println(aluno1.setNota(8));
        System.out.println(aluno1.retirarNota(2));
        System.out.println(aluno1.printNota());
        System.out.println(aluno1.retirarNota(10));

        System.out.println("\nAtividade 3");
        Animal animal1 = new Animal();
        System.out.println(animal1.setDados("Bistecao", "Peixe baia"));
        System.out.println(animal1.consultarDados());
        System.out.println(animal1.alterarNome("Burro"));
    }
}
