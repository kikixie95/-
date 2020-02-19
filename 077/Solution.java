// M1
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
       //initiate an array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        helper(arr,k,0,new ArrayList<Integer>());
        return res;
        
    }
    public void helper(int[] arr, int k, int position, ArrayList<Integer> path){
        if(path.size() == k){
            res.add((ArrayList<Integer>)path.clone());
            return;
        }
        for(int i = position; i < arr.length; i++){
            path.add(arr[i]);
            helper(arr,k,i+1,path);
            path.remove(path.size()-1);
        }
        
    }
}

// M2
class Solution {
   
    public List<List<Integer>> combine(int n, int k) {
       //initiate an array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        List<List<Integer>> res = new ArrayList<>();
     return  helper(arr,k,0,new ArrayList<Integer>(),res);
      
        
    }
    public List<List<Integer>> helper(int[] arr, int k, int position, ArrayList<Integer> path, List<List<Integer>>res){
        
        if(path.size() == k){
            res.add((ArrayList<Integer>)path.clone());
            return res;
        }
        for(int i = position; i < arr.length; i++){
            path.add(arr[i]);
            helper(arr,k,i+1,path,res);
            path.remove(path.size()-1);
        }
        
      return res;  
    }
}