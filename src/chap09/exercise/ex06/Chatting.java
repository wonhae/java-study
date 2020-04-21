package chap09.exercise.ex06;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		Chat chat = new Chat() {
			@Override
			void start() {
				while(true) {
					String inputData = "Hi";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
			
			@Override
			void sendMessage(String message) {
				System.out.println("sendmessage Override 안해줘서 에러");
			}
		};
		chat.start();		
	}

	class Chat {
		void start() {
		}

		void sendMessage(String message) {
		}
	}
}
