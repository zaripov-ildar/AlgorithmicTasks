import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Creator {
    private static final String fileName = "106. Construct Binary Tree from Inorder and Postorder Traversal";

    public static void main(String[] args) throws IOException {
        String packageName = getPackageName();

        String solutionFilePattern = Files.readString(Path.of("src/main/java/CodeTemplates/Solution.txt"));
        Path solutionClassDir = getPath("main", packageName);
        createFile(solutionClassDir, "Solution.java", String.format(solutionFilePattern, packageName));


        String testFilePattern = Files.readString(Path.of("src/main/java/CodeTemplates/TestArguments.txt"));
        Path testDir = getPath("test", packageName);
        createFile(testDir, "SolutionTest.java", String.format(testFilePattern, packageName));

        String markdownFilePattern = Files.readString(Path.of("src/main/java/CodeTemplates/Task.md"));
        createFile(solutionClassDir, "Task.md", String.format(markdownFilePattern, fileName));


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
        String temp = fileName.replace(".", "");
        String[] tokens = temp.split(" ");
        StringBuilder packageName = new StringBuilder(tokens.length);
        for (int i = 1; i < tokens.length; i++) {
            packageName.append(tokens[i]);
        }
        packageName.append("_").append(tokens[0]);
        return packageName.toString();
    }
}
