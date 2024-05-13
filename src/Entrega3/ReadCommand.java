package Entrega3;
import java.util.ArrayList;
import java.util.List;

public class ReadCommand implements Command {
    private Media media;

    public ReadCommand(Media media) {
        this.media = media;
    }

    @Override
    public void execute() {
        // Lógica para leer el medio
        System.out.println("Leyendo el medio...");
    }
}