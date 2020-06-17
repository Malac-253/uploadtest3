package views;

import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import models.MainViewModel;
import models.ViewTransitionModelInterface;

public class LoginViewController {

	MainViewModel model;
	MainViewController parent;
	BorderPane view;
	
	
    public void setModel(MainViewModel newModel)
    {
      model=newModel;
    }
    
    public void setParent(BorderPane viewM, MainViewController pt)
    {
    	view = viewM;
    	parent = pt;
    }
    
    
    @FXML
    private TextField login;
    
    @FXML
    private TextField pass;
    
    @FXML
    private Button submit;
    
    @FXML
    private Text notPass;
        
    @FXML
    void onClickSubmit(ActionEvent event)
    {    	
    	String username = login.getText();
    	String password = pass.getText();
    	model.client.askForLogin(username, password);
    	if(model.client.getLoginPerson()!=null)
    	{
    		notPass.setOpacity(0);
        	Stage stage0 = (Stage) submit.getScene().getWindow();
    		stage0.close();
        	
        	Scene s = new Scene(view);
        	Stage stage = new Stage();
    		stage.setScene(s);
    		stage.setTitle("BPViewer");
    		stage.show();
    		
    		parent.model.showBPlistView(parent.model);
    	}
    	else
    	{
    		notPass.setOpacity(1);
    	}
    }

 
}
