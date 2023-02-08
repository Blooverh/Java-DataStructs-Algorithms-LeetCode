package Blind75;
/*Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water. 
*/

/*Example: 
 * Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
 */
public class Lt200 {
    public static void main(String[] args) {
        
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        //goes throght entire matrix
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') { //if cell at position i,j is character 1
                    count++; //counter of islands increase
                    clearRestOfLand(grid, i, j); //call clear rest of land method which is suppose to clear chars "1" to "0" and continue exploring matrix
                }
            }
        }
        return count;
    }
    
    //this method is meant to only clear the cells of the islands from 1 to 0 so when backtracking we dont count those cells again
    private void clearRestOfLand(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') return; //for out of bounds in the matrix or i,j have value 0 return nothing
        
        grid[i][j] = '0'; // position at i,j where method was called in the above method turn it from 1 to 0
        //Clear the rest of the island in case more than the i,j cell at left, right, bottom, top have also the value of 1
        clearRestOfLand(grid, i+1, j); 
        clearRestOfLand(grid, i-1, j);
        clearRestOfLand(grid, i, j+1);
        clearRestOfLand(grid, i, j-1);
        return;
    }
}
