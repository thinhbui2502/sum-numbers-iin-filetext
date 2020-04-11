import java.io.*;

public class ReadFileExample {
    public void readFileExample (String filePath) throws IOException {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("Sum = " + sum);
        } catch (Exception ex) {
            System.out.println("Error: File is not available or something wrong in the content! ");
        }
    }
}

