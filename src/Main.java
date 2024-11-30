public class Main {
    public static void main(String[] args) {

        Biblioteca<Carte> carte = new Biblioteca<>();
        Biblioteca<Video> video = new Biblioteca<>();
        Biblioteca<Ziar> ziar = new Biblioteca<>();


        carte.setObject( new Carte("Frankenstein","Mary Shelley",280,"Science fiction"));
        video.setObject(new Video("The Godfather","Francis Ford Coppola",175,"Drama criminala"));
        ziar.setObject(new Ziar("New York Times","01.09.2024",24,"News"));

        System.out.println(carte);
        System.out.println(video);
        System.out.println(ziar);

        BibliotecaNonGeneric carte2  = new BibliotecaNonGeneric();
        BibliotecaNonGeneric video2  = new BibliotecaNonGeneric();
        BibliotecaNonGeneric ziar2  = new BibliotecaNonGeneric();

        carte2.setObject(new Carte("The Hobbit", "J.R.R. Tolkien", 310, "Fantasy"));
        video2.setObject(new Video("The Dark Knight", "Christopher Nolan", 152, "Action, Thriller"));
        ziar2.setObject(new Ziar("The Guardian", "02.09.2024", 30, "World News"));

        System.out.println(carte2);
        System.out.println(video2);
        System.out.println(ziar2);
    }

}
