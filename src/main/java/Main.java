
public class Main {
    public static void main(String[] args) {
        TextTransformer textTransformer = new TextTransformer();
        InverseTransformer inverseTransformer = new InverseTransformer();
        UpDownTransformer upDownTransformer = new UpDownTransformer();
        TextSaver textSaver = new TextSaver("TextTransformer.txt", textTransformer);
        textSaver.saveTextToFile("AbraCadabra");
        textSaver = new TextSaver("InverseTransformer.txt", inverseTransformer);
        textSaver.saveTextToFile("AbraCadabra");
        textSaver = new TextSaver("UpDownTransformer.txt", upDownTransformer);
        textSaver.saveTextToFile("AbraCadabra");
    }
}
