import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWr {
    public static void write(String filename, String text) throws RuntimeException {
        File file = new File(filename);
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
