## 思路：
### 更新4.30 二分搜索的牛逼解法
我们并不用对每一行都做二分搜索法，我们注意到每列也是有序的，我们可以利用这个性质，从数组的左下角开始查找，如果比目标值小，我们就向右移一位，而且我们知道当前列的当前位置的上面所有的数字都小于目标值，那么 count += i+1，反之则向上移一位，这样我们也能算出count 的值

 - 将二维数组转成一维，然后sort，返回arr[k-1]；
 - 将二维数组第一排的数字全部放入heap，poll出一个，将这个数字的下一行同一列的数字放入heap中，重复k-1次；打印heap.poll()；

## 关于第二个思路，需要自定义一个数据类型，argument为 （数字，行，列）； heap的比较器需要自己规定（自定义数据类型没有默认的）；有三种方法：
- 方法一： 自定义数据类型class本身implements Comparable接口； 然后override compareTo方法；
- 方法二： 再定义一个comparator class, 这个class implements comparator<自定义数据类型>; 在这个class里写一个比较方法；
- 方法三： 直接在priorityQueue里定义lambda方法，和方法二一样

```java

import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
// A class to represent a student. 
class Student 
{ 
    int rollno; 
    String name, address; 
  
    // Constructor 
    public Student(int rollno, String name, 
                               String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.rollno + " " + this.name + 
                           " " + this.address; 
    } 


    public static void main (String[] args) 
    { 
        
        // ArrayList<Student> ar = new ArrayList<Student>(); 
        // ar.add(new Student(111, "bbbb", "london")); 
        // ar.add(new Student(131, "aaaa", "nyc")); 
        // ar.add(new Student(121, "cccc", "jaipur")); 
  
        // System.out.println("Unsorted"); 
        // for (int i=0; i<ar.size(); i++) 
        //     System.out.println(ar.get(i)); 


        // ArrayList<StudentComparable> ar = new ArrayList<StudentComparable>(); 
        // ar.add(new StudentComparable(111, "bbbb", "london")); 
        // ar.add(new StudentComparable(131, "aaaa", "nyc")); 
        // ar.add(new StudentComparable(121, "cccc", "jaipur")); 
  
        // System.out.println("Unsorted"); 
        // for (int i=0; i<ar.size(); i++) 
        //     System.out.println(ar.get(i));


        // Collections.sort(ar); 
  
        // System.out.println("\nSorted by name"); 
        // for (int i=0; i<ar.size(); i++) 
        //     System.out.println(ar.get(i));



         // using lambda

        // Collections.sort(ar, (a,b) -> {
        //             return a.rollno - b.rollno;
        // });

        // System.out.println("\nSorted by rollno"); 
        // for (int i=0; i<ar.size(); i++) 
        //     System.out.println(ar.get(i)); 
  
        // Collections.sort(ar, new Sortbyname()); 
  
        // System.out.println("\nSorted by name"); 
        // for (int i=0; i<ar.size(); i++) 
        //     System.out.println(ar.get(i)); 




        // build student Comparator

        ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student(111, "bbbb", "london")); 
        ar.add(new Student(131, "aaaa", "nyc")); 
        ar.add(new Student(121, "cccc", "jaipur")); 
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
        // Collections.sort(ar, new StudnetComparator()); 
  
        // System.out.println("\nSorted by rollno"); 
        // for (int i=0; i<ar.size(); i++) 
        //     System.out.println(ar.get(i)); 
  
        // Collections.sort(ar, new Sortbyname()); 
  
        // System.out.println("\nSorted by name"); 
        // for (int i=0; i<ar.size(); i++) 
        //     System.out.println(ar.get(i)); 
    } 
} 

class StudnetComparator implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) 
    { 
        return a.rollno - b.rollno; 
    } 
} 

class StudentComparable implements Comparable<StudentComparable>{

    int rollno; 
    String name, address; 
  
    // Constructor 
    public StudentComparable(int rollno, String name, 
                               String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    public int compareTo(StudentComparable other) 
    { 
        return this.rollno - other.rollno; 
    } 

        // Used to print student details in main() 
    public String toString() 
    { 
        return this.rollno + " " + this.name + 
                           " " + this.address; 
    } 

}

```