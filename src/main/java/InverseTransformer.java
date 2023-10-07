public class InverseTransformer extends TextTransformer{
    @Override
    public String transform(String text){
        StringBuilder reverseText = new StringBuilder(text);
        reverseText.reverse();
        return reverseText.toString();
    }
}
