import java.util.Scanner;

public class AplicacaoSpotify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("João", "joao@example.com");

        Musica musica1 = new Musica("Song A", "Artist A", 3.5);
        Musica musica2 = new Musica("Song B", "Artist B", 4.0);

        while (true) {
            System.out.println("\n----------Menu:------------");
            System.out.println("1. Criar Playlist");
            System.out.println("2. Listar Playlists");
            System.out.println("3. Adicionar Música à Playlist");
            System.out.println("4. Remover Música da Playlist");
            System.out.println("5. Reproduzir Música");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome da nova playlist: ");
                    String nomePlaylist = scanner.nextLine();
                    usuario.criarPlaylist(nomePlaylist);
                    break;
                case 2:
                    usuario.listarPlaylists();
                    break;
                case 3:
                    System.out.print("Nome da playlist para adicionar música: ");
                    String nomePlaylistAdd = scanner.nextLine();
                    usuario.adicionarMusicaPlaylist(nomePlaylistAdd, musica1); // Usando musica1 como exemplo
                    break;
                case 4:
                    System.out.print("Nome da playlist para remover música: ");
                    String nomePlaylistRemove = scanner.nextLine();
                    usuario.removerMusicaPlaylist(nomePlaylistRemove, musica1); // Usando musica1 como exemplo
                    break;
                case 5:
                    usuario.reproduzirMusica(musica2); // Usando musica2 como exemplo
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
