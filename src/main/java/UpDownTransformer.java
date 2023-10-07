import java.util.Arrays;

public class UpDownTransformer extends TextTransformer {
    @Override
    public String transform(String text){
        StringBuilder upDownText = new StringBuilder();
        String [] stringArray = text.split("");
        int counter = 1;
        for (String element:stringArray){
            if(counter%2==0){
                upDownText.append(element.toLowerCase());
            }else upDownText.append(element.toUpperCase());
            counter++;
        }
        return upDownText.toString();

    }
}
