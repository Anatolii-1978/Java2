package Lesson1;

public class Main {
    static GetResult [] participants = {new Cat(1,300),
            new Human(2, 500),
            new Robot(3, 10000)};

    static Obstacle [] obstacles = new Obstacle[2];

    public static void main(String[] args) {

        obstacles[0] = new Treadmill(5000);
        obstacles[1] = new Wall(1);

        for(GetResult participant: participants){
            for(Obstacle obstacle:obstacles){
                boolean canPass = participant.canPass(obstacle);
                if(!canPass) break;
            }
        }




        }
    }


