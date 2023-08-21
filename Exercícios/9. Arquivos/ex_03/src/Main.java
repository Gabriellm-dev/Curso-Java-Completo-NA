import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning" , "Good afternoon", "Good night"};

        String path = "C:\\Workspace\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            // new FileWriter(path, true) para acrescentar sempre no arquivo.
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}