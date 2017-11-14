package com.fju.mid;

import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
	
		
		Random r1 = new Random();
		Random r2 = new Random();
		Random r3 = new Random();
		
		System.out.print(r1.nextInt(10) + 1 + "\t");
		System.out.print(r2.nextInt(10) + 1 + "\t");
		System.out.print(r3.nextInt(10) + 1 + "\t");
		
	}

}
