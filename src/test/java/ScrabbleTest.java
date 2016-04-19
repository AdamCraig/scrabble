import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void scrabbleScore_returnsScoreForSingleLetter_score() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, testScrabble.scrabbleScore("z"));
  }

}
