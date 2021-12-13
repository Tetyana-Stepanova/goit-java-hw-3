public class ATM {
   public int countBanknotes(int sum){
     int[] denomination = {500, 200, 100, 50, 20, 10, 5, 2, 1};
     int count = 0;
     int i = 0;
     while(sum > 0){
         while(denomination[i] <= sum){
           sum = sum -denomination[i];
           count++;
       }
       i++;
     }
     return count;
   }
}
