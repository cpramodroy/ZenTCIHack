package com.tibco.bw.palette.zendesk.runtime;

/**
 * This class is used to store the delete data parameters specified in the delete activity
 */
public class DeleteData {
	long[] listOfIds;
	String deleteType;
	
	public long[] getListOfIds() {
		return listOfIds;
	}
	public void setListOfIds(long[] listOfIds) {
		this.listOfIds = listOfIds;
	}
	public String getDeleteType() {
		return deleteType;
	}
	public void setDeleteType(String deleteType) {
		this.deleteType = deleteType;
	}
}
