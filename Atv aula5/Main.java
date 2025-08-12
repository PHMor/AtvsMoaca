import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        Pessoa pessoa1 = new Pessoa(idade,nome);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Daniela");
        nomes.add("Eduardo");

        Random random = new Random();

        int indice = random.nextInt(nomes.size());

        System.out.println("Nome sorteado: " + nomes.get(indice));
     }
}
