class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set  = new HashSet<>();
       
        //遍历string[]
        for(String s: emails){
            // 遍历单个string
            int i = 0;
            String localName = "";
            while(s.charAt(i)< s.length() || s.charAt(i) != '@'){
                    
            if(s.charAt(i) == '.'){
                i++;
            }else if (s.charAt(i) == '+'){
                break;
            }else{
                localName += s.charAt(i);
                i++;
            }
                
        }
            int index = s.indexOf('@');
            String domainName = s.substring(index);
            set.add(localName + domainName);
            
        }
        return set.size();
       
    }
}
