public class EmployeeWageBuilderFor{


  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  public static final int RATE_PER_HOUR = 20;
  public static final int NUM_OF_WORKING_DAYS = 20;
  
  public static void main(String args[]){


    int empHour =0;
    int empWage = 0, totalEmpWage = 0;
   
    for(int i = 0 ; i < NUM_OF_WORKING_DAYS; i++){
           int empCheck = (int)Math.floor(Math.random()*10)%3;
           switch(empCheck) {
                case IS_FULL_TIME:
                   empHour = 8;
                   break;
                case IS_PART_TIME:
                   empHour = 4;
                   break;
                default:
                   empHour = 0;
    }

    empWage = empHour*RATE_PER_HOUR;
    totalEmpWage += empWage; 
     System.out.println(" daily employee Wage : "+" "+empWage);
  }
     System.out.println(" total employee Wage : "+" "+totalEmpWage);
     
  }

}
