class Solution {
    
    class Substring{
        int num;
        String s;
        
        public Substring( int num, String s){
           this.num = num;
           this.s = s;
        }        
    }
    
    public String decodeString(String s) {
        Deque<Substring> stack = new ArrayDeque<>();
        Substring root = new Substring(1,"");
        stack.addLast(root);
        
        int i = 0;
        int count = 0;
        
        //遍历字符串
        while(i< s.length()){
            
            
            //当char是数字时
            if(Character.isDigit(s.charAt(i))){
                while(Character.isDigit(s.charAt(i))){
                    count = count*10 + (s.charAt(i) - '0');
                    i++;  
                }
            } 
            //当char是 [ 时
            else if(s.charAt(i) == ('[')){
                Substring subUnit = new Substring(count,"");
                count = 0;
                stack.addLast(subUnit);
                i++;
            }
            
            //当char是 ] 时
            else if(s.charAt(i) == (']')){
                
                Substring temp = stack.removeLast();
                String evaluated ="";
                
                for(int a = 0; a < temp.num; a++){
                    evaluated += temp.s;
                }
                
                Substring top = stack.peekLast();
                top.s += evaluated;
                
                i++;
            }
            
            //当char是字母时
            else{
               Substring top = stack.peekLast();
                top.s = top.s + s.charAt(i) ;
                i++;
            }
        }
        
        return root.s;
    }
}