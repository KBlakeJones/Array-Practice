package com.skillstorm.week2;

public class MaxValueOfArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		findMax(numbers);
		
		numbers = null;
		findMax(numbers);
		
		numbers = new int[1];
		findMax(numbers);
		
		int[] newNumbers = {7, 7, 8, 8, 9, 17, 10};
		findMax(newNumbers);
		
		int[] oneNumber = {8};
		findMax(oneNumber);
		
		
		
		

	}
	public static void findMax(int[] numbers) {
		if (numbers == null) {
			System.out.println(0);
		}else {
			int max = Integer.MIN_VALUE;
			int index = 0;
		while (index < numbers.length) {  
			if(max < numbers[index]) {
				max = numbers[index];
			}
	//		System.out.println(max);
			index++;
		}System.out.println(max);
		} 
	}

}
