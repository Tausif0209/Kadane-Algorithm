public class MaxCircularSubarraySum {
   public int maxSubarraySumCircular(int[] arr) {
        if(arr.length==1) return arr[0];
        int sum1=0,sum2=0,min=arr[0],max=arr[0],total=0;
        boolean flag=false;//to keep track if all the element are negative or not
        for(int el:arr){
            sum1=Math.max(sum1,0);
            sum1+=el;
            max=Math.max(sum1,max);
            sum2=Math.min(sum2,0);
            sum2+=el;
            min=Math.min(min,sum2);
            flag = flag || el>0; 
            total+=el;
        }   return (flag)?Math.max(max,total-min):max;
    }
}
