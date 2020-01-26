## 思路

### 知识点：
- str.split()的两种用法： split(String regex,int limit) 和 split(String regex)； regex要用正则匹配写
- str.replace()可以直接写， 不用正则匹配，但用了也不错
- new一个hashmap<String, ArrayList<String>>

### 步骤
- 将原string array里的每个元素先用空格作为分隔符分割，新建一个string array,将分割后的每个元素放进去（str[0]为根目录，str[i]为每个文件名+内容）；继续将str[i]进行以左括号为分隔符进行分割；
- 以文件内容为key, directory_path/file_name.txt为value进行mapping
- **注意的点**若没有内容一致的文件，则返回空的list；所以在将map.get(key)往result里装时， check一下map.get(key).size()，若小于1，就不要装