import java.util.ArrayList;
class Edge{
    int v;
    ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

    Edge(int v){
        this.v=v;
        arr=new ArrayList<>();
    }

    for(int i=0;i<v;i++){
        arr.add(new ArrayList<>());
    }
    void edge(int u,int v){
        arr.get(u).add(v);
        arr.get(v).add(u);
    }

boolean DFS(int s,int d,boolean[] visited){
    if(s==d){
        return true;
    }
   
    visited[s]=true;
   
    for(int i:arr.get(s)){
        if(!visited[i]){
            if(DFS(i,d,visited)){
                visited
            }
        }
    }
}


}
public class dfs {
    public static void main(String[] args){
Edge ed=new Edge(4);
ed.add(0,3);
ed.add(1,8);
ed.add(3,4);


boolean [] visited =new visited[3];
ed.DFS(1,4,visited);
    }
}
