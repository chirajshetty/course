public class Question_44 {
    public static void main(String args[]){
        int[][] arr = new int[2][4];
        arr[0] = new int[] {1,2,3,4};
        arr[1] = new int[] {2,4};
        for (int[] a: arr){
            for(int i: a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
