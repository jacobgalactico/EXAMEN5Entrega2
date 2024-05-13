package Entrega2;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Crear medios individuales
        Book book1 = new Book("El Señor de los Anillos");
        Magazine magazine1 = new Magazine("National Geographic");

        // Crear una colección de medios
        MediaCollection collection = new MediaCollection();
        collection.addMedia(book1);
        collection.addMedia(magazine1);

        // Mostrar la colección de medios
        collection.display();
    }
}