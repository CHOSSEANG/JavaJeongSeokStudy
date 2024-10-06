package ch11.Ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Exercise11_17 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        String pattern2 = "입력하신 날짜는 E요일입니다.";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner sc = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예:2007/05/11)");

        while (sc.hasNextLine()) {
            try {
                inDate = df.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요. (입력예:2007/05/11)");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);

        SimpleDateFormat sdf = new SimpleDateFormat(pattern2);

        System.out.println(sdf.format(cal.getTime()));
    }
}
