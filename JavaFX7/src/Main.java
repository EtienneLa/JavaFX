import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Extracting UserInput");

        TextField input = new TextField();
        input.setPromptText("age");

        Button btn = new Button("add age");
        btn.setOnAction(event -> isInt(input, input.getText()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(input, btn);

        Scene scene = new Scene(layout, 300, 200);

        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField input, String text) {
        try{
            int age = Integer.parseInt(text);
            System.out.println("User is: " + age);
            return true;
        }catch(NumberFormatException e){
            System.out.println("Error: " + text + " is not a number.");
            return false;
        }
    }
}
