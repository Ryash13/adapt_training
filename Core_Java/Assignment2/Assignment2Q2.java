import java.lang.*;
import java.util.*;

class Manager extends Assignment2Q2 {
    private int incentive = 5000;
      @Override
      public int getSalary(int salary) {
          int managerTotal = salary + incentive;
          return managerTotal;
      }
}

class Labour extends Assignment2Q2 {
    private int overtime = 500;
      @Override
      public int getSalary(int salary) {
          int labourTotal = salary + overtime;
          return labourTotal;
      }
}

public class Assignment2Q2 {
      int salary = 10000;
      public int getSalary(int salary){
          this.salary = salary;
          return salary;
      }
      public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
          int totalEmployeeSal = 0;
          for(Integer i : employeeSalaries)
              totalEmployeeSal += i;
          return totalEmployeeSal;
      }
      public static void main(String[] args) {
      }
}
