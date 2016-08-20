package com.tibco.bw.palette.zendesk.runtime;

/**
 * @author tvuppala
 * @author pcheruku
 *
 */

/*
 * This class is used to store the search data parameters specified in the
 * search activity
 */
public class SearchData {
	String searchQuery;
	String searchType;
	int maxRows;

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public int getMaxRows() {
		return maxRows;
	}

	public void setMaxRows(int maxRows) {
		this.maxRows = maxRows;
	}

	public String getSearchQuery() {
		return searchQuery;
	}

	public void setSearchQuery(String searchQuery) {
		this.searchQuery = searchQuery;
	}

}
