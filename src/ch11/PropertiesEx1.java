package ch11;

import java.util.Enumeration;
import java.util.Properties;

class PropertiesEx1 {
    public static void main(String[] args) {
        // 출력되는 값의 값은 일치하지만 순서가 다르다.
        // 복습 필요
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        Enumeration e = prop.propertyNames();

        while(e.hasMoreElements()) {
            String element = (String)e.nextElement();
            System.out.println(element + "=" + prop.getProperty(element));
        }

        System.out.println();
        prop.setProperty("size", "20");
        System.out.println("size=" + prop.getProperty("size"));
        System.out.println("capacity=" + prop.getProperty("capacity","20"));
        System.out.println("loacfactor=" + prop.getProperty("loacfactor", "0.75"));
        System.out.println(prop);
        prop.list(System.out);
    }
}
