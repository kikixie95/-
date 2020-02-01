//DFS
class Solution {
    //图
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    // 遍历过的结点
    HashSet<Integer> visited = new HashSet<>();
    // 没被遍历过的结点
    HashSet<Integer> root_visited = new HashSet<>();
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        graph(prerequisites); 
        if(cycle()) return false;    
        else  return true;
        
                      
    }
    
    //画图
    public void graph(int[][]courses){
        for(int i = 0; i < courses.length; i ++){
            if(!map.containsKey(courses[i][0]))
               map.put(courses[i][0], new ArrayList<>()); 
    
            if(!map.containsKey(courses[i][1]))
               map.put(courses[i][1], new ArrayList<>());
            
            map.get(courses[i][0]).add(courses[i][1]);
        }
    }
        
    // DFS遍历图   
    public Boolean DFS( Integer root){
        this.visited.add(root);
        this.root_visited.add(root);
        
        for(int child : map.get(root)){    
            //如果visited中有这个结点，说明这个结点之前已经被遍历过了，这条path有环
            if(this.visited.contains(child) || this.DFS(child))  
                return true;
        }
        // 当前结点没有环，把这条结点从visited里去掉
        this.visited.remove(root);
        return false;
    }

    // 检查每条path有没有环
   public Boolean cycle(){
       //每个结点为root进行检查
       for(int root :map.keySet()){
           //作为某结点的child检查过的结点不必重复检查
         if (! root_visited.contains(root)){
             if(DFS(root))
                return true;
         }
        }
        return false;
   }
}

// Topological sort
class Solution {
 
    HashMap<Integer, ArrayList<Integer>> pair = new HashMap<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        return TopSort(prerequisites);
        
    }
    public Boolean TopSort(int[][] courses){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < courses.length; i++){
            if(!map.containsKey(courses[i][0])){
                map.put(courses[i][0],0);
            }
            if(!map.containsKey(courses[i][1])){
                map.put(courses[i][1],0);
               
            }
           
            map.put(courses[i][0],map.get(courses[i][0]) +1) ;
           
            if(!pair.containsKey(courses[i][1])){
                pair.put(courses[i][1],new ArrayList<Integer>());
            }
             if(!pair.containsKey(courses[i][0])){
                pair.put(courses[i][0],new ArrayList<Integer>());
            }
            
            pair.get(courses[i][1]).add(courses[i][0]);
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
      
        
        for(int key : map.keySet()){
            //入度为0的顶点
            if(map.get(key) == 0){
                queue.addLast(key);
                
            }
        }
        
        
        while(!queue.isEmpty()){    
            int key = queue.removeFirst(); 
            res.add(key);
            
          for(int child : pair.get(key)){
              map.put(child, map.get(child)-1);
              if(map.get(child) == 0)
                  queue.addLast(child); 
              
          }
        }
   
        if(res.size() !=(pair.keySet()).size()) return false;
        else return true;

    }
       
}
