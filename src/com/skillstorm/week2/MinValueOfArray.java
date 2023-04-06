package com.skillstorm.week2;

public class MinValueOfArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		findMin(numbers);
		
		int[] newNumbers = {5, 7, 8, 14, 3, -5};
		findMin(newNumbers);
		
		numbers = null;
		bonus(numbers);
		
		numbers = new int[0];
		bonus(numbers);
	}
	public static void findMin(int[] numbers) {
		if (numbers == null) {
			System.out.println(0);
		}else {
			int min = Integer.MAX_VALUE;
			int index = 0;
		while (index < numbers.length) {  
			if(min > numbers[index]) {
				min = numbers[index];
			}
	//		System.out.println(max);
			index++;
		}System.out.println(min);
		} 
	}
	
	public static void bonus(int[] numbers) {
		int min = Integer.MAX_VALUE;
		int index = 0;
		if (numbers == null) {
			System.out.println(min);
		}else {
			
		while (index < numbers.length) {  
			if(min > numbers[index]) {
				min = numbers[index];
			}
	//		System.out.println(max);
			index++;
		}System.out.println(min);
		}
	}

}
