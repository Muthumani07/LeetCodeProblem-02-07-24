class AvgOfSmallLarge {
    public double minimumAverage(int[] nums) {
         double[] arr = new double[nums.length / 2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        
    
        for (int i = 0, j = nums.length - 1; i < nums.length / 2; i++) {
            double num = (nums[i] + nums[j]) / 2.0;
            arr[i] = num;
            j--;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                }

            }
        }
      
        return arr[0];
    

        
    }
    public static void main(String [] args){
        AvgOfSmallLarge obj = new AvgOfSmallLarge();
        int [] nums = {7,8,3,4,15,13,4,1};
        System.out.println(obj.minimumAverage(nums));
        int [] num ={1,2,3,7,8,9};
        System.out.println(obj.minimumAverage(num));
        

    }
}