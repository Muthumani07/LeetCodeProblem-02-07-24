class CompleteCountDays {
        public int countCompleteDayPairs(int[] hours) {
            int count =0;
            for(int i =0; i<hours.length;i++){
                for(int j =0;j<hours.length;j++){
                    if(i!=j){
                        int num =hours[i]+hours[j];
                        if(num%24==0){
                            count++;
                           
                        }
                    }
                }
            }
    
            return count/2;
            
        }
    
    public static void main(String args[]){
        CompleteCountDays ccd = new CompleteCountDays();
        int[] hours = {1,24,48,60,72}; 
        int hours1[] = {9,24}; 
        int result = ccd.countCompleteDayPairs(hours);
        int result1 = ccd.countCompleteDayPairs(hours1);
        System.out.println("Number of complete day pairs: " + result); //output - 3;
        System.out.println("Number of complete day pairs: " + result1); //output - 0;
    }
}