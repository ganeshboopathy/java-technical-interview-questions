package java_Technical_Interview;

public class ReverseWords {

	public static void main(String[] args) {
		String sentence = "I love Java";
        String[] words = sentence.split(" ");
        String reversedSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }

        System.out.println("Reversed Sentence: " + reversedSentence.trim());
	}

}
