package Suika_Game;

public class Listas {
    // Un arreglo de objetos Frutas. Este arreglo tiene un tamaño fijo que se establece cuando se crea la lista.
    private final Frutas[] items; 
     // Un contador para llevar la cuenta de cuántos elementos se han añadido a la lista.
    private int cuenta;
    // El constructor de la clase. Acepta un argumento "capacidad" que establece el tamaño del arreglo "items".
    public Listas(int capacidad) {
        items = new Frutas[capacidad];
        cuenta = 0;
    }
    // Método para añadir un objeto Frutas al arreglo. El objeto se añade en la posición actual del contador, y luego el contador se incrementa.
    public void agregar(Frutas item) {
        items[cuenta] = item;
        cuenta++;
    }
    // Método para obtener un objeto Frutas del arreglo por su índice.
    public Frutas get(int indice) {
        return items[indice];
    }
    // Método para obtener el número de elementos que se han añadido a la lista.
    public int size() {
        return cuenta;
    }

}
    