import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main (String[] args)
    {
        List<String> fileLines = new ArrayList<String>();
        try{
            List<String> lines=Files.readAllLines(Paths.get("emails.txt"));
            for(String line:lines){

                /*

                    if ((!line.startsWith("Subject:") || (!line.startsWith("From:"))))
                    {
                        fileLines.add(line);
                        System.out.println(line);
                    }
                }
                */

                  if ((line.endsWith("Viceroy Duffield")))
                    {
                        fileLines.add(line);
                    }
                }

                //remove duplicate lines
                lines = lines.stream().distinct().collect(Collectors.toList());

                lines.forEach((line) -> System.out.println(line));
            } 
            catch (IOException e) 
            {
                System.out.println(e);
            }
    }
}