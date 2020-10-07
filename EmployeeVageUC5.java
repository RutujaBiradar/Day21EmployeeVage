public class EmployeeVageUC5 {
         public static final int IsFullTime = 2;
         public static final int IsPartTime = 1;
         public static final int EmpRatePerHour = 20;
	 public static final int NumOfWorkingDays = 20;
         

	 public static void main(String[] args){

             int empHrs = 0,empVage = 0,totalEmpVage = 0;
             
for (int day = 0; day < NumOfWorkingDays; day++) {
	int empCheck = (int)Math.floor(Math.random() * 10) % 3;         	
	switch (empCheck) {
             	case IsFullTime :
                	empHrs  = 8;
                	break;
             	case IsPartTime :
                	empHrs = 4;
                	break;
             	default :
                	empHrs = 0;
         }
         empVage = empHrs * EmpRatePerHour;
	 totalEmpVage += empVage;
         System.out.println("Emp Vage : " + empVage);
      }
   	System.out.println("Total Emp Vage : " + totalEmpVage);
    }
}
