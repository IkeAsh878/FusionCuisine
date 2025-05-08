import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Scene scene = new Scene(root, 800, 600);
        
        HomePage homePage = new HomePage();
        root.getChildren().add(homePage.getView());

        primaryStage.setTitle("Fusion Cuisine App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
