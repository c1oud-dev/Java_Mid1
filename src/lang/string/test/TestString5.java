package lang.string.test;

/**
 * str에는 파일의 이름과 확장자, ext에는 파일의 확장자
 * 파일명과 확장자를 분리해서 출력
 * indexOf()와 substring()을 사용
 */
public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        // 코드 작성
        int extIndex = str.indexOf(ext); //5
        String filename = str.substring(0, extIndex);
        String extName = str.substring(extIndex);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);

    }
}
