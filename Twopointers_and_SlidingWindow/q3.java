import java.util.Arrays;

/* longest substring/subarray with non repeating characters 
 * in this code we have done for subarray 
 * subsring -> any  consecutive part of string

 */

public class q3 {
    public static void main(String[] args) {
           
            //char[] arr={'c','a','d','b','f','a','b','c','d'}; //array or one single string
            char[] arr={'t','m','m','z','u','x','t'};
            int[] locations=new int[128];
            Arrays.fill(locations, -1);
            int l=0;
            int r=0;
            int maxlen=0;
            while(r<=arr.length-1){
                if(locations[arr[r]]>=l && locations[arr[r]]!=-1){
                    l=locations[arr[r]]+1;
                }
                else{
                    locations[arr[r]]=r;
                    maxlen=Math.max(maxlen, r-l+1);
                    r++;
                }
            }
            System.out.println(maxlen);

    }
}
