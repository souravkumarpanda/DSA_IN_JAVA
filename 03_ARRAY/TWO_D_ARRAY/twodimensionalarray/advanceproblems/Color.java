package TWO_D_ARRAY.twodimensionalarray.advanceproblems;

import java.util.Scanner;
public class Color{
    public void solution(int [][]ar,int r,int c,int x,int y,int nc,int oc){
        if(x<0 || y<0 || x>=r || y>=c)  return;
        if(ar[x][y] != oc) return;
        if(ar[x][y] == nc) return;
        ar[x][y] = nc;
        solution(ar,r,c,x,y-1,nc,oc);
        solution(ar,r,c,x,y+1,nc,oc);
        solution(ar,r,c,x-1,y,nc,oc);
        solution(ar,r,c,x+1,y,nc,oc);
    }
    public void print(int [][]ar,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Color ob = new Color();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ar[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int newc = sc.nextInt();
        int oldc = ar[x][y];
        System.out.println("Before:");ob.print(ar,r,c);
        ob.solution(ar,r,c,x,y,newc,oldc);
        System.out.println("After:");ob.print(ar,r,c);
    }
}