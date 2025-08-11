public class Livro{
    private String titulo;
    private String autor;
    private int ano;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        if (titulo != null && !titulo.equals("")){
            this.titulo = titulo;
        }
        else{
            System.out.println("Titulo invalido");
        }
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        if (autor != null && !autor.equals("")){
            this.autor = titulo;
        }
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        if (ano > 0){
            this.ano = ano;
        }
        else{
            System.out.println("Ano invalido.");
        }
    }
}