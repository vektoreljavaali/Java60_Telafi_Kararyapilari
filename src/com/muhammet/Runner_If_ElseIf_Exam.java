package com.muhammet;

import java.util.Scanner;

public class Runner_If_ElseIf_Exam {

	public static void main(String[] args) {

		System.out.println("**************************");
		System.out.println("**** HEPS�YANINDA.COM ****");
		System.out.println("**************************");
		System.out.println("Filtreleme");
		System.out.println("--------------------------");
		System.out.println("1-Hp");
		System.out.println("2-Asus");
		System.out.println("3-Lg");
		System.out.println("4-Lenovo");
		System.out.println("5-Hepsi");
		System.out.print("Se�iniz.....: ");
		int secim;
		Scanner sc = new Scanner(System.in);
		secim = sc.nextInt();
		if(secim==1) {
			System.out.println("Hp Listesi G�r�nt�lendi");
		}else if(secim==2) {
			System.out.println("Asus Listesi G�r�nt�lendi");
		}else if(secim==3) {
			System.out.println("Lg Listesi G�r�nt�lendi");
		}else if(secim==4) {
			System.out.println("Lenovo Listesi G�r�nt�lendi");
		}else if(secim==5) {
			System.out.println("T�m �r�n Listesi G�r�nt�lendi");
		}else {
			System.err.println("Ge�ersiz Se�im yapt�n�z");
		}
		
		
		

	}

}
