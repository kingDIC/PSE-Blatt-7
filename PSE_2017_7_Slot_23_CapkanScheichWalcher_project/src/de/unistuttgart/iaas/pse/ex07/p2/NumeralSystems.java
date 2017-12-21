package de.unistuttgart.iaas.pse.ex07.p2;

import java.util.Scanner;

/**
 * Provides methods for converting numbers between their binary, decimal, and
 * hexadecimal representation. Provides a simple text interface to these
 * conversion methods.
 */
public class NumeralSystems {
	public static int dezToBin (int z) {
		int result = 0;
		int x = z;
		for(int i = 0; i <= (int)Math.sqrt(z); i++) {
			result += Math.pow(10, i) * (x % 2);
			x /= 2;
		}
		return result;
	}
	public static String dezToHex (int z) {
		if(z < 16) {
			switch (z) {
			case 10:
				return "A";
			case 11:
				return "B";
			case 12:
				return "C";
			case 13:
				return "D";
			case 14:
				return "E";
			case 15:
				return "F";
			default:
				String x = String.valueOf(z);
				return x;
			}
		} else {
			return (dezToHex(z/16)) + (dezToHex(z%16));
		}
	}
	public static String binToHex (int z) {
		return dezToHex(binToDez(z));
	}
	public static int binToDez (int z) {
		int result = 0;
		int i = 0;
		while(z != 0) {
			result += (z % 10) * (int)Math.pow(2, i);
			i++;
			z /= 10;
		}
		return result;
	}
	public static int hexToBin (String z) {
		return dezToBin(hexToDez(z));
	}
	public static int hexToDez (String z) {
		return 0;
	}
	public static void main(String[] args) {
		boolean menu = true;
		Scanner sc = new Scanner(System.in);
		while (menu) {
			System.out.println("Bitte geben sie die Basis des gewünschten Zahlensystems an.");
			int i = sc.nextInt();
			
		}
		sc.close();
	}

}
