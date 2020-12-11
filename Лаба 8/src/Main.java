import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("file for read")) {
            int symbol;
            while ((symbol = reader.read()) != -1) {
                System.out.print((char) symbol);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}