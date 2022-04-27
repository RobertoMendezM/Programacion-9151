

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class JavaFXCss1 extends Application
{
   
    @Override
    public void start(Stage stage)
    {
       Scene scene = new Scene(new Group(),250,250, Color.web("#0000FF",0.3));
       scene.getStylesheets().add("test.css");
        Rectangle rect = new Rectangle(100,100);
        rect.setLayoutX(20);
        rect.setLayoutY(60);
        rect.getStyleClass().add("miRectangulo");
        ((Group)scene.getRoot()).getChildren().add(rect); 
        
        stage.setTitle("Mi primer css");
        stage.setScene(scene);


        stage.show();
    }
    
    @Override
    public void stop() throws Exception {
        super.stop();
        System.exit(0);
    }
    
    
    public static void main(String[] algo){
        launch();
    }

    
}
