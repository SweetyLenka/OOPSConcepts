
package EmployeeWage;

public class EmployeeWage {
	public static final int WAGE_PER_HOUR=20;
	public static final int FULL_DAY_HOUR=8;
	public static final int HALF_DAY_HOUR=4;
	public static int days=0;
	public static int totalWorkingHrs=0;
	public static int totalempWage=0;
	public static int empHrs=0;
	
	public static int Attendance()
	{
		int attendance= (int) Math.floor(Math.random()*10%3);
		return attendance;
		
	}
	public static void ComputeEmpWageBasedOnHrs()
	{
		while((days<20)&&(totalWorkingHrs<100))
		{
			int empCheck=Attendance();
			if(empCheck == 1)
			{
				System.out.println("Day "+days++);
				totalWorkingHrs=totalWorkingHrs+FULL_DAY_HOUR;
				System.out.println("Employee is present for full time");
				System.out.println("TotalWorkingHrs : "+totalWorkingHrs);
				
			}
			else if(empCheck == 2)
			{
				System.out.println("Day "+days++);
				totalWorkingHrs=totalWorkingHrs+HALF_DAY_HOUR;
				System.out.println("Employee is present for half time");
				System.out.println("TotalWorkingHrs : "+totalWorkingHrs);
				
			}
			else
			{
				System.out.println("Day "+days++);
				totalWorkingHrs=totalWorkingHrs+0;
				System.out.println("Employee absent");
				System.out.println("TotalWorkingHrs : "+totalWorkingHrs);
				
			}
			
		}
		totalempWage=WAGE_PER_HOUR*totalWorkingHrs;
		System.out.println("Total Employee Wage : "+totalempWage);
		
		
		
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeWage empWage=new EmployeeWage();
		empWage.ComputeEmpWageBasedOnHrs();
	}

}

	
	
	
