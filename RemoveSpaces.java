package java_Technical_Interview;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str = "I love Java";
        String result = str.replaceAll("\\s", "");
        System.out.println("String without spaces: " + result);
	}

}
