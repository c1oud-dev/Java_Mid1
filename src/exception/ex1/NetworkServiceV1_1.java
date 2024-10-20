package exception.ex1;

public class NetworkServiceV1_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); //추가

        client.connect();
        client.send(data);
        client.disConnect();
    }
}
/**
 * client.initError(data) : 사용자의 입력 값을 기반으로 오류를 활성화 한다.
 */