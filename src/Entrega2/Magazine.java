package Entrega2;
import java.util.List;
import java.util.ArrayList;
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