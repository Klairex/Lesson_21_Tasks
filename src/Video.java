public class Video {
    private String denumire;
    private String regizor;
    private int lungimea;
    private String gen;


    public Video(String denumire, String regizor, int lungimea, String gen) {
        this.denumire = denumire;
        this.regizor = regizor;
        this.lungimea = lungimea;
        this.gen = gen;

    }

    @Override
    public String toString() {
        return "Video : \nDenumire: " + denumire+ "\nRegizor: " + regizor + "\nGen: " +gen + "\nLungimea: " + lungimea + " minute";
    }
}
