package java_Technical_Interview;

public class WordCount {

	public static void main(String[] args) {
		String str = "Hello world Java";
        String[] words = str.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
	}

}
