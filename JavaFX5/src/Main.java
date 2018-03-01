import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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
        window.setTitle("Embedding Layouts");

        HBox topMenu = new HBox();
        Button btnA = new Button("A");
        Button btnB = new Button("B");
        Button btnC = new Button("C");
        topMenu.getChildren().addAll(btnA, btnB, btnC);

        VBox leftMenu = new VBox();
        Button btnD = new Button("D");
        Button btnE = new Button("E");
        Button btnF = new Button("F");
        leftMenu.getChildren().addAll(btnD, btnE, btnF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 300, 200);
        window.setScene(scene);

        window.show();
    }
}
