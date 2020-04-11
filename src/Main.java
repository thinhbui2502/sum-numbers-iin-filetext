import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the file path: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileExample(path);
    }
}

// File Path test:
// fileForTest.txt
// C:\Users\Admin\Downloads\TestFileIO\fileTest.txt