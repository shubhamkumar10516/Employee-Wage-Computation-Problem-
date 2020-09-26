public class Main{


  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  
  private int noOfCompany = 0;
  private CompanyEmpWage[] empArray;
  
  public Main(){
   empArray = new CompanyEmpWage[5];
  }
  public void addEmployeeToArr(String com, int ratePerHr, int noOfDays, int maxHrPerMonth){
   
     empArray[noOfCompany++] = new CompanyEmpWage(com, ratePerHr, noOfDays, maxHrPerMonth);

  }

  public void computeWage(){

   for(int i = 0 ; i < noOfCompany ; i++){

        empArray[i].setTotalEmpWage(this.calcEmpWage(empArray[i]));
     }
   }
  
  public int calcEmpWage(CompanyEmpWage employee){
    int empHour =0, totalEmpHrs = 0, totalWorkingDays = 0;
    int empWage = 0;
   
    while(totalEmpHrs <= employee.getMaxHrPerMonth() && totalWorkingDays <= employee.getNmOfDays()){
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

      return employee.getEmpRatePerHr() * totalEmpHrs;
    }

     
  

  
  public static void main(String args[]){

    Main empWageBuilder = new Main();
    empWageBuilder.addEmployeeToArr("DMart", 20, 2, 10);
    empWageBuilder.addEmployeeToArr("Reliance", 10, 2, 10);
    
    empWageBuilder.computeWage();
    
    
  }   

}


class CompanyEmpWage{

  private final String company;
  private final int empRatePerHr;
  private final int nmOfDays;
  private final int maxHrPerMonth;
  private int totalEmpWage;
 
  public int getMaxHrPerMonth(){
      return maxHrPerMonth;
  }
  public int getEmpRatePerHr(){
      return empRatePerHr;
  }
  public int getNmOfDays(){
      return nmOfDays;
  }
  public CompanyEmpWage(String company, int empRatePerHr , int nmOfDays, int maxHrPerMonth){
   this.company = company;
   this.empRatePerHr = empRatePerHr;
   this.nmOfDays = nmOfDays;
   this.maxHrPerMonth = maxHrPerMonth;

   }
    public void setTotalEmpWage(int totalEmpWage){
       this.totalEmpWage = totalEmpWage;
       System.out.println(" total employee Wage for "+company+" is "+totalEmpWage);
  }  
 
  public String toString(){
     return (" total employee Wage for "+company+" is "+totalEmpWage);
    }
    
}
