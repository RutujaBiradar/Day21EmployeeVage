public class EmployeeVageUC2Switch {
	 public static final int IsFullTime = 2;
	 public static final int IsPartTime = 1;
         public static final int EmpRatePerHour = 20;

         public static void main(String[] args){
            
             int empHrs = 0;
             int empVage = 0;
             double empCheck = Math.floor(Math.random() * 10) % 3;
         switch ((int)empCheck) {
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
         System.out.println("Emp Vage : " + empVage);
       
   }
}



