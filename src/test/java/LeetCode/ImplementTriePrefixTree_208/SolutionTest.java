package LeetCode.ImplementTriePrefixTree_208;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Trie trie = new Trie();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
//                Arguments.of(
//                        new String[]{"Trie", "insert", "search", "search", "startsWith", "insert", "search"},
//                        new String[][]{{null}, {"apple"}, {"apple"}, {"app"}, {"app"}, {"app"}, {"app"}},
//                        new Boolean[]{null, null, true, false, true, null, true}
//                ),
                Arguments.of(new String[]{"Trie", "insert", "insert", "insert", "insert", "insert", "insert", "search", "search", "search", "search", "search", "search", "search", "search", "search", "startsWith", "startsWith", "startsWith", "startsWith", "startsWith", "startsWith", "startsWith", "startsWith", "startsWith"},
                        new String[][]{{}, {"app"}, {"apple"}, {"beer"}, {"add"}, {"jam"}, {"rental"}, {"apps"}, {"app"}, {"ad"}, {"applepie"}, {"rest"}, {"jan"}, {"rent"}, {"beer"}, {"jam"}, {"apps"}, {"app"}, {"ad"}, {"applepie"}, {"rest"}, {"jan"}, {"rent"}, {"beer"}, {"jam"}},
                        new Boolean[]{null,null,null,null,null,null,null,false,true,false,false,false,false,false,true,true,false,true,true,false,false,false,true,true,true})
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(String[] commands, String[][] values, Boolean[] expected) {
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("Trie") || commands[i].equals("insert")) {
                for (int j = 0; j < values[i].length; j++) {
                    assertNull(subTest(commands[i],
                            values[i]
                                    [j]));
                }
            } else {
                for (int j = 0; j < values[i].length; j++) {
                    Boolean actual = subTest(commands[i], values[i][j]);
                    System.out.println("expected: " + expected[i]);
                    System.out.println("value: " + values[i][j]);
                    assertEquals(expected[i], actual);

                    System.out.println("================");
                }
            }
        }
    }

    private Boolean subTest(String command, String value) {
        switch (command) {
            case "Trie" -> {
                trie = new Trie();
                return null;
            }
            case "insert" -> {
                trie.insert(value);
                return null;
            }
            case "search" -> {

                boolean search = trie.search(value);
                System.out.println("search: " + search);
                return search;
            }
            default -> {
                boolean starts = trie.startsWith(value);
                System.out.println("starts: " + starts);
                return starts;
            }
        }
    }

}