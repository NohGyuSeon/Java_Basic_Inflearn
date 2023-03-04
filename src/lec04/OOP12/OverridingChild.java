package lec04.OOP12;

public class OverridingChild extends OverridingParent {

	@Override
	public String showCompany() {
		String parentString = super.showCompany();
		parentString = "삼성" + parentString;
		return parentString;
	}	
	
}
