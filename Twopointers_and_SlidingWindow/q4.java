public class q4 {
    /*
     * max length of a subarray with 1's 
     * u can flip any K no. zeros to 1 in order to increase the 1's 
     */

     public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0}; int k=2;
        int l=0;int r=0;int z_c=0;
        int maxlen=0;
        while (r<=arr.length-1) {
            if(arr[r]==0){
                z_c++;
            }
            if (z_c>k) {
                if(arr[l]==0){
                    z_c--;
                }
                l++;
            }
            maxlen=Math.max(maxlen, r-l+1);
            r++;
        }
        System.out.println(maxlen);
     }
}
