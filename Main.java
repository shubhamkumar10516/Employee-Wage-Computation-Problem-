public class EmployeeWageBuilder1{

  public static void main(String args[]){

    int IS_PART_TIME = 0;
    int IS_FULL_TIME = 1;
    int RATE_PER_HOUR = 20;
    int empHour =0;
    int empWage = 0;
    double empCheck = Math.floor(Math.random()*10)%2;

    if(empCheck == IS_FULL_TIME)
      empHour = 8;
    
    empWage = empHour*RATE_PER_HOUR;

    System.out.println("empWage : "+empWage);
     
  }

}
