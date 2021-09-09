package com.mdejesus.cleancodesamples.meaningfulnames.parttwo;

public class SearchableNames {

  public void NonSearchableName(){
    int s =0;
    int t[] = new int[5];

    for (int j=0; j<34; j++){
      s += (t[j]*4/5);
    }
  }

  public void SearchableName(){
    int sum = 0;
    int taskEstimate[] = new int[5];

    final int NUMBER_OF_TASKS = 34;
    int realDaysPerIdealDay = 4;
    final int WORK_DAYS_PER_WEEK = 5;

    for (int j=0; j < NUMBER_OF_TASKS; j++){
      int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
      int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
      sum += realTaskWeeks;
    }
  }

}
