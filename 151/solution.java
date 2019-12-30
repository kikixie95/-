 class Solution {
    public String reverseWords(String s) {
        
        String res = "";
        ArrayDeque<String> stack = new  ArrayDeque<>();
        
        int i = 0;
        s = s.trim();
        // 字符串中连续多个空格需要处理，比如  "zhang   ruochi", 需要转换成 "zhang ruochi"
        // " +" 是正则表达式，+ 表示前面的字符有一个或多个，这里表示一个和多个空格
        s = s.replaceAll(" +"," ");  
        
        while(i < s.length()){

            String str = "";
           
            // 避免 s.charAt(i) 因为 i 超过长度溢出，多加一个 i < s.length() 的判断
            //  '\0' 不表示空格字符，在 C 语言里面表示字符串结尾的特殊字符，Java 里面没有给字符串结果添加'\0'( 参考 https://blog.csdn.net/sszgg2006/article/details/49148189)
            while(i < s.length() && s.charAt(i) != ' '){
               str = str + String.valueOf(s.charAt(i));
               i++;
            }
            stack.addLast(str);
            i++;
        }
        
        int size = stack.size();
        for(int j = 0; j < size; j++){
            res = res + stack.removeLast() + " ";
        }
        //trim whitespaces
        res = res.trim();
        return res ;
    }
}
