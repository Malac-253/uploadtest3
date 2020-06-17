package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.ViewTransitionModelInterface;

public class LoginViewController {

	ViewTransitionModelInterface model;
	
	
	public void setModel(ViewTransitionModelInterface newModel) {
		model = newModel; 
	}
	
    @FXML
    void onClickAbout(ActionEvent event) {
    	model.showAbout();
    	System.out.println("About Clicked");
    }

    @FXML
    void onClickContact(ActionEvent event){
    	model.showContact();
    	System.out.println("Contact Clicked");
    }

    @FXML
    void onClickSignIn(ActionEvent event) {
    	model.showLogIn() ;
    	System.out.println("Sign In Clicked");
    }

    @FXML
    void onClickHelp(ActionEvent event) {
    	model.showHelp();
    	System.out.println("Help Clicked");
    }


}


