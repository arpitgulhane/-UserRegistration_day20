import org.junit.Assert;
import org.junit.Test;
import moodAnalyzer.MoodAnalyzer;
public class MoodAnalyzerTest {


    @Test
    public void testAnalyseMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
}
