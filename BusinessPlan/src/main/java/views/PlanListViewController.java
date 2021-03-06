package views;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import models.BusinessPlan;
import models.MainViewModel;
import models.ViewTransitionModelInterface;

public class PlanListViewController {

	MainViewModel model; 
	ViewTransitionModelInterface supermodel;
	public ObservableList<BusinessPlan> BPList= FXCollections.observableArrayList();
	
    public void setModel(MainViewModel newModel,ViewTransitionModelInterface vm)
    {
      model=newModel;
      supermodel=vm;
      ArrayList<BusinessPlan> Dulplicate=model.client.askForAllBP();
		for (int i=0; i<Dulplicate.size();i++){
			BPList.add(Dulplicate.get(i));
		}
		
		PlanList.setItems(BPList);
      
    }

    @FXML
    private Button view;

    @FXML
    private ListView<BusinessPlan> PlanList;
    
    @FXML
    void onClickCopy(ActionEvent event) {
    	BusinessPlan clickedBP=PlanList.getSelectionModel().getSelectedItem();
    	//System.out.println("Copy Clicked on " + clickedBP);
    	
    	if(clickedBP!=null) {
    		//set selected BP to currentBP
    		model.client.askForBP(clickedBP.year);
    		System.out.println(model.client.getCurrentBP());
    		//close current BPList window
    		//Stage stage = (Stage) copy.getScene().getWindow();
    		//stage.close();
    		//show BPMainView wind
    		System.out.println("herreeeeeeeeeeeeeee@@@@@2222222222222222222222222222222");
    		
    		supermodel.showCopyView(model.client.getCurrentBP()); 
        }
    }
    
}
