import java.util.Scanner;
public class ELEVENTH_PATTERN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c1=1,c2=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1){
                    System.out.print(c1+" ");c1+=2;
                }else{
                    System.out.print(c2+" ");c2+=2;
                }
            }
            System.out.println();
        }
    }
}

//        1
//        2 4
//        3 5 7
//        6 8 10 12
//        9 11 13 15 17
//        14 16 18 20 22 24