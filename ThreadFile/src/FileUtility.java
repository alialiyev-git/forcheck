import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileUtility {
    public static void writeTextToFile(String message, String fileName) {
        try {
            Path path = Paths.get(fileName);
            Files.write(path, message.getBytes(), StandardOpenOption.APPEND);
        } catch(IOException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void writeTextByBuffer(String message, String fileName) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))){
            bw.write(message);
            bw.newLine();
        }catch(IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
