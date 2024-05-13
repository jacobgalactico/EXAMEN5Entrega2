package Entrega1;

public class Main {
    public static void main(String[] args) {
        // Usando la fábrica para crear un libro
        MediaFactory bookFactory = new BookFactory();
        Media book = bookFactory.createMedia();
        book.display();

        // Usando la fábrica para crear una revista
        MediaFactory magazineFactory = new MagazineFactory();
        Media magazine = magazineFactory.createMedia();
        magazine.display();

        // Usando la fábrica para crear un periódico
        MediaFactory newspaperFactory = new NewspaperFactory();
        Media newspaper = newspaperFactory.createMedia();
        newspaper.display();
    }
}