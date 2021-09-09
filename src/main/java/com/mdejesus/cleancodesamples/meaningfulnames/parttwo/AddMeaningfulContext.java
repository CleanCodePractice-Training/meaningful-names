package com.mdejesus.cleancodesamples.meaningfulnames.parttwo;

public class AddMeaningfulContext {

  public void printGuessStatistics(char candidate, int count){
    String number;
    String verb = null;
    String pluralModifier = null;

    if(count==0){
      number = "no";
    }else if(count ==1){
      number = "1";
    }else{
      number = Integer.toString(count);
      verb = "are";
      pluralModifier = "s";
    }

    String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);

    System.out.println(guessMessage);
  }
}

class GuessStatisticsMessage{
  private String number;
  private String verb;
  private String pluralModifier;

  public String make(char candidate, int count){
    createPluralDependentMessageParts(count);
    return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
  }

  private void createPluralDependentMessageParts(int count){
    if(count==0){
      thereAreNoLetters();
    }else if(count ==1){
      thereIsOneLetter();
    }else{
      thereAreManyLetters(count);
    }
  }

  private void thereAreManyLetters(int count){
    number = Integer.toString(count);
    verb = "are";
    pluralModifier = "s";
  }

  private void thereIsOneLetter(){
    number = "1";
    verb = "is";
    pluralModifier = "";
  }

  private void thereAreNoLetters(){
    number = "no";
    verb = "are";
    pluralModifier = "s";
  }
}
