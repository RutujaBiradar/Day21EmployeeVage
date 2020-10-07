public class EmployeeVageUC6While {
         public static final int IsFullTime = 2;
         public static final int IsPartTime = 1;
         public static final int EmpRatePerHour = 20;
         public static final int NumOfWorkingDays = 2;
	 public static final int MaxHrsInMonth = 10;



         public static void main(String[] args){

             int totalEmpVage = 0, totalWorkingDays = 0, totalEmpHrs = 0;

		while (totalEmpHrs < MaxHrsInMonth && totalWorkingDays < NumOfWorkingDays ){
			
		int empHrs = 0;
		int empVage = 0;
		totalWorkingDays++;
             
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
	 totalEmpHrs += empHrs;
         empVage = empHrs * EmpRatePerHour;
         totalEmpVage += empVage;
         System.out.println("Emp Vage : " + empVage);
      }
        System.out.println("Total Emp Vage : " + totalEmpVage);
    }
}                     
