
public class hw8_3Driver
{
   public static void main (String[] args)
   {
      Maze labyrinth = new Maze();
      
      System.out.println (labyrinth);

      if (labyrinth.traverse (0, 0))
         System.out.println ("The maze was successfully solved!");
      else
         System.out.println ("There is no possible path.");

      System.out.println (labyrinth);
   }
}