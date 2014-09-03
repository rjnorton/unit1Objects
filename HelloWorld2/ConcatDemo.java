import java.util.StringTokenizer;

public class ConcatDemo
{
    public static void main(String[] args)
    {
        String animal1 = " quick brown fox";
        String animal2 = " lazy dog";
        String article = "the";
        String action = " jumps over ";
        String concatenated = "";
        concatenated = concatenated.concat(article);
        concatenated = concatenated.concat(animal1);
        concatenated = concatenated.concat(action);
        concatenated = concatenated.concat(article);
        concatenated = concatenated.concat(animal2);
        System.out.println(concatenated);
        
        
        String sentence1 = "      abc   ";
        String sentence2 = "   def";
        String sentence3 = "ghi         ";
        String message = sentence1 + sentence2 + sentence3;
        message = message.replace(" ","");
        System.out.println(message);
        
        
        String sentence = "Mary had a little lamb.";
        StringTokenizer mystery = new StringTokenizer(sentence);
        System.out.println(mystery.countTokens());
        System.out.println(mystery.nextToken());
        System.out.println(mystery.nextToken());
    }
}