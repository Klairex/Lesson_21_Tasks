public class Carte {
    private String denumire;
    private String autor;
    private int nrDePagini;
    private String gen;


    public Carte(String denumire, String autor,int nrDePagini, String gen) {
        this.denumire = denumire;
        this.autor = autor;
        this.nrDePagini = nrDePagini;
        this.gen = gen;

    }

    @Override
    public String toString() {
        return "Carti : \nDenumire: " + denumire+ "\nAutor: " + autor + "\nGen: " +gen + "\nNumarul de pagini: " + nrDePagini;
    }
}
