import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HomePage {
    private VBox view;

    public HomePage() {
        view = new VBox(10);
        Label title = new Label("Fusion Cuisine Dishes");

        // Example Dish Card
        Button dish1Button = new Button("Sushi Tacos");
        dish1Button.setOnAction(e -> showDishDetails("Sushi Tacos", "Japanese-Mexican Fusion"));

        view.getChildren().addAll(title, dish1Button);
    }

    public VBox getView() {
        return view;
    }

    private void showDishDetails(String name, String description) {
        DishDetailPage detailPage = new DishDetailPage(name, description);
        view.getChildren().setAll(detailPage.getView());
    }
}
