package heranca3;

public class Main {

    public static void main(String[] args) {
        Video v = new Video("Video generico", "Francisco da silva", 2022, 30);

        Filme f = new Filme("Aventura", "Sun films", "Aventuras nos alpes", "Joana da silva", 2000, 120);

        Episodio e = new Episodio(12, 1, "Tecnologias perigosas", "Joaquim da silva", 2010, 100);

        v.tocar();
        f.tocar();
        e.tocar();

        Video referencia1 = f;
        referencia1.tocar();

        Video referencia2 = new Episodio(2, 1, "Serie classica", "Gustavo", 2023, 200);
        referencia2.tocar();

        Video[] playlist = new Video[5];
        playlist[0] = v; // um vídeo genérico
        playlist[1] = f; // um filme
        playlist[2] = e; // um episódio
        playlist[3] = referencia2; //outro episódio
        playlist[4] = new Filme("Drama", "Pixar", "Filme clássico", "José da silva", 1970, 130);

        System.out.println("Tocando playlist: ");
        for (int i = 0; i < playlist.length; i++) {
            //não importa se é vídeo, filme ou episódio, dê o play!
            playlist[i].tocar();
        }
    }

}
