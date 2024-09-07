import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private List<Playlist> playlists;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.playlists = new ArrayList<>();
    }

    public void criarPlaylist(String nome) {
        playlists.add(new Playlist(nome));
        System.out.println("Playlist criada: " + nome);
    }

    public void listarPlaylists() {
        System.out.println("Playlists de " + nome + ":");
        for (int i = 0; i < playlists.size(); i++) {
            System.out.println((i + 1) + ". " + playlists.get(i).getNome());
        }
    }

    public void adicionarMusicaPlaylist(String nomePlaylist, Musica musica) {
        for (Playlist playlist : playlists) {
            if (playlist.getNome().equalsIgnoreCase(nomePlaylist)) {
                playlist.adicionarMusica(musica);
                return;
            }
        }
        System.out.println("Playlist não encontrada.");
    }

    public void removerMusicaPlaylist(String nomePlaylist, Musica musica) {
        for (Playlist playlist : playlists) {
            if (playlist.getNome().equalsIgnoreCase(nomePlaylist)) {
                playlist.removerMusica(musica);
                return;
            }
        }
        System.out.println("Playlist não encontrada.");
    }

    public void reproduzirMusica(Musica musica) {
        System.out.println("Reproduzindo: " + musica.getDetalhes());
    }
}
