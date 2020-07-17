public class Solution {
    public static int solution(int[] A){

        boolean[] paired_indexes = new boolean[A.length]; // array that uses indexes to check which numbers where already paired

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                //compares every position, except with itself or a position that already has been checked as paired
                if(A[i] == A[j] && i!=j && !paired_indexes[i] && !paired_indexes[j]){
                    paired_indexes[i] = true;
                    paired_indexes[j] = true;
                    break;   //skips to next loop
                }
                if(j==A.length-1 && !paired_indexes[i]){
                    return A[i]; //returns the unpaired element
                }
            }
        }
        return -999;   // returns a negative number, in case every number is paired with another
    }
}