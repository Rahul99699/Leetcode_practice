import java.util.Scanner;
class Init{
int[][]arr;
int v;
Init(int v){
    this.v=v;
    arr=new int[v+1][v+1];
}
void edge(int v,int u){
    arr[u][v]=1;
    arr[v][u]=1;
}
void print(){
    for(int i=1;i<=v;i++){
        for(int j=1;j<=v;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();   
    }
}
}
class graph{
    public static void main(String[] args){
int v=5;
Init in= new Init(v);
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
    int a=sc.nextInt();
    int b=sc.nextInt();
    in.edge(a,b);
}
in.print();


    }
}