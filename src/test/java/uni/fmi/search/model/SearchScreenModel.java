package uni.fmi.search.model;

import uni.fmi.search.service.SearchService;

public class SearchScreenModel {

	private String ID;
	private String message;
	private String name;

	public void enterID(final String ID) {
		this.ID= ID;
		
	}

	public void clickSearchButton() {
		if (name==null)
		message= SearchService.Search(ID);
		else message= SearchService.SearchByName(name);
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	public void addName(final String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}

}
