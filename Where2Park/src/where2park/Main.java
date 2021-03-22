/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package where2park;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.json.JSONArray;

/**
 *
 * @author Nora
 */
public class Main extends Application {
    
   private ComboBox comboBox;

    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage stage) throws IOException {
        
  


  this.comboBox = new ComboBox();
  
        GridPane root = new GridPane();

        Button btn = new Button("Data");
        btn.setOnAction(e -> {
            JSONData jsonData = new JSONData();
            

        });
        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();

        root.add(btn, 0, 0);
    }
    

}
