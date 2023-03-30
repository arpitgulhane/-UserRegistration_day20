package moodAnalyzer;

public class MoodAnalysisException extends Exception {
    private MoodAnalysisError error;

    public MoodAnalysisException(MoodAnalysisError error) {
        super(error.name());
        this.error = error;
    }

    public MoodAnalysisError getError() {
        return error;
    }
}
