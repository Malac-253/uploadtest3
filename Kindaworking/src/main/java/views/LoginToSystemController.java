package views;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;
import models.logInModel;

public class LoginToSystemController
	{
	
	 	@FXML
	    private TextField loginUsername;

	    @FXML
	    private TextField loginUserPassword;

	    @FXML
	    private Text loginWaring;

		logInModel model;
		
		public void setModel(logInModel newModel) {
			
			model = newModel;
			System.out.println("setModel(logInModel newModel)");
			
			//bind label
			StringConverter<Number> fmt = new NumberStringConverter();
			Bindings.bindBidirectional(loginWaring.textProperty(),model.getLoggedIn2(),fmt);
		}
		
		
	   

	    @FXML
	    void onClickSubmit(ActionEvent event) {
	    	System.out.println("Submit Clicked");
	    	System.out.println(model);
	    	model.tologIn();
	    	System.out.println("isLoggedIn: " + model.isLoggedIn());
	    	System.out.println("toString(): " + model.toString());
	    }

	}
