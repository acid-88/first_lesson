package lessons_home;

import java.util.Scanner;

public class popop {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи число");
		int x = scanner.nextInt();
		while (x < 5) {
		System.out.println("nice try");
		System.out.println("Good Job");
		x = x + 1;
	}
		System.out.println("Конец игры!");
	}		
}