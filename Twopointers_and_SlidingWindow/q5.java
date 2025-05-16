public class q5 {

    /*Fruite basket 
     * 
     * in this problem you are given 2 baskets and list of numbers. 
     * these numbers specify fruite types 
     * you can store only 2 types of fruites 
     * u can store only one type of fruite in a basket
     * our task is to find max consecutive fruites we can accumulate using 2 baskets or one basket(if only one type of fruite is present in the lsit)
     */
    public static void main(String[] args) {
        int arr[]={1,2,1,2,1,2,1,3};
        int l=0;int r=0;
        int b1_val=arr[0]; int b1_counter=0;
        int b2_val=-1; int b2_counter=0;
        int maxlen=0; int n=arr.length;

        while(r<=n-1){
            if(arr[r]!=b1_val && b2_val==-1){
                b2_val=arr[r];
                b2_counter=1;
                b1_counter=r-l;
                r++;
                break;
            }
            r++;
        }

        if(b2_counter==0){
            maxlen=n;
        }else{
            
            while (r<=n-1) {
                if (arr[r]==b1_val) {
                    b1_counter++;
                    r++;
                }
                else if(arr[r]==b2_val){
                    b2_counter++;
                    r++;
                }else{
                    b1_counter=0;
                    l=r-1;
                    if(arr[l]==b2_val) {
                        b1_counter++;
                        l--;
                    }
                    b1_val=b2_val;
                    b2_val=arr[r];
                    b2_counter=1;
                    r++;
                }

                maxlen=Math.max(maxlen, b1_counter+b2_counter);
            }


        }

        System.out.println(maxlen);
    }
}
