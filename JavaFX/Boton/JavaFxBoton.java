/**
 * Ejemplo de BlueJ
 * 
 * javafx que pone un botón e incrementa 
 * el contador al presionarlo
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFxBoton extends Application
{
   
    private int count = 0;
    private Label myLabel = new Label("0");

 
    @Override
    public void start(Stage stage)
    {

        Button myButton = new Button("Count");

 
        GridPane pane = new GridPane();
        
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(300, 300);
        pane.setVgap(10);
        pane.setHgap(10);

       
        myButton.setOnAction(this::buttonClick);

        
        pane.add(myLabel, 1, 0);
        pane.add(myButton, 0, 0);


        Scene scene = new Scene(pane, 300,100);
        stage.setTitle("Botón con javafx");
        stage.setScene(scene);

        stage.show();
    }
    
    @Override
    public void stop() throws Exception {
        super.stop();
        System.exit(0);
    }

    private void buttonClick(ActionEvent event)
    {
        count = count + 1;
        myLabel.setText(Integer.toString(count));
    }
    
    public static void main(String[] algo){
        launch();
    }

}
