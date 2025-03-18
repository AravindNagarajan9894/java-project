package Java.Strings;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		remove();
	}
	public static void remove() {
		String word = "g d kka sakjsdaksd adibauj";
		System.out.println(word.replaceAll("\\s", ""));
	}
}
