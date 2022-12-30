import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Creator {
    private final static String fileName = "797 All Paths From Source to Target";

    public static void main(String[] args) throws IOException {

        String packageName = getPackageName();
        Path classDir = getPath("main", packageName);
        Path testDir = getPath("test", packageName);
        String packageRow = "package LeetCode." + packageName + ";\n\n";
        String solutionFile = packageRow +
                """
                        class Solution {
                                        
                        }
                        """;
        String testFile = packageRow + Files.readString(Path.of("src/main/java/CodeTemplates/TestArguments.txt"));
        createFile(classDir, "Solution.java", solutionFile);
        createFile(testDir, "SolutionTest.java", testFile);

        createFile(classDir, getTXTFileName(), "");


    }

    private static String getTXTFileName() {
        String[] t = fileName.split(" ", 2);
        return t[0] +
                ". " +
                t[1] +
                ".txt";
    }

    private static void createFile(Path dir, String fileName, String textOfFile) throws IOException {
        Files.createDirectories(dir);
        dir = dir.resolve(fileName);
        Files.createFile(dir);
        Files.writeString(dir, textOfFile);
    }

    private static Path getPath(String dirName, String packageName) {
        return Path.of("src/" + dirName + "/java/LeetCode/" + packageName);
    }

    private static String getPackageName() {
        String[] tokens = fileName.split(" ");
        StringBuilder packageName = new StringBuilder(tokens.length);
        for (int i = 1; i < tokens.length; i++) {
            packageName.append(tokens[i]);
        }
        packageName.append("_").append(tokens[0]);
        return packageName.toString();
    }
}
