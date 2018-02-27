import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Stage window = primaryStage;
        window.setTitle("Window 1");

        Button btn = new Button("Pop out window!");
        btn.setOnAction(e -> AlertBox.display("Alert Box", "it popped out, great!"));

        StackPane layout = new StackPane(btn);

        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }
}
