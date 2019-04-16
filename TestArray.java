package HW4_arrays_files;

public class TestArray {
    public static void main(String[] args) {

        int num[] = {1,2,3,4,5};
        String word[] = {"apple", "bee", "circle", "demon", "elephant"};

        System.out.println(num[1]+"\n");
        System.out.println(word[3]+"\n");

        for (int counter=0; counter<word.length; counter++) {
            System.out.println(word[counter]);
        }


    }
}
