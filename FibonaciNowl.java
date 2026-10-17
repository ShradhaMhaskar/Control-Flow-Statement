package com.tka.loop;

public class FibonaciNowl {
	public static void main(String[] args) {
		int a = 0, b = 1;
		int i = 1;

		while (i <= 10) {
			System.out.println(a + "");
			int c = a + b;
			a = b;
			b = c;
			i++;

		}
	}

}
