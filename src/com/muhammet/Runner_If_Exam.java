package com.muhammet;

import java.util.Scanner;

public class Runner_If_Exam {

	public static void main(String[] args) {
		// bir kullanýcýdan vize ve final notunu alan 
		// ortalamasý 50 nin altýnda ise kaldý, üstünde ise geçti yazan program yazýnýz.
		int vize_notu,final_notu,ortalama;
		Scanner sc = new Scanner(System.in);
		System.out.print("Vize Notunu Giriniz.....:");
		vize_notu = sc.nextInt();
		System.out.print("Final Notunu Giriniz....:");
		final_notu = sc.nextInt();
		ortalama = (vize_notu+final_notu)/2;
		if(ortalama>=50) {
			System.out.println("Geçtiniz..");
			
		}
		else {
			System.out.println("Kaldýnýz");
		}
	}

}
