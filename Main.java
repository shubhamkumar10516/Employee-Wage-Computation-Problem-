public class Main{


  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  private final String company;
  private final int empRatePerHr;
  private final int nmOfDays;
  private final int maxHrPerMonth;
  private int totalEmpWage;

  public Main(String company, int empRatePerHr , int nmOfDays, int maxHrPerMonth){
   this.company = company;
   this.empRatePerHr = empRatePerHr;
   this.nmOfDays = nmOfDays;
   this.maxHrPerMonth = maxHrPerMonth;

   }
  
  public void computeWage(){
    int empHour =0, totalEmpHrs = 0, totalWorkingDays = 0;
    int empWage = 0;
   
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
    }

    public String toString(){
     return (" total employee Wage for "+company+" is "+totalEmpWage);
    }
     
  

  
  public static void main(String args[]){

    Main dMart = new Main("DMart", 20, 2, 10);
    Main reliance = new Main("Reliance", 10, 2, 10);
    dMart.computeWage();
    System.out.println(dMart.toString());
    reliance.computeWage();
    System.out.println(reliance.toString());
    
  }   

}
