package com.mdejesus.cleancodesamples.meaningfulnames.partone;

import java.util.ArrayList;
import java.util.List;

public class IntentionRevealingNames {

  // USE INTENTION-REVEALING NAMES

  int d; // elapsed time in days

  List<int []> theList;

  public List<int[]> getThem(){
    List<int[]> list1 = new ArrayList<>();
    for (int [] x : theList)
      if(x[0] == 4)
        list1.add(x);

    return list1;
  }

  List<Cell> gameBoard;

  public List<Cell> getFlaggedCells(){
    List<Cell> flaggedCells = new ArrayList<>();
    for (Cell cell : gameBoard)
      if(cell.isFlagged())
        flaggedCells.add(cell);

    return flaggedCells;
  }

}

class Cell{
  static final int STATUS_VALUE = 0;
  static final int FLAGGED = 4;
  int [] cell;

  public Cell(){
    cell = new int[6];
  }

  public boolean isFlagged(){
    return cell[STATUS_VALUE] == FLAGGED;
  }
}