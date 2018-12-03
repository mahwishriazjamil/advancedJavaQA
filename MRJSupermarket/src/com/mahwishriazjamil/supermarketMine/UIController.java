package com.mahwishriazjamil.supermarketMine;

import com.mahwishriazjamil.supermarketfx.Controller;
import com.mahwishriazjamil.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class UIController extends Controller{

    @FXML
    private Label label;
    
    @FXML ComboBox<Product> productName;
    @FXML TextField productPriceRate;
    @FXML TextField productQuantity;
    @FXML TextArea offers;
    @FXML TextArea itemsList;
    @FXML TextField numberOfItems;
    @FXML TextField totalPrice;

	@FXML
    private void addProductToShoppingBasket(ActionEvent event) {
    	// get data from controls

    }
	
	@FXML
	private void initialize() {
		productName.setValue("Groceries");
		productName.setItems(productsList);
	}
	
	ObservableList<String> productsList = FXCollections.observableArrayList("Eggs", "Milk");
    	
	
	
}
