import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void scrabbleScore_returnsScoreForSingleLetter_score() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.scrabbleScore("p"));
  }

  @Test
  public void scrabbleScore_returnsScoreForWordWithMultipleLetters_score() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.scrabbleScore("cat"));
  }

  @Test
  public void scrabbleScore_returnsScoreForSentenceWithSpaces_score() {
  Scrabble testScrabble = new Scrabble();
  Integer expected = 17;
  assertEquals(expected, testScrabble.scrabbleScore("kitty cat"));
  }

  @Test
  public void scrabbleScore_returnsScoreForSentenceWithCapitalLetters_score() {
  Scrabble testScrabble = new Scrabble();
  Integer expected = 15;
  assertEquals(expected, testScrabble.scrabbleScore("DOG WOOF"));
  }

}
