package HW4_arrays_files;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {


        Stack<Integer> score = new Stack<Integer>();
        score.push(1);
        score.push(2);
        score.push(3);
        score.push(4);
        score.push(5);

          System.out.println(score.pop()+"\n");

        while (!score.isEmpty()) {
            System.out.println(score.pop());
        }


    }


}
