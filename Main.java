public class EmployeeWageBuilder1{

  public static void main(String args[]){

    int IS_PART_TIME = 1;
    int IS_FULL_TIME = 2;
    int RATE_PER_HOUR = 20;
    int empHour =0;
    int empWage = 0;
    double empCheck = Math.floor(Math.random()*10)%3;

    if(empCheck == IS_FULL_TIME)
      empHour = 8;
    else if(empCheck == IS_PART_TIME)
      empHour = 4;
    else
     empHour = 0;

    empWage = empHour*RATE_PER_HOUR;

    System.out.println("empWage : "+empWage);
     
  }

}
