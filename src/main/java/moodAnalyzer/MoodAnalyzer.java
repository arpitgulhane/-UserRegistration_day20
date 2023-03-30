package moodAnalyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {}

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        if (message == null || message.isEmpty()) {
            throw new MoodAnalysisException(MoodAnalysisError.EMPTY_OR_NULL_MOOD_ERROR);
        }
        if (message.contains("Sad")) {
            return "SAD";
        } else if(message.contains("Null")) {
            return "HAPPY";
        }else {
                return "invalid";
        }
    }

    public static void main(String[] args) {

    }
}

