package main;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FLISPGUI {

    public FLISPGUI(Stage primaryStage, Parent root) {
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
    }

}
