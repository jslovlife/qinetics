package qinetic;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionOne {

    public static void main(String[] args) throws UnsupportedEncodingException {
        List qOneArr = new ArrayList<>();
        method(qOneArr);

    }
    static void method(List qOneArr) {
        String stringSet = Constant.upperAlphabetSet + Constant.lowerAlphabetSet + Constant.numberSet;
        String[] strSetArr = stringSet.split("");

        StringBuffer strBuff = new StringBuffer();

        for (int k = 0; k < Constant.maxQty; k++) {
            for (int i = 0; i < Constant.maxArrSize; i++) {
                Random r = new Random();
                int randomNumber = r.nextInt(strSetArr.length);
                strBuff.append(strSetArr[randomNumber]);
                if (strBuff.length() > 10 || i == Constant.maxArrSize - 1) {
                    qOneArr.add(strBuff.toString());
                    strBuff.delete(0, strBuff.length() - 1);
                }
            }
        }
    }
}
