package com.test.rais.client;

import java.util.ArrayList;
import java.util.Arrays;

import com.rais.collections.util.helper.SortEnum;
import com.rais.collections.util.list.ArrayListUtil;

public class ArrayListUtilTest {

	public static void main (String[] hh) {
		//ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f"));
		//ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("d","b","a","x","v"));
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4,2,1,19,20));
		ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(4,2,1,4,19,20,1,1));
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1,6,2,9,3,0,4,5));
		ArrayList<Integer> readOnly = new ArrayList<Integer>(Arrays.asList(5,3,1,2));
		System.out.println("Union : "+ArrayListUtil.union(list1, list2));
		System.out.println("Intersection : "+ArrayListUtil.intersection(list1, list2));
		System.out.println("Difference : "+ArrayListUtil.difference(list1, list2));
		System.out.println("NumberOfOccurrences : "+ArrayListUtil.returnNumberOfOccurrence(list1, 4));
		System.out.println("Remove Duplicates : "+ArrayListUtil.removeDuplicates(list3));
		System.out.println("Reverse : "+ArrayListUtil.reverseArrayList(list1));
		System.out.println("Sort Ascending : "+ArrayListUtil.sort(list4, SortEnum.SORT_ASC));
		System.out.println("Sort Descending : "+ArrayListUtil.sort(list4, SortEnum.SORT_DESC));
		System.out.println("Read Only : "+ArrayListUtil.makeReadOnly(readOnly));
		System.out.println("Exception thrown when we add an entry to the Read Only list"+ArrayListUtil.makeReadOnly(readOnly).add(10));
	}
}
