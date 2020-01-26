class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new ArrayList<>();
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s : paths){
            String[] path = s.split(" ");
            for(int i = 1; i < path.length; i ++){
                String [] file_name = path[i].split("\\(");
                file_name[1] =  file_name[1].replace(")","");
                if(!map.containsKey(file_name[1])) map.put(file_name[1], new ArrayList<String>());
                (map.get(file_name[1])).add(path[0]+"/"+file_name[0]);
            }
        }
      
        
        for(String key:map.keySet()){
            if(map.get(key).size() > 1)
            res.add(map.get(key));
        }

       
        return res;
        
    }
}