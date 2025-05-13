class q2{

    /* this question is max sum we can get using K consequtive elements.
        but the condition is 
        you can pick elements from front or  back only (0->k or n-1 ->k(backwards))
        [6,2,3,4,7,2,1,7,1] = 6+2+3+4 (Allowed)
        [6,2,3,4,7,2,1,7,1] = 1+6+2+3 (Allowed) (indexes (8+0+1+1))
        [6,2,3,4,7,2,1,7,1] = 7+1+6+2 (Allowed) and 2+1+7+1 also allowed 
        [6,2,3,4,7,2,1,7,1] = 6+2+2+1 ( Not Allowed) indexed are (0,1,6,5) it must  consecutive 

     */

public static void main(String[] args) {
    int arr[]={6,2,3,4,7,2,1,7,1};
    int k=4; int maxsum=0;
    int leftSum=0;
    for(int i=0;i<=k-1;i++){
        leftSum+=arr[i];
    }
    int rightIndex=arr.length-1;
    for(int i=k-1;i>=0;i--){
       leftSum-=arr[i];
       leftSum+=arr[rightIndex];
       rightIndex--;
       maxsum=Math.max(maxsum, leftSum);
    }
    System.out.println(maxsum);
}
}