package com.mdejesus.cleancodesamples.meaningfulnames.parttwo;

import com.mdejesus.cleancodesamples.meaningfulnames.Customer;

public class MethodNames {

  public void Sample() {
    Employee employee = new Employee();
    Customer customer = new Customer();
    Paycheck paycheck = new Paycheck();

    // DO
    String employeeName = employee.getName();
    customer.setName("Marco");
    if (paycheck.isPosted()) {
      int employeeSalary = 0;
    }
  }


}

class Employee{
  String name;

  public String getName(){return null;}
}

class Paycheck{
  boolean isPosted(){return false;}
}
