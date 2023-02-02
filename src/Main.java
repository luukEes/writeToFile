
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void writeToFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String exit = "quit";
        String input = scanner.next();
        Path path1 = Paths.get(fileName);
        List <String> outList = new ArrayList<>();
        try {
            while (true) {
                    System.out.println("enter string to save or type quit to exit");
                    input = scanner.nextLine();
                    outList.add(input);
                    Files.write(path1,outList);
                    if (input.equals(exit)) {
                        return;
                    }
            }
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }
    public static void main (String[]args) throws FileNotFoundException {
        writeToFile("Kunolis.txt");
    }
}
