package exercicios;

public class exercicio014 {
    public static int[] minMax(int[] arr) {
        int max =arr[0];
        int min= arr[0];
        for(int i =0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int[] minMax= {min,max};
        return minMax;
    }
}
