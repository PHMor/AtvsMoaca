public class Main {
    public static void main(String[] args){
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();

        Cliente cliente1 = new Cliente();

        filme1.genero = "terror";
        filme1.estoque = 3;
        filme1.nome = "Bernardo Beronha";

        filme2.genero = "comedia";
        filme2.estoque = 0;
        filme2.nome = "Bernardo Bizonho";

        cliente1.nome = "GuiBarbosa";
        cliente1.cpf = "123";
        cliente1.idade = 12;

        cliente1.alugarFilme(filme1);
        cliente1.alugarFilme(filme2);
    }
}
