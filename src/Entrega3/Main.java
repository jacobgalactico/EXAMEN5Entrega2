package Entrega3;

public class Main {
    public static void main(String[] args) {
        // Crear un medio digital
        Media book = new Book("El Señor de los Anillos");

        // Crear un usuario y un mediador
        Mediator mediator = new LibraryMediator(new StorageService(), new RecommendationService());
        User user = new LibraryUser(mediator);

        // Solicitar prestado un medio
        user.borrowMedia(book);

        // Simular una notificación de nuevo lanzamiento
        mediator.notify("NewRelease", book);
    }
}
