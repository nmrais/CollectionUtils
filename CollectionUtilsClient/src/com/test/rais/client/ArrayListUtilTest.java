package com.test.rais.client;

import java.util.ArrayList;
import java.util.Arrays;

import com.rais.collections.util.ArrayListUtil;

public class ArrayListUtilTest {

	public static void main (String[] hh) {
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("d","b","a","x","v"));
		System.out.println("Union : "+ArrayListUtil.union(list1, list2));
		System.out.println("Intersection : "+ArrayListUtil.intersection(list1, list2));
		System.out.println("Difference : "+ArrayListUtil.difference(list1, list2));
	}
}
