package vue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage) {
        VBoxRoot root = new VBoxRoot();
        Scene scene = new Scene(root,800,400);
        stage.setScene(scene);
        stage.setTitle("A.P.P.L.I");
        stage.show();
    }
}
