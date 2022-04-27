import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;


public class JavaFxBasico2 extends Application{
    public void start(Stage stage){
        
        Group root = new Group();
        Scene escena = new Scene(root, 300,250, Color.web("#0000FF",0.3));
        stage.setScene(escena);
       
        stage.show();

    }
    
    @Override
    public void stop() throws Exception {
        super.stop();
        System.exit(0);
    }
}