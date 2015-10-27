package com.rais.collections.util.helper;
/**
 * This enum contains the sort order necessary for
 * Sorting of a collection
 * @author Rais Nazim
 *
 */
public enum SortEnum {

	SORT_ASC("asc"),
	SORT_DESC("dsc");
	
	private String order;

	private SortEnum(String order) {
		this.order = order;
	} 

	public String getOrder() {
		return order;
	} 
}
