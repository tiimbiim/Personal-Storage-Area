//********************************************************************
//  MazeSearch.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates recursion.
//********************************************************************

public class hw8_4_Driver
{
   //-----------------------------------------------------------------
   //  Creates a new maze, prints its original form, tries to
   //  solve it, and prints out its final form.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      maze3d labyrinth = new maze3d();
      
      System.out.println (labyrinth);

      if (labyrinth.traverse (0, 0, 0))
         System.out.println ("The maze was successfully solved!");
      else
         System.out.println ("There is no possible path.");

      System.out.println (labyrinth);
   }
}