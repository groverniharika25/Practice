package strings;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length() == 0 ) return true ;
        for (int i = 1; i <= s.length(); i++) {
            if (wordDict.contains(s.substring(0, i)) && (wordBreak(s.substring(i, s.length()), wordDict))) {
               // System.out.println(s.substring(0, i)); {
                   // System.out.println(s.substring(i, s.length()));
                    return true;
                }

        }
        return false;
    }


    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        WordBreak wordBreak = new WordBreak();
        wordBreak.wordBreak(s, wordDict);
        System.out.println(wordBreak.wordBreak(s, wordDict));
    }
}
