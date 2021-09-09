package com.mdejesus.cleancodesamples.meaningfulnames.parttwo;

public class MemberPrefixes {

}

class Part{
  private String m_dsc; // The textual description

  void setName(String name){
    m_dsc = name;
  }
}

class PartFixed{
  private String description;

  void setDescription(String description){
    this.description = description;
  }
}
