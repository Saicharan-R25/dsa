/*From the given array you need to find the MAX SUM we can obtain from K CONSEQUITIVE elements.
arr=[-1,2,3,3,4,5,-1],k=4,
output=15 (We get this from the elements [3,3,4,5])
*/

//my 1st approach
class q1{
    public static void main(String[] args) {
        int arr[]={-1,2,3,3,4,5,-1}; int k=4;
        int s=0;
        int e=k-1;
        int sum=0;
        while(e<arr.length){
            int tempsum=0;
                for(int i=s;i<=e;i++){
                    tempsum+=arr[i];
                }
            sum=Math.max(sum, tempsum);
            s++;e++;
        }
        System.out.println(sum);
    }
}