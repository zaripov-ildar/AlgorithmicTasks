package LeetCode.DesignAddandSearchWordsDataStructure_211;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {

    WordDictionary wordDictionary;

    public static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of(
                        new String[]{"WordDictionary", "addWord", "addWord", "addWord", "search", "search", "search", "search"},
                        new String[]{null, "bad", "dad", "mad", "pad", "bad", ".ad", "b.."},
                        new Boolean[]{null, null, null, null, false, true, true, true}
                )
        );
    }

    @MethodSource("getParams")
    @ParameterizedTest
    public void testBrowserHistory(String[] commands, String[] params, Boolean[] expected) {
        wordDictionary = null;
        int len = commands.length;
        for (int i = 0; i < len; i++) {
            assertEquals(expected[i], execute(commands[i], params[i]));
        }
    }

    private Boolean execute(String command, String param) {
        return switch (command) {
            case "WordDictionary" -> {
                wordDictionary = new WordDictionary();
                yield null;
            }
            case "addWord" -> {
                wordDictionary.addWord(param);
                yield null;
            }
            case "search" -> wordDictionary.search(param);
            default -> throw new RuntimeException("Unknown command: " + command);
        };
    }

}