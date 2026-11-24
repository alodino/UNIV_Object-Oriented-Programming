/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

class CountWordsInText {
    private String[] doc;
    private Map<String, Integer> wordsMap;
    private ArrayList<String> wordsList;

    public CountWordsInText(String[] doc) {
        this.doc = doc;
        wordsMap = new HashMap<String, Integer>();
        wordsList = new ArrayList<String>();
    }
    public void countWords() {
        for (String sentence : doc) {  // doc 배열의 각 문장 별로 처리
            String[] words = sentence.split("(\\,|\\!|\\;|\\.|\\s+)+");
            for (String word : words) {
                if (wordsMap.containsKey(word)) {
                    wordsMap.put(word, wordsMap.get(word) + 1);
                }
                else {
                    wordsList.add(word); // 리스트에 새로운 단어 추가
                    wordsMap.put(word, 1);
                }
            }
        }
    }
    public void printWordsShownMoreThan(int n) {
        for (String word : wordsList) {
            int num = wordsMap.get(word);
            if (num >= n) { System.out.printf("%s : %d\n", word, num); }
        }
    }

    public static void main(String[] args) {
        String doc[] = {
                "Hear the sledges with the bells",
                "Silver bells!",
                "What a world of merriment their melody foretells!",
                "How they tinkle, tinkle, tinkle,",
                "In the icy air of night!",
                "While the stars, that oversprinkle",
                "All the heavens, seem to twinkle",
                "With  a crystalline delight;",
                "Keeping time, time, time,",
                "In a sort if Runic rhyme,",
                "To the tintinabulation that so musically wells",
                "From the bells, bells, bells, bells,",
                "Bells, bells, bells,",
                "From the jingling and the tinkling of the bells."
        };

        CountWordsInText countWords = new CountWordsInText(doc);
        countWords.countWords();
        countWords.printWordsShownMoreThan(3);
    }
}