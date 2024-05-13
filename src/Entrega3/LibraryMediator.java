package Entrega3;
import java.util.ArrayList;
import java.util.List;

public class LibraryMediator implements Mediator {
    private List<User> users = new ArrayList<>();
    private StorageService storageService;
    private RecommendationService recommendationService;

    public LibraryMediator(StorageService storageService, RecommendationService recommendationService) {
        this.storageService = storageService;
        this.recommendationService = recommendationService;
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void notify(String message, Object sender) {
        // Manejar la notificación según el mensaje y el remitente
        if (message.equals("NewRelease")) {
            recommendationService.notifyNewRelease((Media) sender);
        }
    }
}
