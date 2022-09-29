package AdditionalTasks.ArmstrongNumbers;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    private final int[][] map = new int[10][11];

    {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = (int) Math.pow(i, j);
            }
        }
    }

    public List<Integer> calculate(int max) {
        List<Integer> integerList = new LinkedList<>();
        int maxLength = length(max);
        int[] array = new int[maxLength];
        do {
            for (int i = length(array); i <= maxLength; i++) {
                int result = algorithm(array, i);
                if (result > 0) {
                    int resultLength = length(result);
                    int checkResult = algorithm(turnNumToArr(result, resultLength), resultLength);
                    if (checkResult == result && !integerList.contains(checkResult)) {
                        integerList.add(checkResult);
                    }
                }
            }

        } while ((array = increment(array, array.length - 1)) != null);

        return integerList;
    }

    private int algorithm(int[] array, int length) {
        int result = 0;
        for (int i = 0; i < length; i++) {
            int tempResult = result + map[array[array.length - 1 - i]][length];
            if (result > tempResult) {
                return -1;
            }
            result = tempResult;
        }
        return result;
    }

    private int length(int[] array) {
        int length = array.length;
        for (int j : array) {
            if (j == 0) {
                length--;
            } else {
                break;
            }
        }
        if (length == 0) {
            return 1;
        } else {
            return length;
        }
    }

    private int[] increment(int[] array, int index) {
        int value = array[index];
        if (value < 9) {
            array[index] = value + 1;
            return array;
        } else {
            if (index > 0) {
                int[] result = increment(array, index - 1);
                if (result != null) {
                    result[index] = result[index - 1];
                }
                return result;
            } else {
                return null;
            }
        }
    }

    protected int[] turnNumToArr(int i, int len) {
        int[] result = new int[len];
        int index = 0;
        for (int j = len - 1; j >= 0; j--) {
            result[index++] = i % 10;
            i /= 10;
        }
        return result;
    }

    public static int length(int value) {
        if (value < 10) {
            return 1;
        } else {
            if (value < 100) {
                return 2;
            } else {
                if (value < 1000) {
                    return 3;
                } else {
                    if (value < 10_000) {
                        return 4;
                    } else {
                        if (value < 100_000) {
                            return 5;
                        } else {
                            if (value < 1_000_000) {
                                return 6;
                            } else {
                                if (value < 10_000_000) {
                                    return 7;
                                } else {
                                    if (value < 100_000_000) {
                                        return 8;
                                    } else {
                                        if (value < 1_000_000_000) {
                                            return 9;
                                        } else {
                                            return 10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
