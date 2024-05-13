package Entrega1;

public class NewspaperFactory implements MediaFactory {
    @Override
    public Media createMedia() {
        return new Newspaper();
    }
}