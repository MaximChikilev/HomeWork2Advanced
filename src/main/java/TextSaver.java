import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextSaver {
    private String pathToFile;
    private TextTransformer textTransformer;

    public TextSaver(String pathToFile, TextTransformer textTransformer) {
        this.pathToFile = pathToFile;
        this.textTransformer = textTransformer;
    }

    public TextSaver() {
    }

    public String getPath() {
        return pathToFile;
    }

    public void setPath(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public TextTransformer getTextTransformer() {
        return textTransformer;
    }

    public void setTextTransformer(TextTransformer textTransformer) {
        this.textTransformer = textTransformer;
    }
    public void saveTextToFile(String text) {
        Path path = Paths.get(pathToFile);
        try {
            Files.writeString(path,textTransformer.transform(text), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
