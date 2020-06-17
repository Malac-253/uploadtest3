package views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.MainViewModel;

public class NewPlanViewController {
	
	MainViewModel model;
	
	public void setModel(MainViewModel newModel)
	{
		model = newModel;	
	}
}

