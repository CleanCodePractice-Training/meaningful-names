package com.mdejesus.cleancodesamples.meaningfulnames.partone;

public class MeaningfulDistinctions {

  public static void copyChars(char a1[], char a2[]){
    for(int i=0; i < a1.length; i++){
      a2[i] = a1[i];
    }
  }

  public static void copyCharacters(char source[], char destination[]){
    for(int i=0; i < source.length; i++){
      destination[i] = source[i];
    }
  }

  public void getActiveAccount(){}
  public void getActiveAccounts(){}
  public void getActiveAccountInfo(){}

}
