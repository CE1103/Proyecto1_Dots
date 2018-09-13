package application;
	
import application.game.Game;
import application.data.Data;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Game game;
    public static Scene gameScene = null;


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/firstPane.fxml"));
        Parent gameParent = fxmlLoader.load(getClass().getResource("view/firstPane.fxml"));
        primaryStage.setTitle("DotsCE1103");

        Scene scene = new Scene(gameParent);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
