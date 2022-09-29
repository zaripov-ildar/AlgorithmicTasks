package MultiThreading;

public class Game {

    public static void main(String[] args) throws InterruptedException {
        final Player player1 = new Player("Ironman");
        final Player player2 = new Player("Batman");

        for (int i = 0; i < 10; i++) {
            final int k = i;
            (new Thread(()->makePass(k, player1, player2))).start();
            (new Thread(()->makePass(k, player2, player1))).start();
        }

    }

    private static void makePass(int num, Player player1, Player player2) {
        Player lock1, lock2;
        if (player1.getName().equals("Batman")){
            lock1 = player1;
            lock2 = player2;
        }
        else{
            lock1 = player2;
            lock2 = player1;
        }
        synchronized (lock2) {
            System.out.println(player2.getName() + " blocked in " + num);
            synchronized (lock1) {
                System.out.println(player1.getName() + " blocked in " + num);
                player1.kickBall(num);
                player2.catchBall(num);
            }
        }
        System.out.println("both players free in "+num);
    }
}
