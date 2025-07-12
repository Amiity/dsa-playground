package ArrayEasy;

public class MoveZeroToEnd {
    public static void main(String[] args) {

        int[]  arr = {0,1,0,3,12};

        int pointer = 0;

        for(int i = 0 ; i < arr.length-1; i++){
            if (arr[i] != 0){
                int temp = arr[pointer];
                arr[pointer] =  arr[i];
                arr[i] = temp;
                pointer++;
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }

    }
}
