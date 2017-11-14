package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字");
		Scanner scan = new Scanner(System.in);//印出1到此數字的整數
		int n = scan.nextInt();
		for(int i=1;i<=n;i++){
		System.out.print(i+" ");
		}
	}

}
