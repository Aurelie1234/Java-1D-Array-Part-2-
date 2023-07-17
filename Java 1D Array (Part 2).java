public class Solution {
  
    public static boolean canWin(int leap, int[] game) {
       return canWin(leap, game, 0);
   }


   public static boolean canWin(int leap, int[] game,int i) {
       // Return true if you can win the game; otherwise, return false.
           if (i >= game.length) {
           return true;
       } else if (i < 0 || game[i] == 1) {
           return false;
       }
      
       game[i] = 1;
      
       return canWin(leap, game, i + leap) ||
              canWin(leap, game, i + 1) ||
              canWin(leap, game, i - 1);
      
   }
