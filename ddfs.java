import java.util.ArrayList;
class graph{
    int v;
    ArrayList<ArrayList<Integer>>arr;

    graph(int v){
        this.v=v;
        arr=new ArrayList<>();
        for(int i=0;i<v+1;i++){
            arr.add(new ArrayList<>());
        }
    }



    void edge(int u,int v){
arr.get(u).add(v);
arr.get(v).add(u);

    }
    void dip(){
        for(int i=0;i<=v;i++){
            System.out.print(i+"-->");

        
        for(int j:arr.get(i)){
            System.out.print(j);
            System.out.println();
        }
    }
    }
}
class ddfs{
    public static void main(String[] args){

        graph gr=new graph(5);

        gr.edge(1,5);
        gr.edge(2,5);
        gr.edge(1,4);
        gr.edge(3,2);
        gr.edge(4,5);
        gr.dip();
    } 
}