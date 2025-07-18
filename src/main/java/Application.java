import java.util.List;
import java.util.Scanner;
import service.SolveDay1;
import utils.Reader;
import utils.Writer;

public class Application {
    private static final Reader reader = new Reader();
    private static final Writer writer = new Writer();

    private static final SolveDay1 solveDay1 = new SolveDay1();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What day are you on?\n");
        int day = scanner.nextInt();
        System.out.print("What part are you on?\n");
        int part = scanner.nextInt();
        switch (day) {
            case 1:
                if (part == 1) {
                    writer.writeToFile(
                            1,
                            List.of(solveDay1
                                    .getSantaFloor(reader.getFileContent(1))
                                    .toString()));
                }
                if (part == 2) {
                    writer.writeToFile(
                            1,
                            List.of(solveDay1
                                    .determineWhenSantaGoesToTheBasement(reader.getFileContent(1))
                                    .toString()));
                }
                break;
            default:
                System.out.print("You need to select available day and part!");
                break;
        }
    }
}
