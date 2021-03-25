package EmployeeWage;

public class EmployeeWage {
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int FULL_DAY_HOUR=8;
	public static final int HALF_DAY_HOUR=4;
	public static int empWage=0;
	
	public static int Attendance()
	{
		int attendance= (int) Math.floor(Math.random()*10%3);
		return attendance;
		
	}
	public static void ComputeEmpWageBasedOnHrs()
	{
		int empCheck=Attendance();
		switch(empCheck)
		{
		case FULL_TIME:
			empWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
			
			System.out.println("Employee Wage for " +FULL_DAY_HOUR  +" hours : "+empWage);
			break;
		case PART_TIME:
			empWage=WAGE_PER_HOUR*HALF_DAY_HOUR;
			System.out.println("Employee Wage "+HALF_DAY_HOUR+" hours : " +empWage);
			break;
		default:
			System.out.println("Employee is absent");
			
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeWage empWage=new EmployeeWage();
		empWage.ComputeEmpWageBasedOnHrs();
	}

}

	
	
	