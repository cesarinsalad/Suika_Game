package Suika_Game;

public class Suika_Game {

    public static void main(String[] args) {
        InicioJFrame Inicio = new InicioJFrame(); // Crea una instancia del JFrame de inicio.
        Inicio.setVisible(true); // Hace que el JFrame sea visible.
        Inicio.setResizable(false); // No permite que el usuario cambie el tamaño de la ventana.
        Inicio.setTitle("Suika Game"); // Le da un título a la ventana.
        Inicio.setLocationRelativeTo(null); // Hace que el frame aparezca en el centro de la pantalla.
        
        // Crear una nueva lista con capacidad para 10 frutas
        Listas listaDeFrutas = new Listas(10);

        // Crear frutas (Nombre, puntaje, tamaño)
        Frutas parchita = new Frutas("Parchita", 10, 1);
        Frutas patilla = new Frutas("Patilla", 20, 2);
        Frutas pumalaca = new Frutas("Pumalaca", 30, 3);
        Frutas coco = new Frutas("Coco", 40, 4);
        Frutas datil = new Frutas("Cotoperí", 50, 5);
        Frutas cotoperi = new Frutas("Cotoperí", 60, 6);
        Frutas mamey = new Frutas("Mamey", 70, 7);
        Frutas mango = new Frutas("Mango", 80, 8);
        Frutas kiwi = new Frutas("Kiwi", 90, 9);
        Frutas cereza = new Frutas("Cereza", 100, 10);

        // Añadir frutas a la lista
        listaDeFrutas.agregar(parchita);
        listaDeFrutas.agregar(patilla);
        listaDeFrutas.agregar(pumalaca);
        listaDeFrutas.agregar(coco);
        listaDeFrutas.agregar(datil);
        listaDeFrutas.agregar(cotoperi);
        listaDeFrutas.agregar(mamey);
        listaDeFrutas.agregar(mango);
        listaDeFrutas.agregar(kiwi);
        listaDeFrutas.agregar(cereza);        
    }
}
