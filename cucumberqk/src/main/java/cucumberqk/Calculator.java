package cucumberqk;

public class Calculator {
	String errMsg;
	public int add(int x, int y)
	{

		if ((x>0 && x<100) &&(y>0 && y<100))
		{
			return x+y;
		}
		return -1;
		

	}
	public void getErrorMessage()
	{
		errMsg="Numbers are not integer please Enter Integer Number";
		System.out.println(errMsg);
		
	}
	public int add(double d, double e) {
		// TODO Auto-generated method stub
		return -1;
	}
	public int add(int d, double e) {
		// TODO Auto-generated method stub
		return -1;
	}
	public int add(double d, int e) {
		// TODO Auto-generated method stub
		return -1;
	}
}
