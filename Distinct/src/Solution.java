public class Solution {
    public static int solution(int[] A){
        int result = 0; // counter starts at 0

        for (int i = 0; i < A.length; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (A[i] == A[j]){
                    break; // if the number is equal to any that has been already checked, its repeated and should'nt count
                }
            }
            if(i == j){ // but if its unique until this point, count it as a new number
                result++;
            }
        }
        return result;
    }
}