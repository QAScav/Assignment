public class TextLogic {

    private int charCount;
    private int LineCount;
    private String longestWord;

    private boolean isStopped = false;

    public TextLogic() {
        LineCount = 0;
        charCount = 0;
        longestWord = "";
    }

    public int getLineCount() {
        return LineCount;
    }

    public void addLineCount() {
        LineCount++;
    }

    public int getCharCount() {
        return charCount;
    }

    public void addCharCount(String addChar) {
        charCount = charCount + addChar.length();
    }

    public String getLW() {
        return longestWord;
    }

    public void setLW(String newLW) {
        if (longestWord.length() < newLW.length()) {
            this.longestWord = newLW;
        }
    }

    public boolean getStop() {
        return isStopped;
    }

    public void ifStop(String userInput) {
        if (userInput.equals("stop") || userInput.equals("Stop")) {
            isStopped = true;
        }
    }


}








