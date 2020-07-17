public class Solution {
    public static int solution(int N, int M){
        int position = 0;    // where we are in the circle
        int[] chocolates = new int[N];  // circle of chocolates
        int qnt_eaten = 0;    // how many we have eaten

        for (int i = 0; i < N; i++) {  // fills the list with 1, to represent a chocolate
            chocolates[i] = 1;
        }

        while(chocolates[position] != 0){   //while we are not in a 0 (empty wrapper),
            //System.out.println("pos:"+position); // prints all eaten positions
            chocolates[position] = 0;  // we eat the chocolate in our position
            qnt_eaten+=1;              // count that we ate one more
            position = (position+M)%N; // and go to the next position according to the formula
        }

        return qnt_eaten;     // return how many chocolates we ate
    }
}