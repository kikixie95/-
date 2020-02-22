import java.util.*;
class Test
{    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
  int max_value = 0;
  ArrayList<Integer> finalPath = null;

// 装/不装 （二叉树）
  // public void backpack(int[] weight, int[] value, int curWeight, int curVal, int position, int MaxWeight, ArrayList<Integer>path){
   
  //     if(position == weight.length){
  //       if(curWeight <= MaxWeight){
  //         if(curVal > max_value){
  //           max_value = curVal;
  //           finalPath = new ArrayList<>(path);
  //        }
  //       }
        
  //       return;
  //     }
  //     position++;
  //     backpack(weight,value,curWeight,curVal,position,MaxWeight,path);
  //     position--;

  //     if(curWeight + weight[position] <= MaxWeight){
  //       path.add(position);
  //       backpack(weight,value,curWeight+weight[position],curVal+value[position],position+1,MaxWeight,path);
  //       path.remove(path.size()-1);
  //     }
  //     return;
  

  // }
  // combination （ 多叉树）

  public void backpack(int[] weight, int[] value, int curWeight, int curVal, int position, int MaxWeight, ArrayList<Integer>path){

      if(position == weight.length){
        if(curWeight <= MaxWeight){
          if(curVal > max_value){
            max_value = curVal;
            finalPath = new ArrayList<>(path);
          }

        }
        return;
      }

      for (int i = position; i < weight.length; i++ ) {
        path.add(i);
        backpack(weight, value, curWeight+weight[i], curVal+value[i], i+1, MaxWeight,path);
        path.remove(path.size()-1);      
      }
  }








    public static void main(String args[]) 
    { 
      // HashMap<Integer, Integer> map1 = new HashMap<>();
      // map1.put(2, 3);
      // HashMap<HashMap, Integer> map2 = new HashMap<>();
      // map2.put(map1, 2);

      // System.out.println(map2.get(map1));
      Test test = new Test();
      // the weight of each item
    	int[] weight = new int[]{10,20,15,8};
      // the value of each item
      int[] value = new int[]{2,7,4,8};
      // the max weight of the backpack
      int MaxWeight = 29;

      test.backpack(weight,value,0,0,0,MaxWeight,new ArrayList<Integer>());

      System.out.println(test.finalPath);
      System.out.println(test.max_value);




      // ArrayList<Integer> res = new ArrayList<>();
      // for(int i = 0; i < arr.length; i++){
      //   res.add(arr[i]);
      // }
    	 // res = test.quicksort(res);
      // System.out.println(res);

    } 
}