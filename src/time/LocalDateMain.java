package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        //날짜만 표현할 때 사용, 년, 월, 일
        LocalDate nowDate = LocalDate.now();
        //지정 날짜
        LocalDate ofDate = LocalDate.of(2013,11,21);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        //계산(불변), plusDays() : 특정 일을 더한다. 다양한 plusXxx() 메서드 존재
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜+10d = " + plusDays);
        //모든 날짜 클래스는 불변이다. 따라서 새로운 객체를 생성해서 반환하므로 반환값을 꼭 받아야 함
    }
}
