package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import views.LoginToSystemController;
import views.LoginViewController;

public class ViewTransitionalModelA implements ViewTransitionModelInterface {

	BorderPane mainview;
	logInModel Model;
	LoginToSystemController cont2;
	
	public ViewTransitionalModelA(BorderPane view,logInModel newModel,LoginToSystemController cont23)
	{
		mainview = view;
		Model = newModel;
		cont2 = cont23;
	}
	
	@Override
	public void showAbout() {
		FXMLLoader loader =  new FXMLLoader();
		loader.setLocation(ViewTransitionalModelA.class.getResource("../views/AboutPageView.fxml"));
		System.out.println(Model);
		cont2.setModel(Model);
		try {
			Pane view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	@Override
	public void showHelp() {
		FXMLLoader loader =  new FXMLLoader();
		loader.setLocation(ViewTransitionalModelA.class.getResource("../views/RedirectPage.fxml"));
		System.out.println(Model);
		cont2.setModel(Model);
		try {
			Pane view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showContact() {
		FXMLLoader loader =  new FXMLLoader();
		loader.setLocation(ViewTransitionalModelA.class.getResource("../views/RedirectPage.fxml"));
		System.out.println(Model);
		
		
		try {
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showLogIn() {
		FXMLLoader loader =  new FXMLLoader();
		loader.setLocation(ViewTransitionalModelA.class.getResource("../views/LoginViewSub.fxml"));
		System.out.println(Model);
		
		FXMLLoader loader2 =  new FXMLLoader();
		loader2.setLocation(ViewTransitionalModelA.class.getResource("../views/LoginViewSub.fxml"));
		cont2 = loader2.getController();
		cont2.setModel(Model);
		
		
		try {
			Node view = loader.load();
			mainview.setCenter(view);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
