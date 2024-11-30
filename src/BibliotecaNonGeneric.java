public class BibliotecaNonGeneric {
    private Object object ;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "\nBiblioteca non generica " + object.toString();


    }
}
