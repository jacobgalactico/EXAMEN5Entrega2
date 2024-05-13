package Entrega3;
import java.util.ArrayList;
import java.util.List;

// Interfaz para el mediador
interface Mediator {
    void notify(String message, Object sender);
}