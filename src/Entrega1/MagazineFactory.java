package Entrega1;

public class MagazineFactory implements MediaFactory {
    @Override
    public Media createMedia() {
        return new Magazine();
    }
}