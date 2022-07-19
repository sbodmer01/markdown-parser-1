import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
        //Path pathToFile = Paths.get("test-file.md");
        //System.out.println(pathToFile.toAbsolutePath());
    }

    @Test
    public void testFile1() throws IOException{
        //Path pathToFile = Paths.get("test-file.md");
        
        String contents= Files.readString(Path.of("./test-file.md"));
        //String contents= Files.readString(pathToFile.toAbsolutePath());

        List<String> expect = List.of("https://something.com", "some-thing.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

}