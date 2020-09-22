public class EmployeeWageBuilderFor{


  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  public static final int RATE_PER_HOUR = 20;
  public static final int NUM_OF_WORKING_DAYS = 2;
  public static final int MAX_HRS_IN_MONTH = 10;
  
  public static void main(String args[]){


    int empHour =0, totalEmpHrs = 0, totalWorkingDays = 0;
    int empWage = 0, totalEmpWage = 0;
   
    while(empHour <= MAX_HRS_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS){
           totalWorkingDays++;

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

    
    totalEmpHrs += empHour; 
    System.out.println(" day no : "+totalWorkingDays +" Emp Hr: "+empHour);
  }
    totalEmpWage = Rate_PER_HOUR * totalEmpHrs;
     System.out.println(" total employee Wage : "+totalEmpWage);
     
  }

}
