import javafx.application.Application;
import javafx.geometry.Pos;
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

        Button popoutBtn = new Button("Pop out window!");
        popoutBtn.setOnAction(e -> AlertBox.display("Alert Box", "it popped out, great!"));

        Button confirmBtn = new Button("Confirm something!");
        confirmBtn.setOnAction(event -> {
            boolean result = ConfirmBox.confirm("Confirm Box", "Display a joke?");
            if (result)
                System.out.println("add some funny jokes here.");
        });

        VBox layout = new VBox(10, popoutBtn, confirmBtn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }
}
