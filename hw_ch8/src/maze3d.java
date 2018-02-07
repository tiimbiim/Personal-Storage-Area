public class maze3d
{
    private final int TRIED = 3;
    private final int PATH = 7;

    private int[][][] grid = {  { {1,1,1},
    							  {0,1,0},
                			 	  {1,1,1}},

    							 {{0,1,1},
                			 	  {0,0,1},
                			 	  {0,1,1}},

    							 {{0,1,1},
                			 	  {0,0,1},
                			 	  {0,1,1}}
        };

                                            

    public boolean traverse (int row, int column, int page)
    {
        boolean done = false;

        if (valid (row, column, page))
        {
            grid[row][column][page] = TRIED;  // this cell has been tried

            if (row == grid.length-1 && column == grid[0].length-1)
                done = true;  // the maze is solved
            else
            {
                done = traverse (row+1, column, page);     // down
                if (!done)
                    done = traverse (row, column+1, page);  // right
                if (!done)
                    done = traverse (row-1, column, page);  // up
                if (!done)
                    done = traverse (row, column-1, page);  // left
                if (!done)
                    done = traverse (row, column, page-1);
                if (!done)
                    done = traverse (row, column, page+1);
                //System.out.println() print the array
            }

            if (done)  // this location is part of the final path
                grid[row][column][page] = PATH;
            //System.out.println()  print the array
        }

        return done;
    }

    //-----------------------------------------------------------------
    //  Determines if a specific location is valid.
    //-----------------------------------------------------------------
    private boolean valid (int row, int column, int page)
    {
        boolean result = false;

        // check if cell is in the bounds of the matrix
        if (row >= 0 && row < grid.length &&
        column >= 0 && column < grid[row].length &&
        page >= 0 && page < grid[row][column].length)

        //  check if cell is not blocked and not previously tried
            if (grid[row][column][page] == 1)
                result = true;

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns the maze as a string.
    //-----------------------------------------------------------------
    public String toString ()
    {
        String result = "\n";

        for (int row=0; row < grid.length; row++)
        {
            for (int column=0; column < grid[row].length; column++)

                for (int page = 0; page <grid[column].length; page++)

                    result += grid[row][column][page] + "";
            result += "\n";
        }
     return result;
    }

}
