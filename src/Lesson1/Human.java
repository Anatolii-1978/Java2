package Lesson1;

public class Human implements GetResult {

    private int jumping;
    private int running;

    public Human(int jumping, int running) {
        this.jumping = jumping;
        this.running = running;
    }

    @Override
    public String toString() {
        return "Human: "  + " " + this.jumping + " " + this.running;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }

    @Override
    public boolean canPass(Obstacle o) {
        boolean canRun = (running>=o.getLenght());
        if (canRun){
            System.out.println("Человек пробежал "+ o.getLenght()+"м");
        }else {
            System.out.println("Человек не пробежал");
        }
        boolean canJump=(jumping>=o.getHeight());
        if (canJump){
            System.out.println("Человек перепрыгнул "+ o.getHeight()+" м");

        }else {
            System.out.println("Челове не перепрыгнул");
        }

        return canRun && canJump;
    }

}