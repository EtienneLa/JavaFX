import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("ComboBox");
        Button btn = new Button("Submit");

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "A Beautiful Mind",
                "Good Will Huntin",
                "Shining"
        );

        comboBox.setPromptText("What is your favorite movie?");

        comboBox.setOnAction(event -> System.out.println("User selected: " + comboBox.getValue()));

        btn.setOnAction(event -> System.out.println(comboBox.getValue()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, btn);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
