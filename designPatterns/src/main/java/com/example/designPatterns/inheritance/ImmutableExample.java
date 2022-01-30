package com.example.designPatterns.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

final class Example {

	final String str = "immutable";

	final List<String> list = new ArrayList<>(Arrays.asList("immutable object"));

}

public class ImmutableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example exp = new Example();
		// exp.str = "new immutable";
		System.out.println(exp.str);

		// exp.list = new ArrayList<>();
		exp.list.add(exp.list.get(0));
		exp.list.add("abc");
		System.out.println(exp.list);

		int[] arr = { 100,99,2, 1, 4, 5, 3,8,10,1,99 };

//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i+1]>arr[i]) {
//				int temp = arr[i];
//				arr[i] =arr[i+1];
//				arr[i+1] = temp;
//			}
//			
//		}
		for (int j = 0; j < arr.length - 1; j++) {

			if (arr[j] > arr[j + 1]) {

				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;

				j = -1;
			}
		}
//		for(int i=0;i<arr.length;) {
//			
//			if(arr[i] == i+1) {
//				i++;
//			}
//			else {
//				int temp1 = arr[i];
//				int temp2 = arr[arr[i]-1];
//				arr[i] = temp2;
//				arr[temp1-1] = temp1;
//			}
//		}
		// 1 2 3 4 5 6 7 8 9 10
		// 1 1 1 1 1 1 1 1 1 1
		// f t f t f t f t f t
		
		// 2 4 6 8 
		// 0 0 0 0
		// f t t t
		
		// 
		 IntStream.range(1, 10)
         .filter(i -> {
             System.out.print("1");  
             return i % 2 == 0;
         })
         .filter(i -> {
             System.out.print("0");
             return i > 3;
         })
         .limit(1)
         .forEach(i -> {
             System.out.print(i);
         });
		 
		 System.out.println();
		 IntStream.range(1, 10)
         .filter(i -> {
             System.out.print("1");
             return i % 2 == 0;
         }).limit(1)
         .forEach(i -> {
             System.out.print(i);
         });
		 
//		 Map<Integer, Map<Boolean, List<Integer>>> map =
//		            Stream.of(56, 54, 1, 31, 98, 98, 16)
//		               .collect(Collectors.groupingBy(classifier, downstream)
//		                        )
//		               );
//		        System.out.println(map);
 

//		for (int i : arr) {
//			System.out.println(i);
//		}

	}

}
