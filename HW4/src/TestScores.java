
public class TestScores 
{
	int Test1, Test2, Test3;
	public TestScores(int test1,int test2,int test3)
	{
		Test1 = test1;
		Test2 = test2;
		Test3 = test3;
	}
	public int average(int test1, int test2, int test3)
	{
		return (test1 + test2 + test3)/3;
	}
	public String toString()
	   {
	      String result;
	      result = Test1 + ", " + Test2 + ", " + Test3;
	      result += "\n" + "Average : " + average(Test1, Test2, Test3);
	      return result;
	   }
}
