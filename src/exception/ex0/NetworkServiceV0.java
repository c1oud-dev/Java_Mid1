package exception.ex0;

public class NetworkServiceV0 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disConnect();
    }
}
/**
 * 실제로 외부 네트워크에 접속하는 코드는 없지만, 외부 네트워크와 접속한다고 가정하자.
 *
 * NetworkService는 복잡한 NetworkClient 사용 로직을 처리한다.
 */
