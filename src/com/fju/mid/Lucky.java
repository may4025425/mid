package com.fju.mid;

import java.util.Random;
import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		System.out.println("請輸入一個1到10之間的幸運數字");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Random r = new Random();
		Random r1 = new Random();
		Random r2 = new Random();
		Random r3 = new Random();
		Random r4 = new Random();
		Random r5 = new Random();
		System.out.print(r.nextInt(10) + 1 + "\t");
		System.out.print(r1.nextInt(10) + 1 + "\t");
		System.out.print(r2.nextInt(10) + 1 + "\t");
		System.out.print(r3.nextInt(10) + 1 + "\t");
		System.out.print(r4.nextInt(10) + 1 + "\t");
		System.out.print(r5.nextInt(10) + 1 + "\t");
	
		if(r==r){
			System.out.println("\n"+"Yes");}
		else{
				System.out.println("\n"+"No");}
			}
		}

	

