package Yandex.Task_2;

import java.io.*;
import java.util.Arrays;

class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int feedWidth = Integer.parseInt(reader.readLine());

        String[] photoAmounts = reader.readLine().split(" ");
        int totalAmount = Integer.parseInt(photoAmounts[0]);
        int forPageAmount = Integer.parseInt(photoAmounts[1]);

        int[] heights = getHeightArray(reader, feedWidth, totalAmount);

        Arrays.sort(heights);

        int minHeight = getSum(heights, 0, forPageAmount);

        int maxHeight = getSum(heights, heights.length - forPageAmount, heights.length);

        writer.write(String.valueOf(minHeight));
        writer.newLine();
        writer.write(String.valueOf(maxHeight));
        reader.close();
        writer.close();
    }

    private static int getSum(int[] heights, int from, int to) {
        int result = 0;
        for (int i = from; i < to; i++) {
            result += heights[i];
        }
        return result;
    }


    private static int[] getHeightArray(BufferedReader reader, int feedWidth, int totalAmount) throws IOException {
        int[] heights = new int[totalAmount];
        while (--totalAmount >= 0) {
            String[] sizes = reader.readLine().split("x");
            int photoWidth = Integer.parseInt(sizes[0]);
            int photoHeight = Integer.parseInt(sizes[1]);
            int newHeight = getHeight(photoWidth, photoHeight, feedWidth);
            heights[totalAmount] = newHeight;
        }
        return heights;
    }


    private static int getHeight(double photoWidth, double photoHeight, double feedWidth) {
        return (int) Math.ceil(feedWidth * photoHeight / photoWidth);
    }

    public String forTest(int feedWidth, int totalAmount, int forPageAmount, String[] sizeString) throws IOException {
        int[] heights = getHeightArray(sizeString, feedWidth, totalAmount);
        Arrays.sort(heights);
        System.out.println(Arrays.toString(heights));
        int minHeight = getSum(heights, 0, forPageAmount);
        int maxHeight = getSum(heights, heights.length - forPageAmount, heights.length);
        return minHeight + " " + maxHeight;
    }

    private static int[] getHeightArray(String[] sizeString, int feedWidth, int totalAmount) throws IOException {
        int[] heights = new int[totalAmount];
        while (--totalAmount >= 0) {
            String[] sizes = sizeString[totalAmount].split("x");
            int photoWidth = Integer.parseInt(sizes[0]);
            int photoHeight = Integer.parseInt(sizes[1]);
            int newHeight = getHeight(photoWidth, photoHeight, feedWidth);
            heights[totalAmount] = newHeight;
        }
        return heights;
    }
}
