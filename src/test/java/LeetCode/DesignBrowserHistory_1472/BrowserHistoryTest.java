package LeetCode.DesignBrowserHistory_1472;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BrowserHistoryTest {

    private BrowserHistory browserHistory;

    public static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of(
                        new String[] { "BrowserHistory", "visit", "visit", "visit", "back", "back", "forward", "visit",
                                "forward", "back", "back" },
                        new Object[] { "leetcode.com", "google.com", "facebook.com", "youtube.com", 1, 1, 1,
                                "linkedin.com", 2, 2, 7 },
                        new String[] { null, null, null, null, "facebook.com", "google.com", "facebook.com", null,
                                "linkedin.com", "google.com", "leetcode.com" }));
    }

    @MethodSource("getParams")
    @ParameterizedTest
    public void testBrowserHistory(String[] commands, Object[] params, String[] expected) {
        browserHistory = null;
        int len = commands.length;
        for (int i = 0; i < len; i++) {
            assertEquals(expected[i], execute(commands[i], params[i]));
        }
    }

    private String execute(String command, Object param) {
        return switch (command) {
            case "BrowserHistory" -> {
                browserHistory = new BrowserHistory((String) param);
                yield null;
            }
            case "visit" -> {
                browserHistory.visit((String) param);
                yield null;
            }
            case "back" -> browserHistory.back((int) param);
            case "forward" -> browserHistory.forward((int) param);
            default -> throw new RuntimeException("Unknown command: " + command);
        };
    }
}