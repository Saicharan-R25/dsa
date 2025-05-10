class q2{

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