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
      letterScores.put('e', 1);
      letterScores.put('i', 1);
      letterScores.put('o', 1);
      letterScores.put('u', 1);
      letterScores.put('l', 1);
      letterScores.put('n', 1);
      letterScores.put('r', 1);
      letterScores.put('s', 1);
      letterScores.put('t', 1);
      letterScores.put('d', 2);
      letterScores.put('g', 2);
      letterScores.put('b', 3);
      letterScores.put('c', 3);
      letterScores.put('m', 3);
      letterScores.put('p', 3);
      letterScores.put('f', 4);
      letterScores.put('h', 4);
      letterScores.put('v', 4);
      letterScores.put('w', 4);
      letterScores.put('y', 4);
      letterScores.put('k', 5);
      letterScores.put('j', 8);
      letterScores.put('x', 8);
      letterScores.put('q', 10);
      letterScores.put('z', 10);

      score = letterScores.get(input.charAt(0));

      // for (Integer index = 0; index <= inputtedCharactersArray.length; index++) {
      //   if (inputtedCharactersArray[index].keySet('a')) {
      //     score += inputtedCharactersArray[index].values();
      //   }
      // }
      return score;
    }
}
