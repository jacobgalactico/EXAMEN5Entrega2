package Entrega3;
import java.util.ArrayList;
import java.util.List;

public class FavoriteCommand implements Command {
    private Media media;

    public FavoriteCommand(Media media) {
        this.media = media;
    }

    @Override
    public void execute() {
        // Lógica para marcar como favorito el medio
        System.out.println("Marcando como favorito el medio...");
    }
}