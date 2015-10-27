package com.rais.collections.util.list;

import java.util.LinkedList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.LinkedList;

import com.rais.collections.util.helper.SortEnum;

public class LinkedListUtil {

	/**
	 * This method returns the intersection of two LinkedList items.
	 * For e.g. linkedList1 is {a, b, c} and linkedList2 is {b, c, d, e}, then
	 * intersection operation returns {b, c}
	 * In order words, it returns those elements common to both.
	 * @param linkedList1
	 * @param linkedList2
	 * @return
	 */
	public static <T> LinkedList<T> intersection(LinkedList<T> linkedList1, LinkedList<T> linkedList2){
		LinkedList<T> list = new LinkedList<T>();
        for (T t : linkedList1) {
            if(linkedList2.contains(t)) {
                list.add(t);
            }
        }
        return list;
	}
	
	/**
	 * This method returns the union of two LinkedList items.
	 * For e.g. linkedList1 is {a, b, c} and linkedList2 is {b, c, d, e}, then
	 * union operation returns {a, b, c, d, e}
	 * @param linkedList1
	 * @param linkedList2
	 * @return
	 */
	public static <T> LinkedList<T> union(LinkedList<T> linkedList1, LinkedList<T> linkedList2){
		Set<T> set = new HashSet<T>();
        set.addAll(linkedList1);
        set.addAll(linkedList2);
        return new LinkedList<T>(set);
	}
	
	/**
	 * This method returns the difference of two LinkedList items.
	 * For e.g. linkedList1 is {a, b, c} and linkedList2 is {b, c, d, e}, then
	 * difference operation returns {a, d, e}
	 * @param linkedList1
	 * @param linkedList2
	 * @return list
	 */
	public static <T> LinkedList<T> difference(LinkedList<T> linkedList1, LinkedList<T> linkedList2){
		LinkedList<T> list = new LinkedList<T>();
		list.addAll(linkedList1);
        for (T t : linkedList1) {
            if(linkedList2.contains(t)) {
                list.remove(t);
            }
        }
        return list;
	}
	
	/**
	 * This method returns the number of occurrences of an item
	 * in the provided LinkedList
	 * @param linkedList1
	 * @param item
	 * @return num
	 */
	public static <T> int returnNumberOfOccurrence(LinkedList<T> linkedList1, T item) {
		int num = 0;
		for(T t: linkedList1) {
			if(item.equals(t))
				num++;
		}
		return num;
	}
	
	/**
	 * This method removes duplicates from the LinkedList
	 * @param linkedList1
	 * @return 
	 */
	public static <T> LinkedList<T> removeDuplicates(LinkedList<T> linkedList1) {
		Set<T> set = new HashSet<T>();
        set.addAll(linkedList1);
        return new LinkedList<T>(set);
	}
	
	/**
	 * This method reverses the entries in an LinkedList
	 * @param linkedList1
	 * @return
	 */
	public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> linkedList1) {
		Collections.reverse(linkedList1);
		return linkedList1;
	}
	
	
	/**
	 * This method synchronizes an LinkedList and returns the synchronized one
	 * @param linkedList1
	 * @return
	 */
	public static <T> LinkedList<T> synchronize(LinkedList<T> linkedList1) {
		Collections.synchronizedList(linkedList1);
		return linkedList1;
	}
	

	/**
	 * This method sorts the LinkedList and returns the sorted one
	 * The order has to be specified as any of the following two
	 * SortEnum.SORT_ASC or SortEnum.SORT_DESC
	 * @param list1
	 * @param order
	 * @return
	 */
	public static <T extends Comparable<? super T>> LinkedList<T> sort(LinkedList<T> linkedList1, SortEnum order) {
		
		switch(order) {
		case SORT_ASC:
			Collections.sort(linkedList1);
			break;
		case SORT_DESC :
			Collections.sort(linkedList1, Collections.reverseOrder());
			break;
		default :
			Collections.sort(linkedList1);
			break;
		}
		
		return linkedList1;
	}
	
	/**
	 * This method makes the LinkedList read only. A user wouldn't
	 * be able to modify this any more.
	 * If a user tries to add an item to it, an exception will be
	 * thrown to the user.
	 * You have to assign the returned list to another variable
	 * in order to use this property.
	 * @param list1
	 * @return
	 */
	public static <T> List<T> makeReadOnly(LinkedList<T> linkedList1){
		return Collections.unmodifiableList(linkedList1);
	}
}
