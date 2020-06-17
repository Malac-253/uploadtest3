package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import main.Main;
import views.PlanViewController;
import views.PlanListViewController;

public class MainViewTransitionModel implements ViewTransitionModelInterface {

	BorderPane mainview;
	MainViewModel model;
	public MyRemoteClient client;
	public String name = "MainViewTransitionModel";
	
	public MainViewTransitionModel(MyRemoteClient userclient, BorderPane view,MainViewModel newModel)
	{
		mainview = view;	
		model = newModel;
		client = userclient;
	}

	@Override
	public void showBPlistView(ViewTransitionModelInterface vm) {
		FXMLLoader loader = new FXMLLoader();
	    loader.setLocation(MainViewTransitionModel.class
	        .getResource("../views/PlanListView.fxml"));
	    try {
	      Node view = loader.load();
	      mainview.setCenter(view);
	      PlanListViewController cont = loader.getController();
	      cont.setModel(model,vm);
	      System.out.println(cont.BPList);
	      
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
		
	}
	@Override
	public void showEmptyBPView() {
		FXMLLoader loader = new FXMLLoader();
	    loader.setLocation(MainViewTransitionModel.class
	        .getResource("../views/NewPlanView.fxml"));
	    try {
	      Pane view = loader.load();
	      mainview.setCenter(view);
	      
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	
	@Override
	public void showCopyView(BusinessPlan Plan) {
		System.out.println("Selected Page Clicked");
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainViewModel.class
				.getResource("../views/PlanView.fxml"));
		try {
			BorderPane view = loader.load();
			mainview.setCenter(view);			
			PlanMainModel model = new PlanMainModel(client, view);			
			PlanViewController cont = loader.getController();
			cont.setModel(model);				
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	


	
}
