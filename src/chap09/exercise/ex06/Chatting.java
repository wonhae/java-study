package chap09.exercise.ex06;

public class Chatting {
	
	void startChat(String chatId) {
		String nickName = chatId;
		Chat chat = new Chat() {
			@Override
			void start() {
				while(true) {
					String inputData = "Hi";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
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
