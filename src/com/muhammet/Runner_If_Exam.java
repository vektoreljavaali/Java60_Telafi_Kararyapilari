package com.muhammet;

import java.util.Scanner;

public class Runner_If_Exam {

	public static void main(String[] args) {
		// bir kullan�c�dan vize ve final notunu alan 
		// ortalamas� 50 nin alt�nda ise kald�, �st�nde ise ge�ti yazan program yaz�n�z.
		int vize_notu,final_notu,ortalama;
		Scanner sc = new Scanner(System.in);
		System.out.print("Vize Notunu Giriniz.....:");
		vize_notu = sc.nextInt();
		System.out.print("Final Notunu Giriniz....:");
		final_notu = sc.nextInt();
		ortalama = (vize_notu+final_notu)/2;
		if(ortalama>=50) {
			System.out.println("Ge�tiniz..");
			
		}
		else {
			System.out.println("Kald�n�z");
		}
	}

}
