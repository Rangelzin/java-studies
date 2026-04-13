package LaboratorioGeral.Ex6;

public class Principal {
    public static void main(String[] args) {
        // Criar 10 filmes
        Filme[] filmes = new Filme[10];
        filmes[0] = new Filme("O Poderoso Chefão", 1972, 175, "Clássico do cinema", "Francis Ford Coppola");
        filmes[1] = new Filme("Pulp Fiction", 1994, 154, "Cult", "Quentin Tarantino");
        filmes[2] = new Filme("Interestelar", 2014, 169, "Ficção científica", "Christopher Nolan");
        filmes[3] = new Filme("Clube da Luta", 1999, 139, "Cult", "David Fincher");
        filmes[4] = new Filme("Matrix", 1999, 136, "Revolucionário", "Lana Wachowski");
        filmes[5] = new Filme("Forrest Gump", 1994, 142, "Drama", "Robert Zemeckis");
        filmes[6] = new Filme("Gladiador", 2000, 155, "Épico", "Ridley Scott");
        filmes[7] = new Filme("Titanic", 1997, 194, "Romance", "James Cameron");
        filmes[8] = new Filme("Avatar", 2009, 162, "Visual impressionante", "James Cameron");
        filmes[9] = new Filme("Jurassic Park", 1993, 127, "Aventura", "Steven Spielberg");

        // Criar 10 CDs
        CD[] cds = new CD[10];
        cds[0] = new CD("Thriller", 1982, 42, "Álbum icônico", "Michael Jackson", 9);
        cds[1] = new CD("The Dark Side of the Moon", 1973, 43, "Prog rock", "Pink Floyd", 10);
        cds[2] = new CD("Abbey Road", 1969, 47, "Clássico", "The Beatles", 17);
        cds[3] = new CD("Back in Black", 1980, 42, "Rock", "AC/DC", 10);
        cds[4] = new CD("Rumours", 1977, 40, "Fleetwood Mac", "Fleetwood Mac", 11);
        cds[5] = new CD("Nevermind", 1991, 42, "Grunge", "Nirvana", 13);
        cds[6] = new CD("The Joshua Tree", 1987, 50, "Rock alternativo", "U2", 11);
        cds[7] = new CD("Hotel California", 1976, 43, "Rock clássico", "Eagles", 9);
        cds[8] = new CD("21", 2011, 48, "Pop", "Adele", 11);
        cds[9] = new CD("Bad", 1987, 48, "Pop", "Michael Jackson", 10);

        // Criar 10 jogos
        Jogo[] jogos = new Jogo[10];
        jogos[0] = new Jogo("The Witcher 3", 2015, 100, "RPG", 1, "PC/PS4/Xbox");
        jogos[1] = new Jogo("Red Dead Redemption 2", 2018, 60, "Ação-aventura", 1, "PC/PS4/Xbox");
        jogos[2] = new Jogo("Minecraft", 2011, 0, "Sandbox", 4, "Multiplataforma");
        jogos[3] = new Jogo("Grand Theft Auto V", 2013, 31, "Ação-aventura", 1, "PC/PS4/Xbox");
        jogos[4] = new Jogo("The Legend of Zelda: Breath of the Wild", 2017, 50, "Ação-aventura", 1, "Switch");
        jogos[5] = new Jogo("God of War", 2018, 20, "Ação-aventura", 1, "PS4");
        jogos[6] = new Jogo("Super Mario Odyssey", 2017, 12, "Plataforma", 2, "Switch");
        jogos[7] = new Jogo("Portal 2", 2011, 8, "Quebra-cabeça", 2, "PC/PS3/Xbox");
        jogos[8] = new Jogo("Half-Life 2", 2004, 13, "FPS", 1, "PC");
        jogos[9] = new Jogo("Among Us", 2018, 0, "Social", 10, "Multiplataforma");

        // Criar vetor com todos os itens
        Item[] todosItens = new Item[30];
        System.arraycopy(filmes, 0, todosItens, 0, 10);
        System.arraycopy(cds, 0, todosItens, 10, 10);
        System.arraycopy(jogos, 0, todosItens, 20, 10);

        // Percorrer o vetor mostrando os dados
        System.out.println("=== TODOS OS ITENS ===");
        for (int i = 0; i < todosItens.length; i++) {
            System.out.println("Item " + (i + 1) + ": " + todosItens[i].toString());

            // Se for jogo, mostrar plataforma separadamente
            if (todosItens[i] instanceof Jogo) {
                Jogo jogo = (Jogo) todosItens[i];
                System.out.println("  Plataforma do jogo: " + jogo.getPlataforma());
            }
            System.out.println();
        }
    }
}