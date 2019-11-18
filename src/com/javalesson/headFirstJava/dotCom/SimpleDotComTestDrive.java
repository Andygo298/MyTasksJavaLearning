package com.javalesson.headFirstJava.dotCom;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }
}

class SimpleDotCom{
    private int[] locationCells;
    private int numOfHits = 0;

    void setLocationCells(int[] locs){
        locationCells = locs;
    }

    String checkYourself(String stringGuess){
       int guess = Integer.parseInt(stringGuess);
       String result = "Мимо";
       for(int cell : locationCells){
           if(guess == cell){
               result = "Попал";
               numOfHits++;
               break;
           }
       }
       if (numOfHits == locationCells.length){
           result = "Потопил";
       }
        System.out.println(result);
       return result;
    }
}
