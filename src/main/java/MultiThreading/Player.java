package MultiThreading;

public class Player {
    private boolean ball;
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public boolean hasBall() {
        return ball;
    }

    public String getName() {
        return name;
    }

    public void kickBall(int num){
        System.out.println(name + " kicked a ball in " + num);
        ball = false;
    }

    public void catchBall(int num){
        ball = true;
        System.out.println(name + " caught a ball in " + num);
    }
}
