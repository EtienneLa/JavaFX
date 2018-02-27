import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        Label label1 = new Label("First Scene!");
        Button btn1 = new Button("Go to Scene 2");
        btn1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);                    //space them out by 20pxl with this parameter
        layout1.getChildren().addAll(label1, btn1);
        scene1 = new Scene(layout1, 300, 300);

        Label label2 = new Label("Second Scene!");
        Button btn2 = new Button("Go to Scene 1");
        btn2.setOnAction(e -> window.setScene(scene1));

        VBox layout2 = new VBox(40);
        layout2.getChildren().addAll(label2, btn2);
        scene2 = new Scene(layout2, 400, 400);

        window.setScene(scene1);
        window.setTitle("Great Program");
        window.show();
    }
}
