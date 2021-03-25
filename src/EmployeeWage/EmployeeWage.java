package EmployeeWage;

public class EmployeeWage {
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int FULL_DAY_HOUR=8;
	public static final int HALF_DAY_HOUR=4;
	public static int empWage=0;
	public static int totalempWage=0;
	public static int empHrs=0;
	
	public static int Attendance()
	{
		int attendance= (int) Math.floor(Math.random()*10%3);
		return attendance;
		
	}
	public static void ComputeEmpWageBasedOnHrs()
	{
		for(int day=0;day<=20;day++)
		{
		int empCheck=Attendance();
		switch(empCheck)
		{
		
		case FULL_TIME:
			empHrs=empHrs+FULL_DAY_HOUR;
			break;	
		case PART_TIME:
			empHrs=empHrs+HALF_DAY_HOUR;
			break;
		default:
			empHrs=0;
			
		}
		
	}
		totalempWage=empHrs*WAGE_PER_HOUR;
		System.out.println("Total Employee Wage : "+totalempWage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeWage empWage=new EmployeeWage();
		empWage.ComputeEmpWageBasedOnHrs();
	}

}

	
	
	