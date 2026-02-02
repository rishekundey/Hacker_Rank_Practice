package hacker_Rank_Pacakge;

public class CaesarCipher {

	public static String caesarCipher(String s, int k) {
		// Write your code here
		StringBuilder result = new StringBuilder();
		k = k % 26;
		for (char c : s.toCharArray()) {
			if (Character.isLetter(c)) {
				char base = Character.isLowerCase(c) ? 'a' : 'A';
				char shifted = (char) ((c - base + k) % 26 + base);
				result.append(shifted);
			} else {
				result.append(c);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(caesarCipher("middle-Outz", 2)); // okffng-Qwvb
		System.out.println(caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5)); // Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj
		System.out.println(caesarCipher("Zebra-493?", 3)); // Cheud-493?
		System.out.println(caesarCipher("Hello, World!", 7)); // Olssv, Dvysk!
		System.out.println(caesarCipher("abcXYZ", 27)); // bcdYZA

	}

}
