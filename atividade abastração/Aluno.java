//Atividade 2
public class Aluno {
    String nome;
    String matricula;
    float[] notas = new float[4];

    void adicionarNota(float nota) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 0.0f) {
                notas[i] = nota;
                return;
            }
        }
    };

    float calcularMedia(){
        float media = 0.0f;
        for (int i = 0; i < notas.length; i++){
            media += notas[i];
        }
        media = media/notas.length;
        return media;
    }

    void exibirBoletim(){
        System.out.println("Nota 1: " + notas[0] + "\nNota 2: " + notas[1] + "\nNota 3: " + notas[2] + "\nNota 4: " + notas[3]);
    }
}

