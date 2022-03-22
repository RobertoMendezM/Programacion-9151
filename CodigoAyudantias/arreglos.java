import java.util.Arrays;
public class arreglos {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1};
        System.out.println(Arrays.toString(arr));
        int variable = arr[2];
        int tamanio = arr.length;

        arr[0] = 4; 
        arr[2] = 20;
        arr[3] = arr[3] * 7;
        arr[3] = arr[3] * 7;
        
        String arr2[] = new String[6];
        for (String str : arr2) {
            System.out.println(str);
        }
        System.out.println("#########################");
        for (int i = 0; i <= arr2.length; i++) {

            arr2[i] = arr2[i] + " :)";
            System.out.println(i + arr2[i]);
        }

        System.out.println(Arrays.toString(arr2));






    }
}
