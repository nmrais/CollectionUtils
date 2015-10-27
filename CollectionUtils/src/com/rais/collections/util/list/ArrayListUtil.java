package com.rais.collections.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.rais.collections.util.helper.SortEnum;
/**
 * This class consists of operations that can be performed on
 * 2 or more ArrayLists which can be used to reduce a lot of redundant
 * code.
 * @author Rais Nazim
 *
 */
public class ArrayListUtil {
	
	/**
	 * This method returns the intersection of two ArrayList items.
	 * For e.g. list1 is {a, b, c} and list2 is {b, c, d, e}, then
	 * intersection operation returns {b, c}
	 * In order words, it returns those elements common to both.
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static <T> ArrayList<T> intersection(ArrayList<T> list1, ArrayList<T> list2){
		ArrayList<T> list = new ArrayList<T>();
        for (T t : list1) {
            if(list2.contains(t)) {
                list.add(t);
            }
        }
        return list;
	}
	
	/**
	 * This method returns the union of two ArrayList items.
	 * For e.g. list1 is {a, b, c} and list2 is {b, c, d, e}, then
	 * union operation returns {a, b, c, d, e}
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static <T> ArrayList<T> union(ArrayList<T> list1, ArrayList<T> list2){
		Set<T> set = new HashSet<T>();
        set.addAll(list1);
        set.addAll(list2);
        return new ArrayList<T>(set);
	}
	
	/**
	 * This method returns the difference of two ArrayList items.
	 * For e.g. list1 is {a, b, c} and list2 is {b, c, d, e}, then
	 * difference operation returns {a, d, e}
	 * @param list1
	 * @param list2
	 * @return list
	 */
	public static <T> ArrayList<T> difference(ArrayList<T> list1, ArrayList<T> list2){
		ArrayList<T> list = new ArrayList<T>();
		list.addAll(list1);
        for (T t : list1) {
            if(list2.contains(t)) {
                list.remove(t);
            }
        }
        return list;
	}
	
	/**
	 * This method returns the number of occurrences of an item
	 * in the provided ArrayList
	 * @param list1
	 * @param item
	 * @return num
	 */
	public static <T> int returnNumberOfOccurrence(ArrayList<T> list1, T item) {
		int num = 0;
		for(T t: list1) {
			if(item.equals(t))
				num++;
		}
		return num;
	}
	
	/**
	 * This method removes duplicates from the ArrayList
	 * @param list1
	 * @return 
	 */
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list1) {
		Set<T> set = new HashSet<T>();
        set.addAll(list1);
        return new ArrayList<T>(set);
	}
	
	/**
	 * This method reverses the entries in an ArrayList
	 * @param list1
	 * @return
	 */
	public static <T> ArrayList<T> reverseArrayList(ArrayList<T> list1) {
		Collections.reverse(list1);
		return list1;
	}
	
	/**
	 * This method synchronizes an ArrayList and returns the synchronized one
	 * @param list1
	 * @return
	 */
	public static <T> ArrayList<T> synchronize(ArrayList<T> list1) {
		Collections.synchronizedList(list1);
		return list1;
	}
	

	/**
	 * This method sorts the ArrayList and returns the sorted one
	 * The order has to be specified as any of the following two
	 * SortEnum.SORT_ASC or SortEnum.SORT_DESC
	 * @param list1
	 * @param order
	 * @return
	 */
	public static <T extends Comparable<? super T>> ArrayList<T> sort(ArrayList<T> list1, SortEnum order) {
		
		switch(order) {
		case SORT_ASC:
			Collections.sort(list1);
			break;
		case SORT_DESC :
			Collections.sort(list1, Collections.reverseOrder());
			break;
		default :
			Collections.sort(list1);
			break;
		}
		
		return list1;
	}
	
	/**
	 * This method makes the ArrayList read only. A user wouldn't
	 * be able to modify this any more.
	 * If a user tries to add an item to it, an exception will be
	 * thrown to the user.
	 * You have to assign the returned list to another variable
	 * in order to use this property.
	 * @param list1
	 * @return
	 */
	public static <T> List<T> makeReadOnly(ArrayList<T> list1){
		return Collections.unmodifiableList(list1);
	}
}
