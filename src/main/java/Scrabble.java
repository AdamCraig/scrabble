import java.util.ArrayList;
import java.util.HashMap;

public class Scrabble {
  public static void main(String[] args) {}

    public Integer scrabbleScore(String input) {
      // String inputtedCharacters = input;
      // char[] inputtedCharactersArray = inputtedCharacters.toCharArray();
      //
      Integer score = 0;

      HashMap<Character, Integer> letterScores = new HashMap<Character, Integer>();
      letterScores.put('a', 1);

      score = letterScores.get(input.charAt(0));

      // for (Integer index = 0; index <= inputtedCharactersArray.length; index++) {
      //   if (inputtedCharactersArray[index].keySet('a')) {
      //     score += inputtedCharactersArray[index].values();
      //   }
      // }
      return score;
    }
}
