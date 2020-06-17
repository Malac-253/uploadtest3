package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import views.PlanViewController;

public class MainViewModel{

	public MyRemoteClient client;
	public BorderPane mainview;
	public String name = "MainViewModel";

	public MainViewModel(MyRemoteClient currclient, BorderPane view) {
		this.client=currclient;
		this.mainview=view;
	}
	
	//switch to BPMainView window
	public void showCopyView() {
		System.out.println("Selected Page Clicked");
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainViewModel.class
				.getResource("../views/PlanView.fxml"));
		try {
			BorderPane view = loader.load();
		    mainview.setCenter(view);
			
		    //System.out.println("herreeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
			//BorderPane view = loader.load();
			//System.out.println(client.getCurrentBP());
			
			PlanMainModel model = new PlanMainModel(client, view);
			PlanViewController cont = loader.getController();

			cont.setModel(model);
			mainview.setCenter(view);
			//Stage stage = new Stage();
			//Scene s = new Scene(view);
			//stage.setScene(s);
			//stage.setTitle("BPViewer");
			//stage.show();
				
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void trash() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
