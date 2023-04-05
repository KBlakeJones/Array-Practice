package com.skillstorm.week2;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		String[] favoriteFoods = {"pizza", "sushi", "steak", "wings", "eggs"};
		System.out.println(favoriteFoods[0]);
		System.out.println(favoriteFoods[1]);
		System.out.println(favoriteFoods[2]);
		System.out.println(favoriteFoods[3]);
		System.out.println(favoriteFoods[4]);
		
		System.out.println("My favorite foods are " + Arrays.toString(favoriteFoods));
		
		System.out.println("My favorite breakfast is " + favoriteFoods[4] + "!");
		favoriteFoods[4] = "protein shake";
		System.out.println("When I'm running late in the morning I'll substitute a " + favoriteFoods[4] + " for eggs!");

	}

}
