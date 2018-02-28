import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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
        window.setTitle("Window 1");

        window.setOnCloseRequest(event -> {
            event.consume();
            closeProgram();
        });

        Button popoutBtn = new Button("Pop out window!");
        popoutBtn.setOnAction(e -> AlertBox.display("Alert Box", "it popped out, great!"));

        Button confirmBtn = new Button("Confirm something!");
        confirmBtn.setOnAction(event -> {
            boolean result = ConfirmBox.confirm("Confirm Box", "Display a joke?");
            if (result)
                System.out.println("add some funny jokes here.");
        });

        Button closeBtn = new Button("Close program!");
        closeBtn.setOnAction(event -> closeProgram());

        VBox layout = new VBox(10, popoutBtn, confirmBtn, closeBtn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
        boolean answer = ConfirmBox.confirm("Exit the program", "Sure you want to exit?");
        if (answer) {
            System.out.println("Something is done before program closes");
            window.close();
        }
    }
}
