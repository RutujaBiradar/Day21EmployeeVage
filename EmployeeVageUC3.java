public class EmployeeVageUC3 {
        public static void main(String[] args){
	     int IsPartTime = 1;       
	     int IsFullTime = 2;
             int EmpRatePerHour = 20;
             int empHrs = 0;
             int empVage = 0;
             double empCheck = Math.floor(Math.random() * 10) % 3;
         if (empCheck == IsFullTime)
                empHrs = 8;
	else if (empCheck == IsPartTime)
		empHrs = 4;
         empVage = empHrs * EmpRatePerHour;
         System.out.println("Emp Vage : " + empVage);
    }
}








