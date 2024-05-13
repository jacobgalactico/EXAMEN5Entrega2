package Entrega3;
import java.util.ArrayList;
import java.util.List;

public class LibraryUser implements User {
    private Mediator mediator;

    public LibraryUser(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.addUser(this);
    }

    @Override
    public void borrowMedia(Media media) {
        // Lógica para solicitar prestado un medio digital
        System.out.println("Solicitando prestado el medio...");
    }

    public void receiveNotification(String message, Object sender) {
        // Lógica para manejar la notificación recibida del mediador
        System.out.println("Notificación recibida: " + message);
    }
}