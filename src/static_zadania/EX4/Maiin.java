package static_zadania.EX4;

public class Maiin {
    public static void main(String[] args) {
        signsCreator(new int[]{1, 2, 4, 5, 6, 7, 8});
    }

    public static char[] signsCreator(int[] cos){
        int length = cos.length;
        char[] arr = new char[length];
        for (int i = 0; i <length; i++) {
            arr[i] = (char) cos[i];
        }
        int z = 0;
        for (char c : arr) {
            System.out.println(arr[z]);
            z++;
        }

        return arr;
    }
}
