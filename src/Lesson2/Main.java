package Lesson2;

public class Main {
    private static class MyArraySizeException extends Exception {

    }

    public static void getArray(Object o[][]) throws MyArraySizeException {
        //Object o [][]= new Object[4][4];
        if (!(o.length ==4) ||!(o[0].length==4) ||!(o[1].length==4) ||!(o[2].length==4) || !(o[3].length==4) ) {
        System.out.println("Размер массива  4*4");
    }

    }

    public static void main(String[] args)throws MyArraySizeException {
        getArray ({{"4","6","5"}, {"1", "2","3"}});



    }


}
