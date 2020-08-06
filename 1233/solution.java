
class Solution {
public List<String> removeSubfolders(String[] folder) {
       ArrayList<String> ans = new ArrayList<>();
        Arrays.sort(folder);
        for (String f : folder){
            if (ans.isEmpty() || !f.startsWith(ans.get(ans.size()-1) + '/')) //  need '/' to ensure a parent.
                ans.add(f);
        }
            
        return ans;
    }
}