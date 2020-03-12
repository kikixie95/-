class Solution {
    public String pushDominoes(String dominoes) {
       dominoes = "L" + dominoes + "R";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0, j = 1; j < dominoes.length(); j++){
            if(dominoes.charAt(j) == '.') continue;
            int dotCount = j-i-1;
            if(i > 0) sb.append(dominoes.charAt(i));
            if(dominoes.charAt(i) == dominoes.charAt(j)) {
                while(dotCount >0){
                    sb.append(dominoes.charAt(i));
                    dotCount--;
                }
            }else if(dominoes.charAt(i) == 'L' && dominoes.charAt(j) == 'R'){
                 while(dotCount >0){
                    sb.append(".");
                    dotCount--;
                 }
                
            }else{
                     
                    for(int k = 1; k <= dotCount/2; k++){
                    sb.append("R");
                 }
                     if(dotCount % 2 != 0){
                         sb.append(".");
                     }
                     for(int k = 1; k <= dotCount/2; k++){
                    sb.append("L");
                 }
        }
       i = j;         
    }
        return sb.toString();
    }
    }
    
