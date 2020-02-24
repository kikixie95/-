// convert int to string

class Solution {
    public boolean isPalindrome(int x) {
       if(x < 0) return false;
        
        String s = Integer.toString(x);
        StringBuilder sR = new StringBuilder();
        sR.append(s);
        sR = sR.reverse();
       
      return s.equals(sR.toString());
  
    }
}



      // reverse half of the number
      class Solution {
//     public boolean isPalindrome(int x) {
//         ArrayDeque<Integer> deque = new ArrayDeque<>();
//         if(x < 0) return false;
//         int num = x;
//         while(num > 9 ){
//             deque.addLast(num % 10);
//             num = num/10;
//         }
//         deque.addLast(num);
        
//        int count = 0;
//         while(!deque.isEmpty()){
//             count = count *10 + deque.removeFirst();
//         }    
//         return x == count;
//     }
    public boolean isPalindrome(int x) {
       
        if(x<0 ||( x!=0 && x%10==0))
            return false;
  
        if(x>=0 && x<10)
            return true;
            
        int r = 0;
        while(x>r){
            r = r*10 +x%10;
            x=x/10;
        }
        return r==x || x==r/10;
    }
}