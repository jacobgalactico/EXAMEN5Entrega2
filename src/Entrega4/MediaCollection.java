package Entrega4;
import java.util.ArrayList;
import java.util.List;
public class MediaCollection implements Media {
    private List<Media> mediaList = new ArrayList<>();

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    @Override
    public void display() {
        for (Media media : mediaList) {
            media.display();
        }
    }
}
