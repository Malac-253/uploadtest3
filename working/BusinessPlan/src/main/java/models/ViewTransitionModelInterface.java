package models;

import views.MainViewController;

public interface ViewTransitionModelInterface {
	public void showBPlistView(ViewTransitionModelInterface vm);
	public void showEmptyBPView();
	public String getName();
	public void showCopyView(BusinessPlan businessPlan);
}
