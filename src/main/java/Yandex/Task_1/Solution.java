package Yandex.Task_1;

import java.io.*;
import java.util.Arrays;


class Solution {
    /*
   Для чтения входных данных необходимо получить их
   из стандартного потока ввода (System.in).
   Данные во входном потоке соответствуют описанному
   в условии формату. Обычно входные данные состоят
   из нескольких строк. Можно использовать более производительные
   и удобные классы BufferedReader, BufferedWriter, Scanner, PrintWriter.

   С помощью BufferedReader можно прочитать из стандартного потока:
   * строку -- reader.readLine()
   * число -- int n = Integer.parseInt(reader.readLine());
   * массив чисел известной длины (во входном потоке каждое число на новой строке) --
   int[] nums = new int[len];
   for (int i = 0; i < len; i++) {
       nums[i] = Integer.parseInt(reader.readLine());
   }
   * последовательность слов в строке --
   String[] parts = reader.readLine().split(" ");

   Чтобы вывести результат в стандартный поток вывода (System.out),
   Через BufferedWriter можно использовать методы
   writer.write("Строка"), writer.write('A') и writer.newLine().

   Возможное решение задачи "Вычислите сумму чисел в строке":
   int sum = 0;
   String[] parts = reader.readLine().split(" ");
   for (int i = 0; i < parts.length; i++) {
       int num = Integer.parseInt(parts[i]);
       sum += num;
   }
   writer.write(String.valueOf(sum));
   */
    public static int calculate(int box10, int box50, int amount, int[] capacities) {
        Arrays.sort(capacities);
        amount--;
        while (amount >= 0 && box10 + box50 > 0) {
            while (capacities[amount] >= 50 && box50 > 0) {
                capacities[amount] -= 50;
                box50--;
            }
            while (capacities[amount] >= 10 && box10 > 0) {
                capacities[amount] -= 10;
                box10--;
            }
            amount--;
        }
        return box10 + box50 > 0 ? -1 : capacities.length - amount - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = reader.readLine().split(" ");
        int box10 = Integer.parseInt(parts[0]);
        int box50 = Integer.parseInt(parts[1]);
        int amount = Integer.parseInt(parts[2]);

        int[] capacities = readCapacities(reader);

        int answer = calculate(box10, box50, amount, capacities);

        writer.write(String.valueOf(answer));
        reader.close();
        writer.close();
    }

    private static int[] readCapacities(BufferedReader reader) throws IOException {
        String[] capacities = reader.readLine().split(" ");
        int[] result = new int[capacities.length];
        for (int i = 0; i < capacities.length; i++) {
            result[i] = Integer.parseInt(capacities[i]);
        }
        return result;
    }
}
