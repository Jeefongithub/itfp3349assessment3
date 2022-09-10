package itfp3349.assessment3;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class Assessment3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("About Me by JavaFX");
        GridPane grid = new GridPane();
        
        ImageView picture = new ImageView("jeff.jpg");
        picture.setFitHeight(500);
        picture.setFitWidth(500);        
        grid.add(picture, 1, 0);
        
        ImageView pool = new ImageView("pool.jpg");
        pool.setFitHeight(500);
        pool.setFitWidth(500);
        grid.add(pool, 0, 1);       

        
        Text name = new Text("Jeff Mazzie");
        name.setFont(Font.font("Helvetica",25));
        GridPane.setHalignment(name, HPos.CENTER);
        grid.add(name, 0, 0);
        
        Text food = new Text("Pasta");        
        food.setFont(Font.font("Ubuntu",25));
        GridPane.setHalignment(food, HPos.CENTER);
        grid.add(food, 1, 1);

        Scene scene = new Scene(grid, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}