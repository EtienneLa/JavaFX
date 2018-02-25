import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    private Button button;
    private Button button2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Here goes the Title");
        button = new Button("Click me!");
        button2 = new Button("Click me maybe.");
        //or button.setText("Click me!");
        button.setOnAction(this);
        button2.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button, button2);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == button) {
            System.out.println("Hey there, button 2 is up!");
            button.toBack();
        }
        if(event.getSource() == button2) {
            System.out.println("Whats up?");
            button.toFront();
        }
    }
}
