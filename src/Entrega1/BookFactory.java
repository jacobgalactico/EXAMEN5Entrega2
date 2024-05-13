package Entrega1;

public class BookFactory implements MediaFactory {
    @Override
    public Media createMedia() {
        return new Book();
    }
}