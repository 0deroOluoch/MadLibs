package com.appnetics;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {
    Scanner scan = new Scanner(System.in);
    String story;
    String name;
    String adjectiveOne;
    String adjectiveTwo;
    String nounOne;
    String nounTwo;
    String nounThree;
    String adverb;
    String randomNums;
    Random rand = new Random();



    public String getStory() {
        return story;
    }

    public String getName() {
        return name;
    }

    public String getAdjectiveOne() {
        return adjectiveOne;
    }

    public String getAdjectiveTwo() {
        return adjectiveTwo;
    }

    public String getNounOne() {
        return nounOne;
    }

    public String getNounTwo() {
        return nounTwo;
    }

    public String getNounThree() {
        return nounThree;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNums() {
        return randomNums;
    }

    public Random getRand() {
        return rand;
    }


    //setters


    public void setStory(String newStory) {
        this.story = newStory;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAdjectiveOne(String newAdjevtiveOne) {
        this.adjectiveOne = newAdjevtiveOne;
    }

    public void setAdjectiveTwo(String newAdjectiveTwo) {
        this.adjectiveTwo = newAdjectiveTwo;
    }

    public void setNounOne(String newNounOne) {
        this.nounOne = newNounOne;
    }

    public void setNounTwo(String newNounTwo) {
        this.nounTwo = newNounTwo;
    }

    public void setNounThree(String newNounThree) {
        this.nounThree = newNounThree;
    }

    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }

    public void setRandomNums() {
        int num = Math.abs(rand.nextInt() % 100);
        int index = 0;
        int[] numberHolder = new int[3];
        while(index< numberHolder.length){
            numberHolder[index] = num + index;
            index++;
        }
        randomNums = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
    }

    public void putTogetherTheStory(){
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
        if(num ==0){
            story = "Odero, Nafula and her friend" + getName() +" went to the meuseum of Kenya today !"
                    +" they saw a " + getNounOne() + " on the shelves. the section that deals with history"
                    +" they then ate a " + getAdjectiveOne() + " because they were hungry. "
                    +" The next day Atieno " + getAdverb() + " to see Luanda Mgere in his " + getNounTwo()
                    +" and then that whole night she gazed at the " + getRandomNums() + " "
                    + getAdjectiveTwo() + " fireworks shooting at the great works of Luanda Magere from " + getNounThree() +".";
        }else {
            story = "You know oder and " + getName() +" are very close friends!"
                    +" they see most of these things like " + getNounOne() + " on a daily basis. They love telling stories of sch things"
                    +" but when they " + getAdjectiveOne() + " they become happpy"
                    +" Sometimes Atieno " + getAdverb() + " and tries the best she can to take care of " + getNounTwo()
                    +" mostly she sits and listen to songs about so many number of times. more like " + getRandomNums() + " "
                    + getAdjectiveTwo() + " see them seated together enjoying their story of " + getNounThree() +".";
        }


       setStory(story);
    }

    public void printInstructions(){
        System.out.println("Welcome to the Madlibs game. " +
                "If you type in words, we will give you a story." +
                " Start by typing in a name");
    }


    public void enterName(){
        setName(scan.nextLine());
    }

    public void enterNounOne(){
        System.out.println("GIve me a noun");
        setNounOne(scan.nextLine());
    }

    public void enterNounTwo(){
        System.out.println("GIve me another noun");
        setNounTwo(scan.nextLine());
    }

    public void enterNounThree(){
        System.out.println("GIve me a noun one last time");
        setNounThree(scan.nextLine());
    }

    public void enterAdjectiveOne(){
        System.out.println("GIve me an adjective");
        setAdjectiveOne(scan.nextLine());
    }

    public void enterAdjectiveTwo(){
        System.out.println("GIve me another adjective");
        setAdjectiveTwo(scan.nextLine());
    }

    public void enterAdverb(){
        System.out.println("now give me an adverb");
        setAdverb(scan.nextLine());
    }

    public void play(){
        enterName();
        enterNounOne();
        enterAdjectiveOne();
        enterAdjectiveTwo();
        enterNounTwo();
        enterAdverb();
        enterNounThree();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());
    }

}
