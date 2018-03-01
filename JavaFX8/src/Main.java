import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
        window.setTitle("CheckBox");

        //CheckBoxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tomato");
        CheckBox box3 = new CheckBox("Tuna");
        box2.setSelected(true);

        Button btn = new Button("Order Now!");
        btn.setOnAction(event -> handleOptions(box1, box2, box3));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1, box2, box3 ,btn);

        Scene scene = new Scene(layout, 300, 200);

        window.setScene(scene);
        window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2, CheckBox box3) {
        String text = "Users Order:\n";

        if(box1.isSelected())
            text += "Bacon\n";
        if(box2.isSelected())
            text += "Tomato\n";
        if(box3.isSelected())
            text += "Tuna\n";

        System.out.println(text);
    }
}
