package ch11;

import java.util.HashSet;
import java.util.Set;

class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
        Set set = new HashSet();

        for(int i=0;i<objArr.length;i++) {
            set.add(objArr[i]);
        }
        // 원래 예제에서는 순서가 뒤죽박죽 섞여서 나온다고 했는데 그 이후에 HashSet 메서드가 수정된 듯 하다.
        // HashSet이 저장된 순서와 상관 없이 나온다고 하는데 순서대로 잘 나오고 있다.
        // 왜 순서대로 잘 나오는지 확인이 필요하다
        // 복습 필요
        System.out.println(set);
    }
}
