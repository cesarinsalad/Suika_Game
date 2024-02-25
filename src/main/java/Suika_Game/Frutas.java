package Suika_Game;

// Las propiedades de la fruta: nombre, puntos y tamaño.
public class Frutas {
    private String nombre;
    private int puntos;
    private int tamano;
    
    // Constructor de la clase Frutas. Acepta tres argumentos que se utilizan para inicializar las variables de instancia.
    public Frutas(String nombre, int puntos, int tamano) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.tamano = tamano;
    }
    // Método getter para obtener el nombre de la fruta.
    public String getNombre() {
        return nombre;
    }
    // Método getter para obtener los puntos de la fruta.
    public int getPuntos() {
        return puntos;
    }
    // Método getter para obtener el tamaño de la fruta.
    public int getSize() {
        return tamano;
    }
    
    // Este método se utiliza para fusionar esta fruta con otra
    public Frutas fusion(Frutas other) {
        if (this.nombre.equals(other.nombre)) {
            // POR HACER Retornar una nueva fruta que resulte de la fusión
            // POR HACER implementar la lógica para decidir qué fruta resulta de la fusión
        }
        return null;
    }
}
