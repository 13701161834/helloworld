package helloWorld;

import java.util.Scanner;

public class Qing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int[] a = new int[1000];
		int n;
		n = input.nextInt();
		int i;
		for (i = 1; i <= n; i++) {
			a[i] = input.nextInt();
		}
		int x = input.nextInt();
		for (i = 1; i <= n; i++) {
			if (x == a[i]) {
				System.out.println(i);
				break;
			}

		}
		if (i == n+1)
			System.out.println("-1");

	}

}
