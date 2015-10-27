package com.test.rais.client;

import java.util.Vector;
import java.util.Arrays;

import com.rais.collections.util.helper.SortEnum;
import com.rais.collections.util.list.VectorUtil;

public class VectorUtilTest {

	public static void main (String[] hh) {
		//Vector<String> list1 = new Vector<String>(Arrays.asList("a","b","c","d","e","f"));
		//Vector<String> list2 = new Vector<String>(Arrays.asList("d","b","a","x","v"));
		Vector<Integer> list1 = new Vector<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		Vector<Integer> list2 = new Vector<Integer>(Arrays.asList(4,2,1,19,20));
		Vector<Integer> list3 = new Vector<Integer>(Arrays.asList(4,2,1,4,19,20,1,1));
		Vector<Integer> list4 = new Vector<Integer>(Arrays.asList(1,6,2,9,3,0,4,5));
		Vector<Integer> readOnly = new Vector<Integer>(Arrays.asList(5,3,1,2));
		System.out.println("Union : "+VectorUtil.union(list1, list2));
		System.out.println("Intersection : "+VectorUtil.intersection(list1, list2));
		System.out.println("Difference : "+VectorUtil.difference(list1, list2));
		System.out.println("NumberOfOccurrences : "+VectorUtil.returnNumberOfOccurrence(list1, 4));
		System.out.println("NumberOfOccurrences : "+VectorUtil.removeDuplicates(list3));
		System.out.println("Reverse : "+VectorUtil.reverseVector(list1));
		System.out.println("Sort Ascending : "+VectorUtil.sort(list4, SortEnum.SORT_ASC));
		System.out.println("Sort Descending : "+VectorUtil.sort(list4, SortEnum.SORT_DESC));
		System.out.println("Read Only : "+VectorUtil.makeReadOnly(readOnly));
		System.out.println("Exception thrown when we add an entry to the Read Only list"+VectorUtil.makeReadOnly(readOnly).add(10));
	}
}
