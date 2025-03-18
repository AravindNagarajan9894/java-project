package Java.Strings;

public class RandomString {

	public static void main(String[] args) {
		System.out.println(generate(8));

	}
	public static String generate(int size){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<size;i++) {
			char ch = (char)(Math.random()*26+97);
			sb.append(ch);
		}
		String str = sb.toString();
	
		return str;
	}

}
