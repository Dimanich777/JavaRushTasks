package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hippodrome {

    static Hippodrome game = null;
    private List<Horse> horses = new ArrayList<>();
    

    public Hippodrome(List<Horse> horses){

        this.horses=horses;
    }

    
        public void move(){
        for (Horse horse: getHorses() ){

            horse.move();
        }
    }

        public void print(){
            for (Horse horse: getHorses() ){

                horse.print();
            }

            for (int i= 0; i<10; i++){
                System.out.println();
            }
        }


        public void run() throws InterruptedException {
            for (int i=0; i<100; i++){
                move();
                print();
                Thread.sleep(200);
            }
        }
        public Horse getWinner() {
            Horse winner = new Horse("", -1, -1);
            for (Horse h : getHorses()) {
                if (h.getDistance() > winner.getDistance())
                    winner = h;
            }
            return winner;
        }

        public void printWinner(){
            System.out.println("Winner is " + getWinner().getName()+ "!");
        }


    public  List<Horse> getHorses() {
        return horses;
    }



    public static void main(String[] args) throws InterruptedException {


        game = new Hippodrome(new ArrayList<>());


        Horse horse1 = new Horse("\uD83D\uDC0E Amy", 3,0);
        Horse horse2 = new Horse("April", 3,0);
        Horse horse3 = new Horse("March",3,0);



        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.run();
        game.printWinner();

    }


}
