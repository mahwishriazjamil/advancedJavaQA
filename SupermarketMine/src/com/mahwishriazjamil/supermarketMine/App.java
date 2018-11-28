package com.mahwishriazjamil.supermarketMine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception{
		// takes in the XML for formatting
		Parent root = FXMLLoader.load(getClass().getResource("SupermarketUI.fxml"));
		
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
