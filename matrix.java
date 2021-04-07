import java.io.*;
 
class main
{
      int matrix[][];
      int row, column;
      DataInputStream in = new DataInputStream(System.in);	
      public void create()
      {
            try
            {	
                  System.out.println("Number of rows :");
                  row = Integer.parseInt(in.readLine());
                  System.out.println("Number of columns :");
                  column = Integer.parseInt(in.readLine());
                  matrix = new int[row][column];
                  System.out.println("Enter the data :");
                  for(int i=0; i < row; i++)
                  {
                        for(int j=0; j < column; j++)
                        {
                              matrix[i][j] = in.readInt();
	       }
                  }
            }
            catch(Exception r) {}
      }
      public void display()
      {
            System.out.println("\nThe Matrix is :");
            for(int i=0; i < row; i++)
            {
                  for(int j=0; j < column; j++)
                  {
                        System.out.print("\t" + matrix[i][j]);
                   }
                   System.out.println();
             }
      }
}
 
class matrix
{
      public static void main(String args[])
      {
            main obj = new main();
            obj.create();
            obj.display();
      }
}