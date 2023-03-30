package moodAnalyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {}

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
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
