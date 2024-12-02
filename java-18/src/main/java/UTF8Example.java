import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * This is an example method.
 * <p>
 * {@snippet :
 * System.out.println("Hello, World!");
 *}
 */
public class UTF8Example {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of("C:\\Git-hub\\java-features\\java-18\\src\\main\\resources\\sample.txt"));
        System.out.println(content);
    }
}
