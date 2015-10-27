package com.rais.collections.util.list;

import java.util.Vector;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.rais.collections.util.helper.SortEnum;

public class VectorUtil {

	/**
	 * This method returns the intersection of two Vector items.
	 * For e.g. vector1 is {a, b, c} and vector2 is {b, c, d, e}, then
	 * intersection operation returns {b, c}
	 * In order words, it returns those elements common to both.
	 * @param vector1
	 * @param vector2
	 * @return
	 */
	public static <T> Vector<T> intersection(Vector<T> vector1, Vector<T> vector2){
		Vector<T> list = new Vector<T>();
        for (T t : vector1) {
            if(vector2.contains(t)) {
                list.add(t);
            }
        }
        return list;
	}
	
	/**
	 * This method returns the union of two Vector items.
	 * For e.g. vector1 is {a, b, c} and vector2 is {b, c, d, e}, then
	 * union operation returns {a, b, c, d, e}
	 * @param vector1
	 * @param vector2
	 * @return
	 */
	public static <T> Vector<T> union(Vector<T> vector1, Vector<T> vector2){
		Set<T> set = new HashSet<T>();
        set.addAll(vector1);
        set.addAll(vector2);
        return new Vector<T>(set);
	}
	
	/**
	 * This method returns the difference of two Vector items.
	 * For e.g. vector1 is {a, b, c} and vector2 is {b, c, d, e}, then
	 * difference operation returns {a, d, e}
	 * @param vector1
	 * @param vector2
	 * @return list
	 */
	public static <T> Vector<T> difference(Vector<T> vector1, Vector<T> vector2){
		Vector<T> list = new Vector<T>();
		list.addAll(vector1);
        for (T t : vector1) {
            if(vector2.contains(t)) {
                list.remove(t);
            }
        }
        return list;
	}
	
	/**
	 * This method returns the number of occurrences of an item
	 * in the provided Vector
	 * @param vector1
	 * @param item
	 * @return num
	 */
	public static <T> int returnNumberOfOccurrence(Vector<T> vector1, T item) {
		int num = 0;
		for(T t: vector1) {
			if(item.equals(t))
				num++;
		}
		return num;
	}
	
	/**
	 * This method removes duplicates from the Vector
	 * @param vector1
	 * @return 
	 */
	public static <T> Vector<T> removeDuplicates(Vector<T> vector1) {
		Set<T> set = new HashSet<T>();
        set.addAll(vector1);
        return new Vector<T>(set);
	}
	
	/**
	 * This method reverses the entries in an Vector
	 * @param vector1
	 * @return
	 */
	public static <T> Vector<T> reverseVector(Vector<T> vector1) {
		Collections.reverse(vector1);
		return vector1;
	}
	
	/**
	 * This method synchronizes an Vector and returns the synchronized one
	 * @param vector1
	 * @return
	 */
	public static <T> Vector<T> synchronize(Vector<T> vector1) {
		Collections.synchronizedList(vector1);
		return vector1;
	}
	

	/**
	 * This method sorts the Vector and returns the sorted one
	 * The order has to be specified as any of the following two
	 * SortEnum.SORT_ASC or SortEnum.SORT_DESC
	 * @param vector1
	 * @param order
	 * @return
	 */
	public static <T extends Comparable<? super T>> Vector<T> sort(Vector<T> vector1, SortEnum order) {
		
		switch(order) {
		case SORT_ASC:
			Collections.sort(vector1);
			break;
		case SORT_DESC :
			Collections.sort(vector1, Collections.reverseOrder());
			break;
		default :
			Collections.sort(vector1);
			break;
		}
		
		return vector1;
	}
	
	/**
	 * This method makes the Vector read only. A user wouldn't
	 * be able to modify this any more.
	 * If a user tries to add an item to it, an exception will be
	 * thrown to the user.
	 * You have to assign the returned list to another variable
	 * in order to use this property.
	 * @param vector1
	 * @return
	 */
	public static <T> List<T> makeReadOnly(Vector<T> vector1){
		return Collections.unmodifiableList(vector1);
	}
}
