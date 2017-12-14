

public class StudentBody 
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
	  TestScores atest = new TestScores(97, 92, 96);
	  TestScores mtest = new TestScores(100, 96, 87);
	  
      Address school = new Address ("800 Lancaster Ave.", "Villanova", "PA", 19085);

      Address aHome = new Address ("Kure Naval Base", "Hiroshima", "Jp", 24551);
      Student akagi = new Student ("Akagi", "G.", aHome, school, atest);

      Address tHome = new Address ("8996 God Road", "Saigon", "Vt", 44132);
      Student tim = new Student ("Tim", "Vu", tHome, school, mtest);
      
      System.out.println (akagi);
      System.out.println ();
      System.out.println (tim);
   }
}
