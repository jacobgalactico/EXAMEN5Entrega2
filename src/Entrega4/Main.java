package Entrega4;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos medios digitales
        Book book1 = new Book("El Señor de los Anillos");
        Magazine magazine1 = new Magazine("National Geographic");
        Newspaper newspaper1 = new Newspaper("The New York Times");

        // Crear una colección de medios
        MediaCollection collection = new MediaCollection();
        collection.addMedia(book1);
        collection.addMedia(magazine1);
        collection.addMedia(newspaper1);

        // Mostrar la colección de medios
        collection.display();
    }
}
