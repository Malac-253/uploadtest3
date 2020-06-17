package views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import models.PlanMainModel;
import models.Section;

public class PlanViewController {
	PlanMainModel model;
    @FXML
    private Label TitleLabel;

    @FXML
    private TreeView<String> PlanTree;
    
    private void addNodes(Section p, TreeItem<String> t) {
		t.setExpanded(true);
		for (Section child : p.children) {
			TreeItem<String> node = new TreeItem<String>(child.showContent());
			t.getChildren().add(node);
			addNodes(child, node);
		}
	}
    
    public void setModel(PlanMainModel newModel) {
    	model = newModel;
    	//System.out.println("hereerrerere55555555555555555555555555555");
    	//System.out.println(model.getName());
    	//System.out.println( model.client);		
    	Section root = model.client.getCurrentBP().getRoot();
    	String rootContent = root.showContent();
		TreeItem<String> rootItem = new TreeItem<String>(rootContent);
		addNodes(root, rootItem);
		PlanTree.setShowRoot(true);
		PlanTree.setRoot(rootItem);
		
		TitleLabel.textProperty().set(model.client.getCurrentBP().name);
    	
    }

}
