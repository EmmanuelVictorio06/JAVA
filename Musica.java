public class Musica {
    private String titulo;
    private String artista;
    private double duracao;

    public Musica(String titulo, String artista, double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getDetalhes() {
        return "Titulo: " + titulo + ", Artista: " + artista + ", Duração: " + duracao + " min";
    }

    public String getTitulo() {
        return titulo;
    }
}
