public class Ziar {
    private String denumire;
    private String data;
    private int nrDePagini;
    private String gen;

    public Ziar(String denumire, String data, int nrDePagini, String gen){
        this.denumire = denumire;
        this.data = data;
        this.nrDePagini = nrDePagini;
        this.gen = gen;


    }

    @Override
    public String toString() {
        return "Ziare : \nDenumire: " + denumire+ "\nData ziarului: " + data + "\nGen: " +gen + "\nNr de pagini: " + nrDePagini;
    }


}
