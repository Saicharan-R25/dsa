import java.util.HashMap;

public class q6 {
    /*
     * LONGEST SUBARRAY/SUBSTRING WITH K DISTINCT ELEMENTS 
     * in previous q5. we have come accross fruite basket which as only 2 types of baskets 
     * and we are req. to find longest sub array for 2 distinct nums. 
     * what if instead of two it was 3 or any k value we cant create basket value and basket counter for each element 
     * 
     * intution 
     * we create a hash map of length k 
     * if the hashmap crosses the length > k then we need to reduce the left most element 
     * 
     */

     public static void main(String[] args) {
        int[] arr={1,2,1,2,1,2,1,3}; int k =2;
        int l=0; int r=0; int maxlen=0;
        HashMap<Integer,Integer> temp=new HashMap<>();
        while (r<=arr.length-1) {

            if(temp.containsKey(arr[r])){
                    temp.put(arr[r], temp.get(arr[r])+1);
                }else{
                    temp.put(arr[r],1);
                }
            if(temp.size()>k){
                temp.put(arr[l], temp.get(arr[l])-1);
                
               if(temp.get(arr[l])==0){
                temp.remove(arr[l]);
               }
               l++;
            }
            
                int sum =0;
                for(int i:temp.values()){
                    sum+=i;
                }
                maxlen=Math.max(maxlen,sum);
                r++;
            
            
        }
        System.out.println(maxlen);
}

}
