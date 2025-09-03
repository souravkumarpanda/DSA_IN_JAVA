public class DoorProblem {
    public static void PrintOpenDoors(int num){
        int i = 1;
        while (i*i <= num){
            System.out.println(i*i);
            i = i+1;
        }
    }

    public static void main(String[] args) {
        PrintOpenDoors(100);
    }
}
