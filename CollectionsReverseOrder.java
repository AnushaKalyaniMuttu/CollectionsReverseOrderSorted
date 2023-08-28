package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsReverseOrder {

	public static void main(String[] args) {
		
		List<Integer> integers=new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		Comparator<Integer> s=Collections.reverseOrder();
		integers.stream().sorted(s).forEach(System.out::println);
	      	}
		
	}
