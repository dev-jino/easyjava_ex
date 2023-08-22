package chapter09Problem;

public class chapter09Problem07 {
  public static void main(String[] args) {
    Chatting chatting = new Chatting();
    chatting.startChat("홍길동");
  }
}

class Chatting {
  class Chat {
    void start() {}
    void sendMessage(String message) {}
  }

  void startChat(String chatId) {
//    String nickName = null;
//    nickName = chatId;
    String nickName = chatId;

    Chat chat = new Chat() {
      @Override
      void start() {
        while (true) {
          String inputData = "안녕하세요";
          String message = "[" + nickName + "]" + inputData;
          sendMessage(message);
          break;
        }
      }
    };

    chat.start();
  }
}