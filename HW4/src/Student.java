
public class Student
{
   private String firstName, lastName;
   TestScores Test;
   private Address homeAddress, schoolAddress;
   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home,
                   Address school, TestScores test)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      Test = test;
   }

   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress;
      result += "Test Scores : " + Test;
      return result;
   }
}
