## BFS 邻接表 无向图

```java

        class Test{
        public static void main(String[] args) {
            HashMap<String, String[]> my_map = new HashMap<>();
            my_map.put("a", new String[]{"d"});
            my_map.put("b", new String[]{"d"});
            my_map.put("c", new String[]{"b"});
            my_map.put("d", new String[]{"e"});
            my_map.put("e", new String[]{"c"});
            Graph g = new Graph(my_map);
            System.out.println(g.cycle());
            g.all_nodes();
            System.out.println("");
            g.all_edges();
            System.out.println(g.cycle());
        }
    }

```

```java

        class Graph{
        HashMap<Node, ArrayList<Node>> graph;
        Graph(HashMap<String, String[]> map){
            
            Node[] nodes = new Node[map.size()];
            int index = 0;
            HashMap<String, Node> tmp_table = new HashMap<>();
            for(Map.Entry< String, String[] > entry : map.entrySet()){
                nodes[index] = new Node(entry.getKey());
                tmp_table.put(entry.getKey(),nodes[index]);
                index ++;
            }
            this.graph = new HashMap<Node, ArrayList<Node>>();
            for(int i=0; i<map.size(); i++){
                graph.put(nodes[i],new ArrayList<Node>());
            } 
            for(Map.Entry< String, String[] > entry : map.entrySet()){
                String from = entry.getKey();
                String[] tos = entry.getValue();
                for(String to : tos)
                graph.get(tmp_table.get(from)).add(tmp_table.get(to));
            }
        }
        public Boolean DFS(Node root,HashSet<Node> visited ){
            visited.add(root);
            for(Node child : this.graph.get(root)){
                if(visited.contains(child)) return true;
                else 
                    return this.DFS(child, visited);
            }
            return false;
        }
        public Boolean cycle(){
            for(Node cur : this.graph.keySet()){
                HashSet<Node> visited = new HashSet<Node>();
                if(this.DFS(cur, visited))
                    return true;
            }
            return false;
        }
        public void all_edges(){
            for(Map.Entry< Node,ArrayList<Node> > entry : this.graph.entrySet()){
                for(Node n : entry.getValue()){
                    Node from = entry.getKey();
                    if(!from.data.equals(n.data))
                        System.out.print(entry.getKey() + " -> " + n + "\n");
                }
            }
        }
        public void all_nodes(){
            for(Node a : this.graph.keySet()){
                System.out.println(a);
            }
        }
        }
        class Node{
        String data;
        Node(String data){
            this.data = data;
        }
        public String toString() {
            return String.format("Node( name : %s )", this.data);
        }
        }
        
```