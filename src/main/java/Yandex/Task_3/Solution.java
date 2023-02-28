package Yandex.Task_3;

import java.io.*;
import java.util.*;

class Solution {
    static class Task {
        int q;
        int t;

        Task(int q, int t) {
            this.t = t;
            this.q = q;
        }
    }

    static class ExecutorBox {
        static class Executor {
            int num;
            int progress;

            public Executor(int num, int progress) {
                this.num = num;
                this.progress = progress;
            }
        }

        Queue<Executor> workingExecutors;
        PriorityQueue<Executor> freeExecutors;

        public ExecutorBox(int amount) {
            workingExecutors = new LinkedList<>();
            freeExecutors = new PriorityQueue<>(amount, Comparator.comparingInt(o -> o.num));
            for (int i = 1; i <= amount; i++) {
                freeExecutors.add(new Executor(i, 0));
            }
        }

        public boolean hasNext() {
            return !freeExecutors.isEmpty();
        }

        public int giveTaskToExecutor(Task task) {
            Executor e = freeExecutors.poll();
            e.progress = task.t;
            workingExecutors.add(e);
            return e.num;
        }

        public void execute() {
            workingExecutors.forEach(executor -> {
                executor.progress--;
                if (executor.progress == 0) {
                    freeExecutors.add(executor);
                }
            });
            workingExecutors.removeIf(executor -> executor.progress==0);
        }
    }

    static class MyQueue extends LinkedList<Task> {
        int timeWithoutWork;
        int num;

        public MyQueue(int timeWithoutWork, int num) {
            this.timeWithoutWork = timeWithoutWork;
            this.num = num;
        }

        @Override
        public Task poll() {
            timeWithoutWork=0;
            return super.poll();
        }

    }

    static class QBox {
        List<MyQueue> queues;

        public QBox(int qAmount) {
            queues = new ArrayList<>();
            for (int i = 1; i <= qAmount; i++) {
                queues.add(new MyQueue(0, i));
            }
        }

        public void put(Task task) {
            queues.get(task.q - 1).add(task);
        }

        public boolean hasNext() {
            for (MyQueue queue : queues) {
                if (queue.size()>0) {
                    return true;
                }
            }
            return false;
        }

        public Task getTask() {
            queues.forEach(q->q.timeWithoutWork++);
            MyQueue queue = queues.stream()
                    .sorted((o1, o2) -> {
                        if (o1.isEmpty() || o2.isEmpty()) {
                            return o1.size() - o2.size();
                        }
                        int diff = o1.timeWithoutWork - o2.timeWithoutWork;
                        if (diff == 0) {
                            return o2.num - o1.num;
                        }
                        return diff;
                    })
                    .toList()
                    .get(queues.size() - 1);
            return queue.poll();
        }
    }

    public String forTest(int taskAmount, int executorAmount, int queueAmount, String[] data) {
        Map<Integer, List<Task>> tasks = new HashMap<>(taskAmount);
        fillTasks(data, taskAmount, tasks);
        return getAnswer(taskAmount, executorAmount, queueAmount, tasks);
    }

    private void fillTasks(String[] data, int taskAmount, Map<Integer, List<Task>> tasks) {
        for (int i = 0; i < taskAmount; i++) {
            String[] parts = data[i].split(" ");
            int s = Integer.parseInt(parts[0]);
            int q = Integer.parseInt(parts[1]);
            int t = Integer.parseInt(parts[2]);
            if (!tasks.containsKey(s)) {
                tasks.put(s, new ArrayList<>());
            }
            tasks.get(s).add(new Task(q, t));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = reader.readLine().split(" ");
        int taskAmount = Integer.parseInt(parts[0]);
        int executorAmount = Integer.parseInt(parts[1]);
        int queueAmount = Integer.parseInt(parts[2]);

        Map<Integer, List<Task>> secondsTasks = new HashMap<>(taskAmount);
        fillTasks(reader, taskAmount, secondsTasks);

        String answer = getAnswer(taskAmount, executorAmount, queueAmount, secondsTasks);
        writer.write(answer);
        reader.close();
        writer.close();
    }

    private static String getAnswer(int taskAmount, int executorAmount, int queueAmount, Map<Integer, List<Task>> taskBox) {
        ExecutorBox executorBox = new ExecutorBox(executorAmount);
        QBox qBox = new QBox(queueAmount);
        int sec = 1;
        StringBuilder sb = new StringBuilder();
        while (taskAmount > 0) {
            if (taskBox.containsKey(sec)) {
                taskBox.get(sec).forEach(qBox::put);
                taskBox.remove(sec);
            }
            while (executorBox.hasNext() && qBox.hasNext()) {
                Task task = qBox.getTask();
                int num = executorBox.giveTaskToExecutor(task);
                taskAmount--;
                sb.append(num)
                        .append(" ")
                        .append(sec)
                        .append("\n");
            }
            executorBox.execute();
            sec++;
        }
        return sb.toString();
    }


    private static void fillTasks(BufferedReader reader, int taskAmount, Map<Integer, List<Task>> tasks) throws IOException {
        String[] parts;
        for (int i = 0; i < taskAmount; i++) {
            parts = reader.readLine().split(" ");
            int s = Integer.parseInt(parts[0]);
            int q = Integer.parseInt(parts[1]);
            int t = Integer.parseInt(parts[2]);
            if (!tasks.containsKey(s)) {
                tasks.put(s, new ArrayList<>());
            }
            tasks.get(s).add(new Task(q, t));
        }
    }
}
