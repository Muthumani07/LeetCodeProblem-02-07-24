


class FindMaxiElementDivByThree{
    public static void main(String [] args){
        FindMaxiElementDivByThree obj = new FindMaxiElementDivByThree();
        int []nums = {1,2,3,4};



        System.out.println(obj.minimumOperations(nums)); //output - 3;
    }
    public int minimumOperations(int[] nums) {
        int operations = 0;
        
        for (int num : nums) {
            int remainder = num % 3;
            if (remainder != 0) {
                // Calculate the minimum operations to make it divisible by 3
                operations += Math.min(remainder, 3 - remainder);
            }
        }
        
        return operations; 
    }
}
