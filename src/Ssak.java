public interface Ssak {
    void glos();
    default void dajGlos(int ilość) {
        for (int i = 0; i <ilość; i++){
            glos();
        }
    }
}
