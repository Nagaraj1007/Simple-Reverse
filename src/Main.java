
public class Main {
    public static String reverse(String word){
        char wordCharacters[] = word.toCharArray();
        int start = 0, end = wordCharacters.length - 1;
        while (start < end){
            char temp = wordCharacters[start];
            wordCharacters[start] = wordCharacters[end];
            wordCharacters[end] = temp;
            start++;
            end--;
        }
        return new String(wordCharacters);
    }

    public static void main(String[] args) {
        System.out.println(reverse("academy"));
    }
}