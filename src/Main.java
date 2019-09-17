import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    private static String text = "Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!!";
    private static String filename = "text.txt";
    public static void main(String[] args) throws FileNotFoundException {
        /*
        * Разместить в файле любой текст, разбить его на абзацы, предложения, слова, вывести статистику по тексту.
        * Ко всему этому использовать паттерн Chain of Responsibilities*/
        IsEmptyFile isEmptyFile = new IsEmptyFile();
        isEmptyFile.check(filename);

        IsFile isFile = new IsFile();
        isFile.check(filename);

        FileWr.write(filename, text);

        String textFromFile = FileRead.read(filename);
        System.out.println(textFromFile);

        Сounting counting = new Сounting();
        counting.doingTheCountingOfParagraph(textFromFile);
        counting.doingTheCountingOfSentences(textFromFile);
        counting.doingTheCountingOfWords(textFromFile);

    }
}
