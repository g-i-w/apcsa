public class Mystery {
public String mystery(String word, int num)
{
    String result = "";
    for (int k = num; k >= 0; k--)
    {
        result += word.substring(0, k);
    }
    return result;
}

public static void main(String[] args) {
    Mystery a = new Mystery();
    System.out.println( a.mystery("computer", 4) );
}

}