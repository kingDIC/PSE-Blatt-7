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
		int i = 0;
		while (z != 0) {
			result += Math.pow(10, i) * (z % 2);
			z /= 2;
			i++;
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
			return (dezToHex(z / 16)) + (dezToHex(z % 16));
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
		if (z.length() == 1) {
			switch (z) {
			case "A":
				return 10;
			case "B":
				return 11;
			case "C":
				return 12;
			case "D":
				return 13;
			case "E":
				return 14;
			case "F":
				return 15;
			default:
				return Integer.getInteger(z);
			}
		} else {
			StringBuilder zahl = new StringBuilder(z);
			String letzteZiffer = zahl.substring(zahl.length() - 1);
			zahl = zahl.deleteCharAt(zahl.length() - 1);
			return hexToDez(zahl.toString()) * 16 + hexToDez(letzteZiffer);
		}
	}
	public static void main(String[] args) {
		boolean menu = true;
		Scanner sc = new Scanner(System.in);
		while (menu) {
			System.out.println("Bitte gib die Basis des Ausgangszahlensystems an. Gib -1 ein um das Programm zu beenden.");
			int ausgang = sc.nextInt();
			switch (ausgang) {
				case 2:
				case 10:
				case 16:
					System.out.println("Bitte gib die Basis des Zielzahlensystems an. Gib -1 ein um das Programm zu beenden.");
					break;
				case -1:
					System.out.println("Bist du dir sicher? Gib erneut -1 ein um das Programm wirklich zu beenden.");
					break;
				default:
					System.out.println("Dies ist kein unterstütztes Zahlensystem.");	
			}
			int ziel = sc.nextInt();
			switch (ziel) {
				case 2:
				case 10:
				case 16:
					break;
				case -1:
					System.out.println("Programm wird beendet.");
					menu = false;
					break;
				default:
					System.out.println("Dies ist kein unterstütztes Zahlensystem.");	
			}
			if (ausgang == 2) {
				System.out.println("Bitte gib die zu umwandelnde Zahl ein.");
				int zahl = sc.nextInt();
				System.out.println("~~~~~~~~~~~~~~~~~~~~RESULTAT~~~~~~~~~~~~~~~~~~~~");
				if (ziel == 2) {
					System.out.println("Die Binärzahl " + zahl + " ist " + zahl + " im Binärsystem.");
				} else if (ziel == 10) {
					System.out.println("Die Binärzahl " + zahl + " ist " + binToDez(zahl) + " im Dezimalsystem.");
				} else if (ziel == 16) {
					System.out.println("Die Binärzahl " + zahl + " ist " + binToHex(zahl) + " im Hexadezimalsystem.");
				}
			} else if (ausgang == 10) {
				System.out.println("Bitte gib die zu umwandelnde Zahl ein.");
				int zahl = sc.nextInt();
				System.out.println("~~~~~~~~~~~~~~~~~~~~RESULTAT~~~~~~~~~~~~~~~~~~~~");
				if (ziel == 2) {
					System.out.println("Die Dezimalzahl " + zahl + " ist " + dezToBin(zahl) + " im Binärsystem.");
				} else if (ziel == 10) {
					System.out.println("Die Dezimalzahl " + zahl + " ist " + zahl + " im Dezimalsystem.");
				} else if (ziel == 16) {
					System.out.println("Die Dezimalzahl " + zahl + " ist " + dezToHex(zahl) + " im Hexadezimalsystem.");
				}
			} else if (ausgang == 16) {
				System.out.println("Bitte gib die zu umwandelnde Zahl ein.");
				String zahl = sc.next();
				System.out.println("~~~~~~~~~~~~~~~~~~~~RESULTAT~~~~~~~~~~~~~~~~~~~~");
				if (ziel == 2) {
					System.out.println("Die Hexadezimalzahl " + zahl + " ist " + hexToBin(zahl) + " im Binärsystem.");
				} else if (ziel == 10) {
					System.out.println("Die Hexadezimalzahl " + zahl + " ist " + hexToDez(zahl) + " im Dezimalsystem.");
				} else if (ziel == 16) {
					System.out.println("Die Hexadezimalzahl " + zahl + " ist " + zahl + " im Hexadezimalsystem.");
				} 
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		sc.close();
	}

}
