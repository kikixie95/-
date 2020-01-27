## 思路

### 这题用排序（nlogn), heap(nlogk),k很小的时候用快排的思路可以到常数时间

### 关于lambda comparator的知识： 

    //自定义排序器,默认写法
        /*Collections.sort(list, (item1, item2) -> item1.length() - item2.length()); //升序
        Collections.sort(list, (item1, item2) -> item2.length() - item1.length());   //降序
        System.out.println("list = " + list);*/
 
        //自定义排序器,Comparator写法
        /*Collections.sort(list, Comparator.comparingInt(str -> str.length()));                       //升序
        Collections.sort(list, Comparator.comparingInt(str -> str.length()).reversed());              //降序,会报错，因为编译器在这里无法推断str的类型为String，而是推断出事一个Objcet
        Collections.sort(list, Comparator.comparingInt((String str) -> str.length()).reversed());*/

### Heap 的java实现就是priorityQueue
- 默认小堆顶
- offer/poll后会重新排序

### HashMap的新知识点

**keySet()方法返回值是Map中key值的集合；entrySet()的返回值也是返回一个Set集合，此集合的类型为Map.Entry**

**Map.Entry是Map声明的一个内部接口，此接口为泛型，定义为Entry<K,V>它表示Map中的一个实体（一个key-value对）。接口中有getKey(),getValue方法。**

