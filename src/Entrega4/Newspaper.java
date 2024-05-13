package Entrega4;
import java.util.ArrayList;
import java.util.List;
public class Newspaper implements Media {
    private String title;

    public Newspaper(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Mostrando el periódico: " + title);
    }
}