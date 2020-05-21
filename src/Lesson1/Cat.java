package Lesson1;

public class Cat implements GetResult {
    private int jumping;
    private  int running;

    public Cat (int jumping, int running){

        this.jumping=jumping;
        this.running=running;
    }



    @Override
    public String toString() {
        return "Cat: " +" "+ this.jumping+" "+this.running;
    }


    @Override
    public void jump() {
      System.out.println(" Cat jump");
    }

    @Override
    public void run() {

    }

    @Override
    public boolean canPass(Obstacle o) {
        boolean canRun = (running>=o.getLenght());
        if (canRun){
            System.out.println("Кот пробежал "+ o.getLenght()+" м");
        }else {
            System.out.println("Кот не пробежал");
        }
        boolean canJump=(jumping>=o.getHeight());
        if (canJump){
            System.out.println("Кот перепрыгнул "+ o.getHeight()+" м");

        }else {
            System.out.println("Кот не перепрыгнул");
        }

        return canRun && canJump;
    }
}
