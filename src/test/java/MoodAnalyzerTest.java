import moodAnalyzer.MoodAnalysisError;
import moodAnalyzer.MoodAnalysisException;
import org.junit.Assert;
import org.junit.Test;
import moodAnalyzer.MoodAnalyzer;
public class MoodAnalyzerTest {


    @Test
    public void testAnalyseMood() throws MoodAnalysisException {
        // Test valid message
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);

        // Test null message
        moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisError.EMPTY_OR_NULL_MOOD_ERROR, e.getError());
        }

        // Test empty message
        moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisError.EMPTY_OR_NULL_MOOD_ERROR, e.getError());
        }

        // Test invalid message
        moodAnalyzer = new MoodAnalyzer("I am in a Mood");
    }
    }
