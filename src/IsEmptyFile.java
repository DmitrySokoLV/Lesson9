import java.io.File;

public class IsEmptyFile extends Middleware {
    @Override
    public boolean check(String filename) {
        File file = new File(filename);
        if (!file.isFile()) {
            System.out.println("Файл пустой!");
        }
        return checkNext(filename);
    }
}
