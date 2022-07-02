package qinetic;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Base64;

public class QuestionThree {

    public static void main(String[] args) throws UnsupportedEncodingException {
        method();
    }

    static void method() throws UnsupportedEncodingException {
        String strip = "***";
        strip = URLEncoder.encode(strip, "UTF-8");

        byte[] encodedByteArray = Base64.getEncoder().encode(strip.getBytes());
        String encodedString = new String(encodedByteArray, "UTF-8");
        System.out.println("Enc   >>  "+ encodedString);
        // Enc   >>  YXBwbGUlMjZvcmFuZ2U=
    }
}
