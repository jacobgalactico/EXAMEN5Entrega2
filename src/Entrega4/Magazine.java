package Entrega4;
import java.util.ArrayList;
import java.util.List;
public class Magazine implements Media {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Mostrando la revista: " + title);
    }
}