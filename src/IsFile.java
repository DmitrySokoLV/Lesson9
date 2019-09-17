import java.io.File;

public class IsFile extends Middleware {
    @Override
    public boolean check(String filename) {
        File file = new File(filename);
        if (!file.isFile()) {
            System.out.println("Это не файл!");
        }
        return checkNext(filename);
    }
}
