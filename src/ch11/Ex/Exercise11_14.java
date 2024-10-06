package ch11.Ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class Exercise11_14 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.");

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j <= cal.getActualMaximum(Calendar.DATE); j++) {
                cal.set(2010, i, j);
                if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY && cal.get(Calendar.WEEK_OF_MONTH) == 3) {
                    System.out.println(sdf.format(cal.getTime()));
                }
            }
        }
    }
}
