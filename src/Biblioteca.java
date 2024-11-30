public class Biblioteca <T>{
    private T object ;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "\nBiblioteca " + object.toString();


    }
}
