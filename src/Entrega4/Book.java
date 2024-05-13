package Entrega4;
import java.util.ArrayList;
import java.util.List;
public class Book implements Media {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Mostrando el libro: " + title);
    }
}