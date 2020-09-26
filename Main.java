public class Main{


  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  
  public static void computeWage(String company, int empRatePerHr, int nmOfDays, int maxHrPerMonth){
   int empHour =0, totalEmpHrs = 0, totalWorkingDays = 0;
    int empWage = 0, totalEmpWage = 0;
   
    while(totalEmpHrs <= maxHrPerMonth && totalWorkingDays <= nmOfDays){
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
    totalEmpWage = empRatePerHr * totalEmpHrs;
     System.out.println(" total employee Wage for "+company+" is "+totalEmpWage);
     
  }

  
  public static void main(String args[]){

    computeWage("DMart",20,2,10);
    computeWage("Reliance",10,4,20);
 }   

}
