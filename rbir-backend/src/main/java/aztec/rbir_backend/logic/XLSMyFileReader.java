package aztec.rbir_backend.logic;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by subhahs on 28/05/2017.
 */
public class XLSMyFileReader implements MyFileReader {
    @Override
    public String read(String filePath) {
        System.out.println("Reading XLS file...");
        Tika tika = new Tika();
        String content = null;
        try (InputStream stream = new FileInputStream(filePath)) {
            content = tika.parseToString(stream);
        } catch (TikaException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
