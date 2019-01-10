package com.javarush.task.task17.task1714;

/* 
Comparable
*/

import java.util.ArrayList;
import java.util.Collections;

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }
    //Это мое решение задачи
    public synchronized int compareTo(Beach beach){
        double resultDist = this.distance - beach.getDistance();
        float resultQual = beach.getQuality() - this.getQuality();
//        int resultName = this.name.compareTo(beach.getName());
        System.out.println(getName() + " compareTo " + beach.getName()  + " resultDist = " + resultDist + " resultQual = " + resultQual);
        return (int)resultDist + (int)resultQual;
    }

    //Добавил вот такую проверку
    public static void main(String args[]){
        Beach beach1=new Beach("beach1",44f,3);
        Beach beach2=new Beach("beach2",19f,2);
        Beach beach3=new Beach("beach3",30f,3);
        Beach beach4=new Beach("beach4",20f,6);
        Beach beach5=new Beach("beach5",22f,2);

        ArrayList<Beach> beaches = new ArrayList<Beach>();

        beaches.add(beach1);
        beaches.add(beach2);
        beaches.add(beach3);
        beaches.add(beach4);
        beaches.add(beach5);

        for (Beach x : beaches)
            System.out.println(x.getName() + ", distance = " + x.getDistance() + ", quality =  "+ x.getQuality());


        System.out.println();

        Collections.sort(beaches);

        for (Beach x : beaches)
            System.out.println(x.getName() + ", distance = " + x.getDistance() + ", quality =  "+ x.getQuality());

    }
}