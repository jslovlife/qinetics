package qinetic;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class QuestionFour {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int [] numSet = { 2, 3, 2};
        int targetValue = 7;
        boolean result = canSumFrom(targetValue,numSet);

        System.out.println(result);

    }

    private static boolean canSumFrom(int targetValue, int [] numbers){

        int total = 0;

        for(int i = 0;i<numbers.length;i++){
            total+=numbers[i];
        }

        if(targetValue == total){
            return true;
        }

        return false;
    }
}
