package array;

public class ArrayAlphabet {

    public static void main(String[] args) {

        char[] arr = new char[26];

        for (int i=0; i<arr.length; i++) {
            arr[i] = (char)('A' + i);
            System.out.println(arr[i]);
        }

    }
}
