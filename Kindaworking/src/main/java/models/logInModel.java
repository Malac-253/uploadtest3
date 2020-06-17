package models;

import java.io.IOException;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class logInModel 
{
	//Testing
	ObservableList <TempBP> listBP = FXCollections.observableArrayList();
	DoubleProperty size = new SimpleDoubleProperty(1);
	int maxSize = 128;
	
	//testing 2
	boolean loggedIn;
	DoubleProperty loggedIn2;
	BorderPane mainview;
	
	
	
	//BorderPane view,logInModel newModel
	public logInModel(BorderPane view) {
		loggedIn = false;
		loggedIn2 = new SimpleDoubleProperty(1);
		mainview = view;
		
	}

	public int loginAction(){
		return 001;
	}
	
	public void tologIn(){
		loggedIn = true;
		loggedIn2 = new SimpleDoubleProperty(0);
		
		
		
		try {
			FXMLLoader loader =  new FXMLLoader();
			loader.setLocation(logInModel.class.getResource("../views/MainMeunView.fxml"));
			System.out.println("here");
			BorderPane view = loader.load();
			mainview.setLeft(null);
			mainview.setTop(null);
			mainview.setCenter(view);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public ObservableList<TempBP> getListBP() {
		return listBP;
	}

	public void setListBP(ObservableList<TempBP> listBP) {
		this.listBP = listBP;
	}

	public DoubleProperty getSize() {
		return size;
	}

	public void setSize(DoubleProperty size) {
		this.size = size;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public DoubleProperty getLoggedIn2() {
		return loggedIn2;
	}

	public void setLoggedIn2(DoubleProperty loggedIn2) {
		this.loggedIn2 = loggedIn2;
	}

	@Override
	public String toString() {
		return "logInModel [listBP=" + listBP + ", size=" + size + ", maxSize=" + maxSize + ", loggedIn=" + loggedIn
				+ ", loggedIn2=" + loggedIn2 + "]";
	}
	
	
	
	
	
	
	
}
