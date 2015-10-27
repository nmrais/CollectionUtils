package com.test.rais.client;

import java.util.LinkedList;
import java.util.Arrays;

import com.rais.collections.util.helper.SortEnum;
import com.rais.collections.util.list.LinkedListUtil;

public class LinkedListUtilTest {

	public static void main (String[] hh) {
		//LinkedList<String> list1 = new LinkedList<String>(Arrays.asList("a","b","c","d","e","f"));
		//LinkedList<String> list2 = new LinkedList<String>(Arrays.asList("d","b","a","x","v"));
		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(4,2,1,19,20));
		LinkedList<Integer> list3 = new LinkedList<Integer>(Arrays.asList(4,2,1,4,19,20,1,1));
		LinkedList<Integer> list4 = new LinkedList<Integer>(Arrays.asList(1,6,2,9,3,0,4,5));
		LinkedList<Integer> readOnly = new LinkedList<Integer>(Arrays.asList(5,3,1,2));
		System.out.println("Union : "+LinkedListUtil.union(list1, list2));
		System.out.println("Intersection : "+LinkedListUtil.intersection(list1, list2));
		System.out.println("Difference : "+LinkedListUtil.difference(list1, list2));
		System.out.println("NumberOfOccurrences : "+LinkedListUtil.returnNumberOfOccurrence(list1, 4));
		System.out.println("NumberOfOccurrences : "+LinkedListUtil.removeDuplicates(list3));
		System.out.println("Reverse : "+LinkedListUtil.reverseLinkedList(list1));
		System.out.println("Sort Ascending : "+LinkedListUtil.sort(list4, SortEnum.SORT_ASC));
		System.out.println("Sort Descending : "+LinkedListUtil.sort(list4, SortEnum.SORT_DESC));
		System.out.println("Read Only : "+LinkedListUtil.makeReadOnly(readOnly));
		System.out.println("Exception thrown when we add an entry to the Read Only list"+LinkedListUtil.makeReadOnly(readOnly).add(10));
	}
}
