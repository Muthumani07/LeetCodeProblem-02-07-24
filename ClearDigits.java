class ClearDigit{


    public String toclearDigits(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                if(sb.length()>0 && Character.isLetter(sb.charAt(sb.length()-1))){
                    sb.deleteCharAt(sb.length()-1);
                }
                
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        ClearDigit cd = new ClearDigit();
        System.out.println(cd.toclearDigits("t2d2dd")); 
    }
}