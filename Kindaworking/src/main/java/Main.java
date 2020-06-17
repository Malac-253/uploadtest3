import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.ViewTransitionalModelA;
import models.logInModel;
import views.LoginToSystemController;
import views.LoginViewController;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception 
	{
		//logInModel model = new logInModel();
		
		FXMLLoader loader =  new FXMLLoader();
		loader.setLocation(Main.class.getResource("views/LoginView.fxml"));
		BorderPane view = loader.load();
		
		FXMLLoader loader2 =  new FXMLLoader();
		loader2.setLocation(Main.class.getResource("/views/LoginViewSub.fxml"));
		Node subview = loader2.load();
		view.setCenter(subview);
		
		LoginViewController cont = loader.getController();
		LoginToSystemController cont2 = loader2.getController();
		logInModel model = new logInModel(view);
		ViewTransitionalModelA vm = new ViewTransitionalModelA(view,model,cont2);
		//logInModel lm = new logInModel();
		cont.setModel(vm);
		cont2.setModel(model);
		
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();
		

	}
	
	public static void main(String [] args) 
	{
		launch(args);
		
	}

}
