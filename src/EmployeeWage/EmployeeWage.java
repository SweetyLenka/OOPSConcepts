package EmployeeWage;

public class EmployeeWage {
	public static final int WAGE_PER_HOUR=20;
	public static final int FULL_DAY_HOUR=8;
	public static int empWage=0;
	
	public static int Attendance()
	{
		int attendance= (int) Math.floor(Math.random()*10%2);
		return attendance;
		
	}
	public static void ComputeEmpWage()
	{
		int empCheck=Attendance();
		if(empCheck==1)
		{
			empWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
			System.out.println("Employee Wage : "+empWage);
		}
		else
		{
			System.out.println("Employee is absent");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeWage empWage=new EmployeeWage();
		empWage.ComputeEmpWage();
		
	}

}

	
	
	