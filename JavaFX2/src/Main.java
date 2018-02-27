import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Here goes the Title");
        Button button = new Button("Click me!");
        Button button2 = new Button("Click me maybe.");
        //or button.setText("Click me!");
        button.setOnAction(e -> System.out.println("Whats up?"));
        button2.setOnAction(e -> {
                     System.out.println("I am up!");
                     System.out.println("Yes, I am!");
                }
        );

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button, button2);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
