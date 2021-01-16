package com.ttlecom;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);

		/* II.2 Check the letter, number, special character input */
//		checkLetterNumberAndSpecialChar(sc);

		/* II.3 Print out multiples of 7 within range n, m */
//		printMultiplesOfSeven(sc);

		/* II.4 Show and pick personal hobbies by Menu */
//		selectPersonalInterest(sc);

		/* II.5 Input an integer and print out the total of its numerical members */
//		System.out.println(sumNumericalMembersInANumber(1234532123));

		/* II.6 Input N and print out N Fibonacci numbers */
//		printFibonacciSequence(sc);

		/* II.7 Input N and print N prime numbers */
//		printPrimeList(sc);

		/* II.8 Convert number N into binary format */
		System.out.println(printDecimalNumberAsBinaryString(sc));
	}

	private static String printDecimalNumberAsBinaryString(Scanner scanner) {
		int n;
		int remainder;
		String result = "";

		do {
			System.out.print("Please input a number N: ");
			n = Integer.parseInt(scanner.nextLine());
		} while (n <= 0);

		do {
			remainder = n % 2;
			n = n / 2;
			result += String.valueOf(remainder) + " ";
		} while (n != 0);
		return "The number after being converted is " + new StringBuilder(result).reverse().toString();
	}

	private static void printPrimeList(Scanner scanner) {
		int n;
		int count = 1;
		int startPrime = 2;
		do {
			System.out.print("Please input a number N > 1: ");
			n = Integer.parseInt(scanner.nextLine());
		} while (n <= 1);

		while (count <= n) {
			if (isPrime(startPrime)) {
				System.out.printf("%d is a prime #%d.\n", startPrime, count);
				count++;
			}
			startPrime++;
		}

	}

	private static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) return false;
		}
		return true;
	}

	private static void printFibonacciSequence(Scanner scanner) {
		int n;
		int count = 1;
		int fibonacci = 1;
		int predecessor1;
		int predecessor2 = 0;
		do {
			System.out.print("Please input a number N: ");
			n = Integer.parseInt(scanner.nextLine());
		} while (n <= 0);

		do {
			System.out.printf("%d ", fibonacci);
			count++;
			predecessor1 = predecessor2;
			predecessor2 = fibonacci;
			fibonacci = predecessor1 + predecessor2;
		} while (count <= n);
	}

	private static int sumNumericalMembersInANumber(long value) {
		int result = 0;
		long remainder;
		do {
			remainder = value % 10;
			result += remainder;
			value = value / 10;
		} while (value != 0);
		return result;
	}

	private static void selectPersonalInterest(Scanner scanner) {
		int choice;
		do {
			System.out.println("\t\tPERSONAL HOBBIES");
			System.out.println("================================");
			System.out.println("\t1.\tReading books");
			System.out.println("\t2.\tListening musics");
			System.out.println("\t3.\tPlaying sports");
			System.out.println("\t4.\tComputer");
			System.out.println("\t5.\tExit");
			System.out.println("================================");
			System.out.print("Please select: ");

			choice = Integer.parseInt(scanner.nextLine());

			switch (choice) {
				case 1:
					System.out.println("You love reading books!\n\n");
					break;
				case 2:
					System.out.println("You love listening musics!\n\n");
					break;
				case 3:
					System.out.println("You like playing sports!\n\n");
					break;
				case 4:
					System.out.println("You like discovering computer functions!\n\n");
					break;
				case 5:
					System.out.println("You just exited the program!\n\n");
					break;
				default:
					System.out.println("You input a wrong answer, please choose again!\n\n");
					break;
			}
		} while (choice != 5);
	}

	private static void printMultiplesOfSeven(Scanner scanner) {
		int m, n;
		int count = 0;
		do {
			System.out.print("Please input a number M > 0: ");
			m = Integer.parseInt(scanner.nextLine());
		} while (m <= 0);
		do {
			System.out.print("Please input a number N > M: ");
			n = Integer.parseInt(scanner.nextLine());
		} while (n <= m);
		for (int i = m; i <= n; i++) {
			if (isMultipleOfSeven(i)) {
				System.out.printf("%d can be divided by 7.\n", i);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There is no number able to be divided by 7!");
		}
	}

	/* check the number can be divided by 7 when the surplus/remainder is zero */
	private static boolean isMultipleOfSeven(int value) {
		return value % 7 == 0;
	}

	private static void checkLetterNumberAndSpecialChar(Scanner scanner) {
		char c;
		int cCode;

		while (true) {
			System.out.print("Please input a character: ");
			c = scanner.nextLine().charAt(0);
			cCode = c;
			if (isLetter(cCode)) {
				System.out.printf("%c is a letter!\n", c);
			} else if (isNumber(cCode)) {
				System.out.printf("%c is a number!\n", c);
			} else if (isSpace(cCode)) {
				System.out.println("You input a space character, the program terminated!");
				break;
			} else {
				System.out.printf("%c is a special character!\n", c);
			}
		}
	}

	/* check the letter is */
	private static boolean isLetter(int value) {
		return (value >= 65 && value <= 90) || (value >= 97 && value <= 122);
	}

	/* check the number is */
	private static boolean isNumber(int value) {
		return value >= 48 && value <= 57;
	}

	/* check the letter is a space */
	private static boolean isSpace(int value) {
		return value == 32;
	}
}
