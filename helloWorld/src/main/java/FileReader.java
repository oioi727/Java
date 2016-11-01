import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public static void main (String[] args)
    {
        try{
            List<String> lines=Files.readAllLines(Paths.get("emails.txt"));
            for(String line:lines){
                System.out.println(line);
                }
            } 
            catch (IOException e) 
            {
                System.out.println(e);
            }
    }
}