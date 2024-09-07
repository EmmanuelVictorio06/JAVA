import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
        System.out.println("Música adicionada à playlist: " + nome);
    }

    public void removerMusica(Musica musica) {
        if (musicas.remove(musica)) {
            System.out.println("Música removida da playlist: " + nome);
        } else {
            System.out.println("Música não encontrada na playlist: " + nome);
        }
    }

    public void listarMusicas() {
        System.out.println("Músicas na playlist " + nome + ":");
        for (Musica musica : musicas) {
            System.out.println(musica.getDetalhes());
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
}
