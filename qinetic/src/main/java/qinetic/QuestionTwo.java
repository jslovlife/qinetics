package qinetic;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionTwo {

    public static void main(String[] args) throws UnsupportedEncodingException {
        List qOneArr = new ArrayList<>();
        List qTwoArr = new ArrayList<>();
        QuestionOne.method(qOneArr);
        method(qOneArr,qTwoArr);
    }
   static void method(List qOneArr, List qTwoArr) {
        boolean alphaTurn = true;
        String alphaSets = Constant.lowerAlphabetSet;
        String[] alphaSetArr = alphaSets.split("");

        String numberSets = Constant.numberSet;
        String[] numberSetArr = numberSets.split("");

        Random r = new Random();
        int randomNumber = r.nextInt(numberSetArr.length);
        int randomNumber2 = r.nextInt(alphaSetArr.length);
        qTwoArr.add(numberSetArr[randomNumber]);

        for (int i = 0; i < Constant.maxQty; i++) {
            qTwoArr.add(qOneArr.get(i));
            if(qTwoArr.size() < 200) {
                if(alphaTurn) {
                    randomNumber = r.nextInt(alphaSetArr.length);
                    qTwoArr.add(alphaSetArr[randomNumber]);
                    alphaTurn = false;
                }else{
                    randomNumber2 = r.nextInt(numberSetArr.length);
                    qTwoArr.add(numberSetArr[randomNumber2]);
                    alphaTurn = true;
                }
            }
        }
    }
}
