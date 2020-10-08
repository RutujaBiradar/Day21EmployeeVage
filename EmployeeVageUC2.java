public class EmployeeVageUC2 {
	public static void main(String[] args){
  	     int IsFullTime = 1;
	     int EmpRatePerHour = 20;
	     int empHrs = 0;
	     int empVage = 0;
	     double empCheck = Math.floor(Math.random() * 10) % 2;
	 if (empCheck == IsFullTime)
		empHrs  = 8;
	 empVage = empHrs * EmpRatePerHour;
	 System.out.println("Emp Vage : " + empVage);
    }
}
