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

}
