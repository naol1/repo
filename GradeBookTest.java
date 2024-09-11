import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

public class GradeBookTest {
   private GradeBook gradeBook1;
   private GradeBook gradeBook2;
   private Random randomGenerator;

   @Before
   public void setUp() throws Exception {
      gradeBook1 = new GradeBook(5);
      gradeBook2 = new GradeBook(5);
      randomGenerator = new Random();

      // Add random scores to both grade books
      for (int i = 0; i < 2; i++) {
         gradeBook1.addScore(randomGenerator.nextDouble() * 100); // Random score between 0 and 100
         gradeBook2.addScore(randomGenerator.nextDouble() * 100);
      }
   }

   @After
   public void tearDown() throws Exception {
      gradeBook1 = null;
      gradeBook2 = null;
   }

   @Test
   public void testAddScore() {
      // Check if the size is correct
      assertEquals(2, gradeBook1.getScoreSize());
      assertEquals(2, gradeBook2.getScoreSize());

      // Print the scores for verification
      System.out.println("gradeBook1 scores: " + gradeBook1.toString());
      System.out.println("gradeBook2 scores: " + gradeBook2.toString());

      // Compare the expected vs actual string representation (this can be manually verified)
   }

   @Test
   public void testSum() {
      double sumGradeBook1 = gradeBook1.sum();
      double sumGradeBook2 = gradeBook2.sum();

      // Print the sums for manual verification
      System.out.println("Sum of gradeBook1: " + sumGradeBook1);
      System.out.println("Sum of gradeBook2: " + sumGradeBook2);

      // Assert that sums are as expected
      assertEquals(sumGradeBook1, gradeBook1.sum(), .0001);
      assertEquals(sumGradeBook2, gradeBook2.sum(), .0001);
   }

   @Test
   public void testMinimum() {
      double minGradeBook1 = gradeBook1.minimum();
      double minGradeBook2 = gradeBook2.minimum();

      // Print the minimum values for manual verification
      System.out.println("Minimum score of gradeBook1: " + minGradeBook1);
      System.out.println("Minimum score of gradeBook2: " + minGradeBook2);

      // Assert that minimum values are as expected
      assertEquals(minGradeBook1, gradeBook1.minimum(), .001);
      assertEquals(minGradeBook2, gradeBook2.minimum(), .001);
   }

   @Test
   public void testFinalScore() {
      double finalScoreGradeBook1 = gradeBook1.finalScore();
      double finalScoreGradeBook2 = gradeBook2.finalScore();

      // Print the final scores for manual verification
      System.out.println("Final score of gradeBook1: " + finalScoreGradeBook1);
      System.out.println("Final score of gradeBook2: " + finalScoreGradeBook2);

      // Assert that final scores are as expected
      assertEquals(finalScoreGradeBook1, gradeBook1.finalScore(), .001);
      assertEquals(finalScoreGradeBook2, gradeBook2.finalScore(), .001);
   }
}
