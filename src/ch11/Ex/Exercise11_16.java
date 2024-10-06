package ch11.Ex;

import java.util.StringTokenizer;

// 복습!!
class Exercise11_16 {
    public static void main(String[] args) {
        String source = "123,456,789.5";

        System.out.println("data :" + source);
        StringTokenizer st = new StringTokenizer(source,",");
        String combine = "";
        while (st.hasMoreTokens()) {
            combine += st.nextToken();
        }

        float d = Float.parseFloat(combine);

        String test = String.format("%f",d);

        System.out.println(d);
        System.out.println(test);

    }
}
