package com.jtc.NormalQuestion;

import java.util.*;
import java.util.stream.Collectors;

//8. Flatten a List of Lists
//nput: [[1,2], [3,4], [5,6]]
//Output: [1,2,3,4,5,6
public class Jtc9 {
            public static void main(String[] args) {
				List<List<Integer>> listOfList = Arrays.asList(
						Arrays.asList(1,2),
						Arrays.asList(3,4),
						Arrays.asList(5,6));
				List<Integer> flattened = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
				System.out.println(flattened);
				
			}
}
//flatMap(List::stream) flattens all inner lists into a single stream.