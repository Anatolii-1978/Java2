package Lesson1;

public class Robot implements GetResult {

    private int jumping;
    private int running;

    public Robot(int jumping, int running) {
        this.jumping = jumping;
        this.running = running;
    }

    @Override
    public String toString() {
        return "Robot: "  + " " + this.jumping + " " + this.running;
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
            System.out.println("Робот пробежал "+ o.getLenght()+" м");
        }else {
            System.out.println("Роботне пробежал");
        }
        boolean canJump=(jumping>=o.getHeight());
        if (canJump){
            System.out.println("Робот перепрыгнул "+ o.getHeight()+" м");

        }else {
            System.out.println("Робот не перепрыгнул");
        }

        return canRun && canJump;
    }
    }
