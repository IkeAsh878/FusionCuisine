import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class DishDetailPage {
    private VBox view;

    public DishDetailPage(String name, String description) {
        view = new VBox(10);
        Label nameLabel = new Label("Dish: " + name);
        Label descLabel = new Label("Description: " + description);
        Label ingredientsLabel = new Label("Ingredients: Sushi Rice, Avocado, Taco Shells");

        view.getChildren().addAll(nameLabel, descLabel, ingredientsLabel);
    }

    public VBox getView() {
        return view;
    }
}
