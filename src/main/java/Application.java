import utils.Reader;
import utils.Writer;

public class Application {
    private static Reader reader = new Reader();
    private static Writer writer = new Writer();

    public static void main(String[] args) {
        var x = reader.getFileContent(1);
        writer.writeToFile(1,x);
    }
}
