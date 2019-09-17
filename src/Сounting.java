import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Сounting {
    private static final String REGEX_SENTENCE = "(?U)\\b\\p{Lu}\\p{L}*\\b";
    private static final String REGEX_WORDS = "[\\p{Punct}\\s]+";
    private static final String REGEX_PARAGRAPH = "\n";

    private int countOfParagraph;
    private int countOfSentences;


    public void doingTheCountingOfSentences(String sometext) {
        Pattern p = Pattern.compile(REGEX_SENTENCE);
        Matcher m = p.matcher(sometext);
        while (m.find()) {
            countOfSentences++;
        }
        System.out.println("Количество предложений: - " + countOfSentences);
    }

    public void doingTheCountingOfWords(String sometext) {
        String[] countOfWords = sometext.split(REGEX_WORDS);
        System.out.println("Количество слов: - " + countOfWords.length);
    }

    public void doingTheCountingOfParagraph(String sometext) {
        Pattern p = Pattern.compile(REGEX_PARAGRAPH);
        Matcher m = p.matcher(sometext);
        while (m.find()) {
            countOfParagraph++;
        }
        System.out.println("Количество параграфов: - " + countOfParagraph);
    }
}
