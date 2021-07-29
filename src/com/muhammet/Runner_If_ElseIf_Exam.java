package com.muhammet;

import java.util.Scanner;

public class Runner_If_ElseIf_Exam {

	public static void main(String[] args) {

		System.out.println("**************************");
		System.out.println("**** HEPSÝYANINDA.COM ****");
		System.out.println("**************************");
		System.out.println("Filtreleme");
		System.out.println("--------------------------");
		System.out.println("1-Hp");
		System.out.println("2-Asus");
		System.out.println("3-Lg");
		System.out.println("4-Lenovo");
		System.out.println("5-Hepsi");
		System.out.print("Seçiniz.....: ");
		int secim;
		Scanner sc = new Scanner(System.in);
		secim = sc.nextInt();
		if(secim==1) {
			System.out.println("Hp Listesi Görüntülendi");
		}else if(secim==2) {
			System.out.println("Asus Listesi Görüntülendi");
		}else if(secim==3) {
			System.out.println("Lg Listesi Görüntülendi");
		}else if(secim==4) {
			System.out.println("Lenovo Listesi Görüntülendi");
		}else if(secim==5) {
			System.out.println("Tüm Ürün Listesi Görüntülendi");
		}else {
			System.err.println("Geçersiz Seçim yaptýnýz");
		}
		
		
		

	}

}
