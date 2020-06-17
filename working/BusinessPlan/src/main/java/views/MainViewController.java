package views;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import models.ViewTransitionModelInterface;

public class MainViewController {
	
	ViewTransitionModelInterface model;
	

	  
    public void setModel(ViewTransitionModelInterface newModel)
    {
      model=newModel;
    }
	
	@FXML
	private Button SeePlans;
	
	@FXML
	private Button MakePlan;
	
    
    @FXML
    void onClickMakePlan(ActionEvent event) {
    	model.showEmptyBPView();
    }

    @FXML
    void onClickSeePlans(ActionEvent event) {
    	model.showBPlistView(model);
    }   


}
