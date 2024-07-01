public class ChairCount {
        public int minimumChairs(String s) {
            int n=s.length();
            int count=0,max=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='E'){
                    count++;
                }
                else{
                    count--;
                }
                max=Math.max(count,max);
            }
            return max;
        }
    
    public static void main(String[] args){
        ChairCount cc = new ChairCount();
        String s = "ELEELEELLL";
        // int count = 1;
        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i) == 'E'){
        //         sb.append(s.charAt(i));
        //         if(sb.length()>1){
        //             count++;
        //         }
                
        //     }
        //     else{
        //         sb.deleteCharAt(sb.length()-1);
        //     }
        // }
        System.out.println("chair count: " + cc.minimumChairs(s));
    }
}
    

