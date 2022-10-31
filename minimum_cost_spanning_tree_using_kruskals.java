    
    package kruskals;

import java.util.*; 
public class Kruskals {

public int parent[] = new int[15]; public int cost[][] = new int[10][10]; public int mincost;

public void calc(int n)
{
int flag[] = new int[n+1];
int i,j,min=999,num_edges=1,a=1,b=1,minpos_i=1,minpos_j=1; parent[minpos_i]= 0;parent[minpos_j]= 0;

while(num_edges < n)
{

for(i=1 , min=999; i<=n; i++) for(j=1 ; j<=n; j++) if(this.cost[i][j] < min)

{
min = this. cost[i][j]; a = minpos_i = i;
b = minpos_j = j;
}

while(parent[minpos_i]!=0) minpos_i=parent[minpos_i];

while(parent[minpos_j]!=0) minpos_j=parent[minpos_j];

if(minpos_i!= minpos_j)
{
System.out.println("\t from Vertex \t"+a+"\t to Vertex \t"+b+"-mincost:"+min+" \n"); this.mincost=this.mincost+min;
num_edges=num_edges+1; this.parent[minpos_j]=minpos_i;
}
this.cost[a][b]=this.cost[b][a]=999;
}
 
System.out .println("MINIMUM COST SPANNING TREE (MCST)="+mincost);
}
public static void main(String[] args) { int nodes,i,j;
Scanner in = new Scanner(System.in); System.out.println("Enter the Number of Nodes \n"); nodes = in.nextInt ();
Kruskals k = new Kruskals();
System.out.println ("Enter the Cost Matrix Weights : \n"); for(i=1; i<=nodes; i++)
for(j=1; j<=nodes; j++)
{
k.cost[i][j] = in.nextInt();
if(k.cost[i][j] == 0)
k.cost[i][j] = 999;
}

k.calc(nodes);

}
}


  
