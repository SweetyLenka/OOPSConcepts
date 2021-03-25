package EmployeeWage;

public class EmployeeWage {
	public static int Attendance()
	{
		int attendance= (int) Math.floor(Math.random()*10%2);
		return attendance;
		
	}
	public static void ComputeAttendance()
	{
		int empCheck=Attendance();
		if(empCheck==1)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeAttendance();
		
	}

}

	
	
	