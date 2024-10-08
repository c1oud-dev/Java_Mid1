package nested.nested.ex2;

public class Network {
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
/**
 * NetworkMessage 클래스를 Network 클래스 안에 중첩해서 만들었다.
 * NetworkMessage의 접근 제어자를 private 설정
 * 따라서 외부에서 NetworkMessage에 접근할 수 없다.
 */
