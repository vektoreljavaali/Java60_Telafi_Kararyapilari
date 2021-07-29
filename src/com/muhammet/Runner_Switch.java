package com.muhammet;

public class Runner_Switch {

	public static void main(String[] args) {
		// Ýf else if yapýsýnda, tüm koþullar doðru seçenek bulununcaya kadar denenir.
		int secim = 4;
		switch(secim) {
			case 1: System.out.println("Toplama Ýþlemi"); break;
			case 2: System.out.println("Çýkartma Ýþlemi"); break;
			default: System.out.println("Lütfen Geçerli Bir Ýþlem Seçiniz"); break;
		}// Switch sonu

	}//Main Sonu

}//Class Sonu
