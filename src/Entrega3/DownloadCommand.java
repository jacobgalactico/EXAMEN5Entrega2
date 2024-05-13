package Entrega3;
import java.util.ArrayList;
import java.util.List;
import Entrega4.Media;
public class DownloadCommand implements Command {
    private Media media;

    public DownloadCommand(Media media) {
        this.media = media;
    }

    @Override
    public void execute() {
        // Lógica para descargar el medio
        System.out.println("Descargando el medio...");
    }
}