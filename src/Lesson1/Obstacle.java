package Lesson1;

public class Obstacle {
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int height;
    public int lenght;

    public Obstacle(int height, int lenght) {
        this.height = height;
        this.lenght = lenght;
    }
}
