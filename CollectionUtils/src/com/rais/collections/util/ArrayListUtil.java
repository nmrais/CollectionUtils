package com.rais.collections.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 * This class consists of operations that can be performed on
 * 2 or more ArrayLists which can be used to reduce a lot of redundant
 * code.
 * @author Mohammed Rais Nazim
 *
 */
public class ArrayListUtil {
	
	/**
	 * This method returns the intersection of two ArrayList items.
	 * For e.g. list1 is {a, b, c} and list2 is {b, c, d, e}, then
	 * intersection operation returns {b, c}
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
	 * @return
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
	
}
